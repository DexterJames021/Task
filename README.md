# JAVA

## Deployed Banking App 
[Debank](https://java-lu7w.onrender.com/)

### Demo Accounts
- dexter 123
- james 123

### Features:
- Spring security user authentication login
- Registration 
- withdraw
- deposit
- Transfer
- Transaction

### Tech Stack
- JAVA SE17
- Spring framework
- Docker
- Render

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

---
[ACTIVITIES](https://github.com/DexterJames021/java/blob/main/activity.md)
