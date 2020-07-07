CREATE SCHEMA `centromedico` ;

CREATE TABLE `paciente` (
  `pacienteID` int(11) NOT NULL AUTO_INCREMENT,
  `Rut` varchar(45) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Genero` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pacienteID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1

SELECT * FROM centromedico.paciente;

INSERT INTO centromedico.paciente(Rut, Nombre, Edad, Genero) Values('123-1','Maria Pino Quezada', 44, 'F');
INSERT INTO centromedico.paciente(Rut, Nombre, Edad, Genero) Values('234-1','Juan Elgueta, Rojas', 23, 'M');
INSERT INTO centromedico.paciente(Rut, Nombre, Edad, Genero) Values('456-1','Fabiola Campos Arrue', 30, 'F');

CREATE TABLE `enfermedad` (
  `enfermedadID` int(11) NOT NULL AUTO_INCREMENT,
  `nombreEnfermedad` varchar(45) DEFAULT NULL,
  `tipoEnfermedad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`enfermedadID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=eucjpms

INSERT INTO centromedico.enfermedad(nombreEnfermedad, tipoEnfermedad) Values('Neumomia','Infecciosa');
INSERT INTO centromedico.enfermedad(nombreEnfermedad, tipoEnfermedad) Values('Hepatitis A','Infecciosa');
INSERT INTO centromedico.enfermedad(nombreEnfermedad, tipoEnfermedad) Values('Asma','No infecciosa');

SELECT * FROM centromedico.enfermedad;

