CREATE DATABASE DB_Pregunta3;
USE DB_Pregunta3;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(50),
    pass VARCHAR(255),
    email VARCHAR(100),
    rol VARCHAR(50),
    estado BOOLEAN 
);

INSERT INTO usuario (codigo, pass, email, rol, estado) 
VALUES ('joselagos', '$78VKmxmWzXOksmcJ2Cjak9pARQskvkhiRp1psl2skaSkq7DcqK', 'joselagos@gmail.com', 'ADMIN', true);