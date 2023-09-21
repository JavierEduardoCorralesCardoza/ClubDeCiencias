DROP TABLE IF EXISTS AlumnoPorProyecto;
DROP TABLE IF EXISTS AlumnoPorFeria;
DROP TABLE IF EXISTS ProyectoPorFeria;
DROP TABLE IF EXISTS Apoyos;
DROP TABLE IF EXISTS Ferias;
DROP TABLE IF EXISTS Asesores;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Proyectos;
DROP TABLE IF EXISTS Usuarios;

CREATE TABLE Usuarios(
	IDUsuario INT PRIMARY KEY,
    Usuario VARCHAR(45),
    Contraseña VARCHAR(45)
);

CREATE TABLE Proyectos(
	IDproyecto INT PRIMARY KEY,
    Nombre VARCHAR(45),
    Categoria VARCHAR(45)
);

CREATE TABLE Alumnos(
	IDAlumno INT PRIMARY KEY,
    Nombre VARCHAR(45),
    IDUsuario INT,
    IDProyecto INT,
    FOREIGN KEY(IDUsuario) REFERENCES Usuarios(IDUsuario),
    FOREIGN KEY(IDProyecto) REFERENCES Proyectos(IDProyecto)
);

CREATE TABLE Asesores(
	IDAsesor INT PRIMARY KEY,
    Nombre VARCHAR(45),
    IDUsuario INT,
    IDProyecto INT,
    FOREIGN KEY(IDUsuario) REFERENCES Usuarios(IDUsuario),
    FOREIGN KEY(IDProyecto) REFERENCES Proyectos(IDProyecto)
);

CREATE TABLE Ferias(
	IDFeria INT PRIMARY KEY,
    Nombre VARCHAR(45),
    Fecha VARCHAR(45)
);

CREATE TABLE Apoyos(
	IDApoyo INT PRIMARY KEY,
    Patrocinador VARCHAR(45),
    ApoyoOtorgado VARCHAR(45)
);

CREATE TABLE AlumnoPorProyecto(
    IDAlumno INT,
    IDProyecto INT,
	FOREIGN KEY(IDAlumno) REFERENCES Alumnos(IDAlumno),
    FOREIGN KEY(IDProyecto) REFERENCES Proyectos(IDProyecto),
    PRIMARY KEY(IDAlumno, IDProyecto)
);

CREATE TABLE ProyectoPorFeria(
    IDProyecto INT,
    IDFeria INT,
	FOREIGN KEY(IDProyecto) REFERENCES Proyectos(IDProyecto),
    FOREIGN KEY(IDFeria) REFERENCES Ferias(IDFeria),
    PRIMARY KEY(IDProyecto, IDFeria)
);

CREATE TABLE AlumnoPorFeria(
	IDAlumno INT,
    IDFeria INT,
    IDApoyo INT,
    Premio VARCHAR(45),
	FOREIGN KEY(IDAlumno) REFERENCES Alumnos(IDAlumno),
    FOREIGN KEY(IDFeria) REFERENCES Ferias(IDFeria),
    FOREIGN KEY(IDApoyo) REFERENCES Apoyos(IDApoyo),
    PRIMARY KEY(IDAlumno, IDFeria)
);

