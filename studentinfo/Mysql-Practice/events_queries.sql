CREATE TABLE Events (
   event_id INT NOT NULL PRIMARY KEY,
   title VARCHAR(200),
   description TEXT,
   city VARCHAR(100) NOT NULL,
   start_date DATETIME NOT NULL,
   end_date DATETIME,
   status ENUM('upcoming','completed','cancelled'),
   organized_id INT,
   CONSTRAINT fk_orgid FOREIGN KEY (organized_id)
   REFERENCES users(user_id)
);
INSERT INTO Events VALUES
(101, 'Tech Fest 2026', 'Annual technology festival', 'Hyderabad', '2026-06-10 10:00:00', '2026-06-10 18:00:00', 'upcoming', 1),

(102, 'AI Workshop', 'Hands-on AI and ML workshop', 'Bangalore', '2026-06-15 09:00:00', '2026-06-15 16:00:00', 'upcoming', 2),

(103, 'Coding Hackathon', '24-hour coding competition', 'Chennai', '2026-06-20 08:00:00', '2026-06-21 08:00:00', 'upcoming', 3),

(104, 'Startup Meetup', 'Entrepreneur networking event', 'Mumbai', '2026-05-01 11:00:00', '2026-05-01 15:00:00', 'completed', 4),

(105, 'Career Guidance', 'Placement preparation seminar', 'Delhi', '2026-04-25 10:00:00', '2026-04-25 13:00:00', 'completed', 5),

(106, 'Cloud Computing Bootcamp', 'Cloud concepts and deployment', 'Pune', '2026-06-25 09:00:00', '2026-06-25 17:00:00', 'upcoming', 6),

(107, 'Java Developer Meetup', 'Advanced Java discussions', 'Hyderabad', '2026-05-10 10:00:00', '2026-05-10 14:00:00', 'completed', 7),

(108, 'Web Development Workshop', 'HTML, CSS, JS training', 'Bangalore', '2026-06-05 09:30:00', '2026-06-05 16:30:00', 'upcoming', 8),

(109, 'Data Science Summit', 'Analytics and data trends', 'Chennai', '2026-07-01 10:00:00', '2026-07-01 17:00:00', 'upcoming', 9),

(110, 'Cyber Security Seminar', 'Security awareness session', 'Mumbai', '2026-03-15 11:00:00', '2026-03-15 14:00:00', 'cancelled', 10);