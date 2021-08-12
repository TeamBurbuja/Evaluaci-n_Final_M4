CREATE TABLE administrativo (
    id_admin        NUMBER(9) NOT NULL,
    admsuperior     VARCHAR2(20 CHAR) NOT NULL,
    admarea         VARCHAR2(20 CHAR) NOT NULL,
    admfuncion      VARCHAR2(20 CHAR) NOT NULL,
    admexperiencia  VARCHAR2(150 CHAR) NOT NULL,
    CONSTRAINT administrativo_pk PRIMARY KEY (id_admin) ENABLE
);

INSERT INTO administrativo VALUES
(1,'Nombre 1','Área 1','Función 1','Experiencia 1');

INSERT INTO administrativo VALUES
(2,'Nombre 2','Área 2','Función 2','Experiencia 2');

INSERT INTO administrativo VALUES
(3,'Nombre 3','Área 3','Función 3','Experiencia 3');

INSERT INTO administrativo VALUES
(4,'Nombre 4','Área 4','Función 4','Experiencia 4');

INSERT INTO administrativo VALUES
(5,'Nombre 5','Área 5','Función 5','Experiencia 5');

INSERT INTO administrativo VALUES
(6,'Nombre 6','Área 6','Función 6','Experiencia 6');

INSERT INTO administrativo VALUES
(7,'Nombre 7','Área 7','Función 7','Experiencia 7');

INSERT INTO administrativo VALUES
(8,'Nombre 8','Área 8','Función 8','Experiencia 8');

INSERT INTO administrativo VALUES
(8,'Nombre 9','Área 9','Función 9','Experiencia 9');

INSERT INTO administrativo VALUES
(10,'Nombre 10','Área 10','Función 10','Experiencia 10');


SELECT id_admin, admsuperior, admarea, admexperiencia, admfuncion FROM administrativo;


DROP TABLE administrativo;