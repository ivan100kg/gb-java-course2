-- Создайте таблицу студенты (students): id, имя, серия паспорта, номер паспорта;
-- Создайте таблицу Предметы (subjects): id, название предмета;
-- Создайте таблицу Успеваемость (progress): id, студент, предмет, оценка;
-- Оценка может находиться в пределах от 2 до 5;
-- Вывести список студентов, сдавших определенный предмет, на оценку выше 3;
-- При удалении студента из таблицы, вся его успеваемость тоже должна быть удалена;
-- Посчитать средний бал по определенному предмету;
-- Посчитать средний балл по определенному студенту;
-- Пара серия-номер пасорта должны быть уникальны в таблице Студенты;
-- Найти три премета, которые сдали наибольшее количество студентов;

Solve:
CREATE TABLE students (id SERIAL, name VARCHAR(15), series VARCHAR(4), number VARCHAR(6));
CREATE TABLE subjects (id SERIAL, name VARCHAR(30));
CREATE TABLE progress (id SERIAL, student VARCHAR(15), subject VARCHAR(30), mark INT);
ALTER TABLE progress ADD CHECK(mark BETWEEN 2 AND 5);
SELECT student FROM progress WHERE mark > 3;
ALTER TABLE students ADD PRIMARY KEY(id);
ALTER TABLE progress ALTER COLUMN student TYPE integer USING (student::integer);
ALTER TABLE progress ADD FOREIGN KEY (student) REFERENCES students (id) ON DELETE CASCADE;
SELECT subject, AVG(mark) FROM progress GROUP BY subject;
SELECT student, AVG(mark) FROM progress GROUP BY student;
ALTER TABLE students ADD UNIQUE(series, number);
SELECT subject, COUNT(student) FROM progress GROUP BY subject ORDER BY COUNT(student) DESC LIMIT 3;