CREATE TABLE Sessions (
   session_id INT PRIMARY KEY,
   event_id INT,
   title VARCHAR(200) NOT NULL,
   speaker_name VARCHAR(100) NOT NULL,
   start_time DATETIME NOT NULL,
   end_time DATETIME NOT NULL,
   FOREIGN KEY (event_id) REFERENCES Events(event_id)
);
INSERT INTO Sessions (session_id, event_id, title, speaker_name, start_time, end_time)
VALUES
(1, 101, 'Opening Ceremony', 'Ravi Kumar', '2026-06-01 09:00:00', '2026-06-01 10:00:00'),
(2, 102, 'AI in Healthcare', 'Priya Sharma', '2026-06-05 11:00:00', '2026-06-05 12:30:00'),
(3, 103, 'Cloud Computing Basics', 'Anil Reddy', '2026-06-10 10:00:00', '2026-06-10 11:30:00'),
(4, 104, 'Cybersecurity Trends', 'Sneha Patel', '2026-06-15 02:00:00', '2026-06-15 03:30:00'),
(5, 105, 'Web Development Workshop', 'Kiran Rao', '2026-06-20 01:00:00', '2026-06-20 03:00:00'),
(6, 106, 'Closing Session', 'Megha Verma', '2026-06-25 04:00:00', '2026-06-25 05:00:00');