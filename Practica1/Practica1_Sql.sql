CREATE DATABASE pa2023;

USE pa2023;

DROP TABLE IF EXISTS Cliente;

CREATE TABLE Cliente(
	id INT AUTO_INCREMENT,
    Cedula VARCHAR(10),
    Nombres VARCHAR(80),
    Apellidos VARCHAR(80),
	primary key (id)
);