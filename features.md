# Banking App
- Gcash Alike Webapp

### Features:
- User Authentication Login
- security PIN
- Registration / SMS Verification
- Multiple Roles
    - Customer Dashboard
        - Check Balance
        - Cash In
        - Cash Transfer
        - Transaction
        - Generate Receipt
    - Admin Dashboard
        - Users Management

### Tech Stack
- JAVA SE 17
- Spring framework
- Vue.js 2 (CDN)
- MySQL
- JWT
- Docker

### Testing
- JUnit 5


### Object Oriented Design

### Database Design
``` sql

create database DebankApp;

create table Customer(
    id int(11) AUTO INCREMENT PRIMARY KEY ,
    firstName VARCHAR(20),
    lastName VARCHAR(20),
    email VARCHAR(20),
    phoneNumber int(12),
    dob Date(),
    gender VARCHAR(6),
);

-- Customer has only one Account

create table Account(
    id int(11) AUTO INCREMENT PRIMARY KEY,
    customer_id int(11),
    username VARCHAR(20),
    password VARCHAR(20),
    pin_number int(4),
    current_balance int(),
    created_at timestamp(),
    last_updated Date(),
);

--Trasaction Has many account

create table Transaction(
    id int(11),
    account_id int(11), FK
    amount int(11),
    type VARCHAR(20),
    generated_key int(11),
    created_at timestamp(),
);
```

## Tutorials 

### Dockerize Spring
https://youtu.be/3SNKdr3f9Io?si=Iky06-KysptbBxJ9
https://youtu.be/e3YERpG2rMs?si=p08p1XlJd5gGy08_

### Kotlin 
https://youtube.com/playlist?list=PLrzWQu7Ajpi2vZDT2eKCgJDu-EfJ7lTj_&si=I6sPlm6iF0gpPEI_

### Spring boot themelyft 
https://youtu.be/1qmcED2-FsY?si=qt8ZU7Hgzp_7-DQ2
