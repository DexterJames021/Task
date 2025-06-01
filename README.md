# JAVA

---
# Banking App
[]()

### Demo Accounts
- dexter 123
- james 123

### Features:
- User Authentication Login
- Registration 
- withdraw
- deposit
- Transfer
- Transaction

### Tech Stack
- JAVA SE 17
- Spring framework
- Docker

### Entity
```sql
create table Account(
    id int(11) AUTO INCREMENT PRIMARY KEY,
    username VARCHAR(20),
    password VARCHAR(20),
    balance int(),
);

--Trasaction Has many account

create table Transaction(
    id int(11),
    account_id int(11), FK
    amount int(11),
    type VARCHAR(20),
    created_at timestamp(),
);
```
