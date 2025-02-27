--Lab Assignment 1: Database Schema - BankAccount Table

--Creating the BankAccount table with columns: account_id (Primary Key), account_holder_name, account_balance

mysql> create table BankAccount(
    -> account_id INT Primary key,
    -> account__holder_name VARCHAR(100) NOT NULL,
    -> account_balance DECIMAL(15,2) NOT NULL);
Query OK, 0 rows affected (0.66 sec)

mysql> desc BankAccount;
+----------------------+---------------+------+-----+---------+-------+
| Field                | Type          | Null | Key | Default | Extra |
+----------------------+---------------+------+-----+---------+-------+
| account_id           | int           | NO   | PRI | NULL    |       |
| account__holder_name | varchar(100)  | NO   |     | NULL    |       |
| account_balance      | decimal(15,2) | NO   |     | NULL    |       |
+----------------------+---------------+------+-----+---------+-------+
3 rows in set (0.14 sec)

--Task 1: Insert Data Write an SQL INSERT statement to insert data into the BankAccount table. 

mysql> insert into BankAccount (account_id, account__holder_name, account_balance) values (101, "Niharika", 50000),
    -> (102, "Ruchita", 25000),
    -> (103, "Muktai", 40000),
    -> (104, "Nitesh", 30000);
Query OK, 4 rows affected (0.12 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from BankAccount;
+------------+----------------------+-----------------+
| account_id | account__holder_name | account_balance |
+------------+----------------------+-----------------+
|        101 | Niharika             |        50000.00 |
|        102 | Ruchita              |        25000.00 |
|        103 | Muktai               |        40000.00 |
|        104 | Nitesh               |        30000.00 |
+------------+----------------------+-----------------+
4 rows in set (0.00 sec)

--Task 2: Retrieving Data Write an SQL SELECT statement to retrieve the account_holder_name and account_balance of all account holders from the BankAccount table. 

mysql> select account__holder_name, account_balance from BankAccount;
+----------------------+-----------------+
| account__holder_name | account_balance |
+----------------------+-----------------+
| Niharika             |        50000.00 |
| Ruchita              |        25000.00 |
| Muktai               |        40000.00 |
| Nitesh               |        30000.00 |
+----------------------+-----------------+
4 rows in set (0.00 sec)

--Task 3: Filtering Data Write an SQL SELECT statement to retrieve the account_holder_name and account_balance where the account_balance is more than 30,000. 

mysql> select account__holder_name, account_balance from BankAccount
    -> where account_balance > 30000;
+----------------------+-----------------+
| account__holder_name | account_balance |
+----------------------+-----------------+
| Niharika             |        50000.00 |
| Muktai               |        40000.00 |
+----------------------+-----------------+
2 rows in set (0.03 sec)

--Task 4: Updating Data Write an SQL UPDATE statement to change the account_balance of the account holder whose ID is 101. 

mysql> update BankAccount
    -> set account_balance = 60000
    -> where account_id = 101;
Query OK, 1 row affected (0.21 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from BankAccount;
+------------+----------------------+-----------------+
| account_id | account__holder_name | account_balance |
+------------+----------------------+-----------------+
|        101 | Niharika             |        60000.00 |
|        102 | Ruchita              |        25000.00 |
|        103 | Muktai               |        40000.00 |
|        104 | Nitesh               |        30000.00 |
+------------+----------------------+-----------------+
4 rows in set (0.00 sec)
