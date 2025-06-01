package com.example.bankapp.service;

import com.example.bankapp.model.Account;
import com.example.bankapp.model.Transaction;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class AccountService implements UserDetailsService {

    private final PasswordEncoder passwordEncoder;

    // Static data storage
    private static final List<Account> accounts = new ArrayList<>();
    private static final List<Transaction> transactions = new ArrayList<>();
    private static final AtomicLong accountIdCounter = new AtomicLong(1);
    private static final AtomicLong transactionIdCounter = new AtomicLong(1);

    public AccountService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        initializeDummyData();
    }

    // Initialize dummy data - ONLY ACCOUNTS, NO TRANSACTIONS
    private void initializeDummyData() {
        if (accounts.isEmpty()) {
            // Create demo accounts
            Account dexter = new Account();
            dexter.setId(1L);
            dexter.setUsername("dexter");
            dexter.setPassword(passwordEncoder.encode("123"));
            dexter.setBalance(new BigDecimal("0"));
            dexter.setTransactions(new ArrayList<>());
            accounts.add(dexter);

            Account james = new Account();
            james.setId(2L);
            james.setUsername("james");
            james.setPassword(passwordEncoder.encode("123"));
            james.setBalance(new BigDecimal("0"));
            james.setTransactions(new ArrayList<>());
            accounts.add(james);

            accountIdCounter.set(6);
            transactionIdCounter.set(1);

        }
    }

    public Account findAccountByUsername(String username) {
        return accounts.stream()
                .filter(account -> account.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public Optional<Account> findAccountByUsernameOptional(String username) {
        return accounts.stream()
                .filter(account -> account.getUsername().equals(username))
                .findFirst();
    }

    public Account registerAccount(String username, String password) {
        if (findAccountByUsernameOptional(username).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        Account account = new Account();
        account.setId(accountIdCounter.getAndIncrement());
        account.setUsername(username);
        account.setPassword(passwordEncoder.encode(password));
        account.setBalance(BigDecimal.ZERO); // New accounts start with $0
        account.setTransactions(new ArrayList<>());

        accounts.add(account);
        return account;
    }

    public void deposit(Account account, BigDecimal amount) {
        // Update balance
        account.setBalance(account.getBalance().add(amount));

        // Update the account in the list
        updateAccountInList(account);

        // Create transaction using constructor that matches your existing model
        Transaction transaction = new Transaction(amount, "Deposit", LocalDateTime.now(), account);
        transaction.setId(transactionIdCounter.getAndIncrement());

        transactions.add(transaction);
        account.getTransactions().add(transaction);
    }

    public void withdraw(Account account, BigDecimal amount) {
        if (account.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient funds");
        }

        // Update balance
        account.setBalance(account.getBalance().subtract(amount));

        // Update the account in the list
        updateAccountInList(account);

        // Create transaction using constructor that matches your existing model
        Transaction transaction = new Transaction(amount, "Withdrawal", LocalDateTime.now(), account);
        transaction.setId(transactionIdCounter.getAndIncrement());

        transactions.add(transaction);
        account.getTransactions().add(transaction);
    }

    public List<Transaction> getTransactionHistory(Account account) {
        return transactions.stream()
                .filter(transaction -> transaction.getAccount().getId().equals(account.getId()))
                .sorted((t1, t2) -> t2.getTimestamp().compareTo(t1.getTimestamp()))
                .toList();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = findAccountByUsernameOptional(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username or Password not found"));

        return new CustomUserDetails(account);
    }

    public Collection<? extends GrantedAuthority> authorities() {
        return Arrays.asList(new SimpleGrantedAuthority("USER"));
    }

    public void transferAmount(Account fromAccount, String toUsername, BigDecimal amount) {
        if (fromAccount.getBalance().compareTo(amount) < 0) {
            throw new RuntimeException("Insufficient funds");
        }

        Account toAccount = findAccountByUsernameOptional(toUsername)
                .orElseThrow(() -> new RuntimeException("Recipient account not found"));

        // Deduct from sender's account
        fromAccount.setBalance(fromAccount.getBalance().subtract(amount));
        updateAccountInList(fromAccount);

        // Add to recipient's account
        toAccount.setBalance(toAccount.getBalance().add(amount));
        updateAccountInList(toAccount);

        // Create transaction records for both accounts using constructor
        Transaction debitTransaction = new Transaction(
                amount,
                "Transfer Out to " + toAccount.getUsername(),
                LocalDateTime.now(),
                fromAccount
        );
        debitTransaction.setId(transactionIdCounter.getAndIncrement());
        transactions.add(debitTransaction);
        fromAccount.getTransactions().add(debitTransaction);

        Transaction creditTransaction = new Transaction(
                amount,
                "Transfer In from " + fromAccount.getUsername(),
                LocalDateTime.now(),
                toAccount
        );
        creditTransaction.setId(transactionIdCounter.getAndIncrement());
        transactions.add(creditTransaction);
        toAccount.getTransactions().add(creditTransaction);
    }

    // Helper method to update account in the static list
    private void updateAccountInList(Account updatedAccount) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getId().equals(updatedAccount.getId())) {
                accounts.set(i, updatedAccount);
                break;
            }
        }
    }

    // Get all accounts (for admin purposes)
    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    // Get account by ID
    public Account findAccountById(Long id) {
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    // Get all usernames for transfer dropdown
    public List<String> getAllUsernames() {
        return accounts.stream()
                .map(Account::getUsername)
                .sorted()
                .toList();
    }

    // Custom UserDetails implementation
    private static class CustomUserDetails implements UserDetails {
        private final Account account;

        public CustomUserDetails(Account account) {
            this.account = account;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return Arrays.asList(new SimpleGrantedAuthority("USER"));
        }

        @Override
        public String getPassword() {
            return account.getPassword();
        }

        @Override
        public String getUsername() {
            return account.getUsername();
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

        // Get the actual account object
        public Account getAccount() {
            return account;
        }
    }
}