DROP TABLE IF EXISTS TBL_EMPLOYEES;
CREATE TABLE TBL_EMPLOYEES(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL,
    email VARCHAR(250) DEFAULT NULL
);
INSERT INTO TBL_EMPLOYEES (first_name, last_name, email)
VALUES
('Julian', 'Morales', 'juliancmorales10@gmail.com'),
('Joaquin', 'Posada', 'joaco@gmail.com'),
('Francisco', 'Ortega', 'fco@hotmail.com'),
('Andrés', 'Alarcón', 'andres@gmail.com');