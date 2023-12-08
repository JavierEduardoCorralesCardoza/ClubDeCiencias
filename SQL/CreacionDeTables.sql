DROP TABLE IF EXISTS Apoyos;
DROP TABLE IF EXISTS AlumnoPorProyecto;
DROP TABLE IF EXISTS AlumnoPorFeria;
DROP TABLE IF EXISTS ProyectoPorFeria;
DROP TABLE IF EXISTS Proyectos;
DROP TABLE IF EXISTS Ferias;
DROP TABLE IF EXISTS Asesores;
DROP TABLE IF EXISTS Alumnos;

CREATE TABLE Alumnos(
    CorreoAlumno VARCHAR(45) PRIMARY KEY,
    ContrasenaAlumno VARCHAR(45),
    NombreAlumno VARCHAR(45),
    ImagenAlumno VARCHAR(45)
);

CREATE TABLE Asesores(
    CorreoAsesor VARCHAR(45) PRIMARY KEY,
    ContrasenaAsesor VARCHAR(45),
    NombreAsesor VARCHAR(45),
    ImagenAsesor VARCHAR(45)
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
    IDAsesorProyecto VARCHAR(45),
    FOREIGN KEY(IDAsesorProyecto) REFERENCES Asesores(CorreoAsesor)
);

CREATE TABLE AlumnoPorProyecto(
    IDAlumnoProyecto VARCHAR(45),
    IDProyectoAlumno INT,
	FOREIGN KEY(IDAlumnoProyecto) REFERENCES Alumnos(CorreoAlumno),
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
	IDAlumnoFeria VARCHAR(45),
    IDFeriaAlumno INT,
    Premio VARCHAR(45) NULL,
    Patrocinador VARCHAR(45) NULL,
    ApoyoOtorgado INT NULL,
	FOREIGN KEY(IDAlumnoFeria) REFERENCES Alumnos(CorreoAlumno),
    FOREIGN KEY(IDFeriaAlumno) REFERENCES Ferias(IDFeria),
    PRIMARY KEY(IDAlumnoFeria, IDFeriaAlumno)
);

