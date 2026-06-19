CREATE TABLE users (
   user_id INT PRIMARY KEY,
   full_name VARCHAR(100) NOT NULL,
   email VARCHAR(100) UNIQUE NOT NULL,
   city VARCHAR(100) NOT NULL,
   registration_date DATE NOT NULL
);

INSERT INTO users VALUES 
(1, 'Sravani', 'reddysravani894@gmail.com', 'Hyderabad', '2026-04-16'),
(2, 'Rahul', 'rahul@gmail.com', 'Bangalore', '2026-04-17'),
(3, 'Priya', 'priya@gmail.com', 'Chennai', '2026-04-18'),
(4, 'Kiran', 'kiran@gmail.com', 'Mumbai', '2026-04-19'),
(5, 'Anjali', 'anjali@gmail.com', 'Delhi', '2026-04-20'),
(6, 'Vikram', 'vikram@gmail.com', 'Pune', '2026-04-21'),
(7, 'Akhil', 'akhil@gmail.com', 'Hyderabad', '2026-04-22'),
(8, 'Sneha', 'sneha@gmail.com', 'Bangalore', '2026-04-23'),
(9, 'Arjun', 'arjun@gmail.com', 'Chennai', '2026-04-24'),
(10, 'Meghana', 'meghana@gmail.com', 'Mumbai', '2026-04-25');

-- Display all users
SELECT * FROM users;

--  Display users sorted by registration date
SELECT * 
FROM users
ORDER BY registration_date;

-- Count number of users in each city
SELECT city, COUNT(*) AS total_users
FROM users
GROUP BY city;

-- Find cities having more than 5 users
SELECT city, COUNT(*) AS total_users
FROM users
GROUP BY city
HAVING COUNT(*) > 5;

-- Display users whose name starts with 'A'
SELECT *  
FROM users
WHERE full_name LIKE 'A%';

-- Find duplicate cities in the Users table
SELECT city, COUNT(*) AS total
FROM users
GROUP BY city
HAVING COUNT(*) > 1;

-- Display users registered on weekends
SELECT *
FROM users
WHERE DAYOFWEEK(registration_date) IN (1,7);

-- Find the oldest registered user
SELECT *
FROM users
ORDER BY registration_date ASC
LIMIT 1;

-- Display number of users registered each month
SELECT MONTH(registration_date) AS month,
       COUNT(*) AS total_users
FROM users
GROUP BY MONTH(registration_date);