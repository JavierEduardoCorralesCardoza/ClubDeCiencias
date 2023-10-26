DROP TABLE IF EXISTS AlumnoPorProyecto;
DROP TABLE IF EXISTS AlumnoPorFeria;
DROP TABLE IF EXISTS ProyectoPorFeria;
DROP TABLE IF EXISTS Apoyos;
DROP TABLE IF EXISTS Proyectos;
DROP TABLE IF EXISTS Ferias;
DROP TABLE IF EXISTS Asesores;
DROP TABLE IF EXISTS Alumnos;

CREATE TABLE Alumnos(
	IDAlumno INT PRIMARY KEY AUTO_INCREMENT,
    NombreAlumno VARCHAR(45)
);

CREATE TABLE Asesores(
	IDAsesor INT PRIMARY KEY AUTO_INCREMENT,
    NombreAsesor VARCHAR(45)
);

CREATE TABLE Ferias(
	IDFeria INT PRIMARY KEY AUTO_INCREMENT,
    NombreFeria VARCHAR(45),
    Fecha VARCHAR(45)
);

CREATE TABLE Proyectos(
	IDproyecto INT PRIMARY KEY AUTO_INCREMENT,
    NombreProyecto VARCHAR(45),
    Categoria VARCHAR(45),
    IDAsesorProyecto INT,
    FOREIGN KEY(IDAsesorProyecto) REFERENCES Asesores(IDAsesor)
);

CREATE TABLE AlumnoPorProyecto(
    IDAlumnoProyecto INT,
    IDProyectoAlumno INT,
	FOREIGN KEY(IDAlumnoProyecto) REFERENCES Alumnos(IDAlumno),
    FOREIGN KEY(IDProyectoAlumno) REFERENCES Proyectos(IDProyecto),
    PRIMARY KEY(IDAlumnoProyecto, IDProyectoAlumno)
);

CREATE TABLE ProyectoPorFeria(
    IDProyectoFeria INT,
    IDFeriaProyecto INT,
	FOREIGN KEY(IDProyectoFeria) REFERENCES Proyectos(IDProyecto),
    FOREIGN KEY(IDFeriaProyecto) REFERENCES Ferias(IDFeria),
    PRIMARY KEY(IDProyectoFeria, IDFeriaProyecto)
);

CREATE TABLE AlumnoPorFeria(
	IDAlumnoFeria INT,
    IDFeriaAlumno INT,
    Premio VARCHAR(45),
	FOREIGN KEY(IDAlumnoFeria) REFERENCES Alumnos(IDAlumno),
    FOREIGN KEY(IDFeriaAlumno) REFERENCES Ferias(IDFeria),
    PRIMARY KEY(IDAlumnoFeria, IDFeriaAlumno)
);

CREATE TABLE Apoyos(
	IDApoyo INT PRIMARY KEY AUTO_INCREMENT,
    Patrocinador VARCHAR(45),
    ApoyoOtorgado INT,
    IDAlumnoFeriaApoyo INT,
    IDFeriaAlumnoApoyo INT,
    FOREIGN KEY(IDAlumnoFeriaApoyo, IDFeriaAlumnoApoyo) REFERENCES AlumnoPorFeria(IDAlumnoFeria, IDFeriaAlumno)
);

