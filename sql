CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
INSERT INTO customers VALUES
(1, 'Arun', 'Chennai'),
(2, 'Kumar', 'Coimbatore'),
(3, 'Priya', 'Madurai'),
(4, 'Siva', 'Salem');
INSERT INTO orders VALUES
(101, 1, 7000),
(102, 2, 4500),
(103, 3, 9000),
(104, 4, 3000),
(105, 1, 8000);
SELECT
    o.order_id AS "Order ID",
    c.customer_name AS "Customer Name",
    c.city AS "City",
    o.amount AS "Amount"
FROM orders o, customers c
WHERE o.customer_id = c.customer_id
  AND o.amount > 5000;

  CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);
drop table employee
CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    salary DECIMAL(10,2),
    FOREIGN KEY (dept_id) REFERENCES departments(dept_id)
);
INSERT INTO departments VALUES
(1, 'HR'),
(2, 'IT'),
(3, 'Finance'),
(4, 'Marketing');
  INSERT INTO employees VALUES
(101, 'Arun', 1, 35000),
(102, 'Kumar', 2, 40000),
(103, 'Priya', 1, 28000),
(104, 'Siva', 3, 50000),
(105, 'Rani', 1, 45000);
Select * from employee
WHERE e.dept_id = d.dept_id
  AND e.salary > 30000
  AND d.dept_name = 'HR';


  CREATE TABLE Orderes (
    order_id INT PRIMARY KEY,
    customer_id INT,
    amount DECIMAL(10,2)
);
INSERT INTO Orderes VALUES
(101, 1, 7000),
(102, 2, 4500),
(103, 3, 9000),
(104, 4, 3000),
(105, 1, 8000);
SELECT
    order_id AS "Order ID",
    customer_id AS "Customer ID",
    amount AS "Amount"
FROM orders
WHERE amount > (
    SELECT AVG(amount)
    FROM orders
);
SELECT AVG(amount) FROM orders;
(7000 + 4500 + 9000 + 3000 + 8000) / 5
= 6300
SELECT order_id, customer_id, amount
FROM orders
WHERE amount > 6300;
