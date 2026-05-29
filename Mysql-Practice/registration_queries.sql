CREATE TABLE Registration (
   registration_id INT PRIMARY KEY,
   user_id INT,
   event_id INT,
   registration_date DATE NOT NULL,
   FOREIGN KEY (user_id) REFERENCES Users(user_id),
   FOREIGN KEY (event_id) REFERENCES Events(event_id)
);
INSERT INTO Registration (registration_id, user_id, event_id, registration_date)
VALUES
(1, 1, 101, '2026-05-20'),
(2, 2, 102, '2026-05-21'),
(3, 3, 103, '2026-05-22'),
(4, 4, 104, '2026-05-23'),
(5, 5, 105, '2026-05-24'),
(6, 6, 106, '2026-05-25');