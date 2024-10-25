-- ============ CREATE ===============
CREATE DATABASE bptn;
CREATE TABLE "courses"(
"courseId" INT GENERATED ALWAYS AS IDENTITY,
"courseName" VARCHAR(120) NOT NULL,
CONSTRAINT "courses_pk" PRIMARY KEY ("courseId")
);
CREATE TABLE "students" (
"studentId" INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
"courseId" INT NOT NULL,
"studentName" VARCHAR(120) NOT NULL,
"studentEmail" VARCHAR(120) UNIQUE NOT NULL,
"studentPhone" VARCHAR(20),
FOREIGN KEY ("courseId")
REFERENCES courses("courseId")
ON UPDATE NO ACTION
ON DELETE NO ACTION
NOT VALID
);
"courses"
INSERT INTO "courses" ("courseName") VALUES
('Introduction to Computer Science'),
('Data Structures and Algorithms'),
('Database Management Systems'),
('Web Development Fundamentals'),
('Artificial Intelligence Basics'),
('Machine Learning Fundamentals'),
('Software Engineering Principles'),
('Computer Networks and Security'),
('Operating Systems Concepts'),
('Object-Oriented Programming'),
('Introduction to Python Programming'),
('Java Programming Essentials'),
('C++ Programming Fundamentals'),
('Data Analytics Techniques'),
('Information Retrieval Methods'),
('Mobile App Development'),
('Human-Computer Interaction'),
('Computer Graphics and Visualization'),
('Cloud Computing Technologies'),
('Big Data Analytics');
INSERT INTO "students" ("courseId", "studentName", "studentEmail", "studentPhone")
VALUES
(1, 'John Smith', 'john.smith@gmail.com', '4165551234'),
(1, 'Emily Johnson', 'emily.johnson@yahoo.com', '6475552345'),
(2, 'Michael Davis', 'michael.davis@hotmail.com', '9055553456'),
(2, 'Sophia Brown', 'sophia.brown@gmail.com', '+14165554567'),
(3, 'William Wilson', 'william.wilson@yahoo.com', '647-555-5678'),
(3, 'Olivia Taylor', 'olivia.taylor@hotmail.com', '9055556789'),
(4, 'James Anderson', 'james.anderson@gmail.com', '416-555-7890'),
(4, 'Ava Thomas', 'ava.thomas@yahoo.com', '6475558901'),

(5, 'Benjamin Martinez', 'benjamin.martinez@hotmail.com', '9055559012'),
(5, 'Mia Hernandez', 'mia.hernandez@gmail.com', '4165550123'),
(6, 'Daniel Lopez', 'daniel.lopez@yahoo.com', '6475551234'),
(6, 'Charlotte Clark', 'charlotte.clark@hotmail.com', '9055552345'),
(7, 'Joseph Lewis', 'joseph.lewis@gmail.com', '4165553456'),
(7, 'Amelia Lee', 'amelia.lee@yahoo.com', '6475554567'),
(8, 'David Walker', 'david.walker@hotmail.com', '9055555678'),
(8, 'Sofia Hall', 'sofia.hall@gmail.com', '4165556789'),
(9, 'Andrew Young', 'andrew.young@yahoo.com', '6475557890'),
(9, 'Harper Hernandez', 'harper.hernandez@hotmail.com', '9055558901'),
(10, 'Alexander King', 'alexander.king@gmail.com', '416-555-9012'),
(10, 'Abigail White', 'abigail.white@yahoo.com', '6475550123'),
(11, 'Ethan Hill', 'ethan.hill@hotmail.com', '9055551234'),
(11, 'Emily Adams', 'emily.adams@gmail.com', '4165552345'),
(12, 'James Wright', 'james.wright@yahoo.com', '6475553456'),
(13, 'Avery Scott', 'avery.scott@hotmail.com', '9055554567'),
(14, 'Logan Green', 'logan.green@gmail.com', '4165555678'),
(15, 'Ella Martinez', 'ella.martinez@yahoo.com', '6475556789'),
(16, 'Lucas Rodriguez', 'lucas.rodriguez@hotmail.com', '9055557890'),
(17, 'Scarlett Perez', 'scarlett.perez@gmail.com', '4165558901'),
(18, 'Henry Cooper', 'henry.cooper@yahoo.com', '6475559012'),
(19, 'Jane Smith', 'jane@gmail.com', NULL),
(5, 'Bob Wilson', 'bob@hotmail.com', NULL);

-- ============ READ ===============
SELECT (specify what you want) FROM (name of the table) WHERE (conditions)
SELECT * FROM courses;
SELECT * FROM students ORDER BY "studentId" DESC;
SELECT "studentName", "studentEmail", "studentPhone" FROM students;
SELECT "studentName", "studentEmail", "studentPhone" FROM students WHERE
"studentPhone" IS NULL;
SELECT * FROM students WHERE "studentId"=1;
SELECT * FROM students WHERE "studentId">4 OR "studentName"='John Smith';
SELECT * FROM students WHERE "courseId"=15 AND "studentName"='Ella Martinez';
SELECT * FROM students WHERE "courseId"=15 AND "studentName" LIKE '%Mar%';
SELECT * FROM students WHERE "courseId"=15 AND "studentName" LIKE 'El%';
SELECT * FROM students WHERE "courseId" != 4;

-- ============ UPDATE ===============
UPDATE (what you want to update) SET (new value) WHERE (condition);
UPDATE students SET "studentName"='John', "studentEmail"='john@hello.com' WHERE
"studentId"=1;

-- ============ DELETE ===============
DELETE FROM students WHERE "studentId"=1;