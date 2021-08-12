CREATE TABLE profesional (
    id_profesional  NUMBER(9) NOT NULL,
    proexperiencia  NUMBER(2) NOT NULL,
    prodepto        VARCHAR2(20 CHAR) NOT NULL,
    protitulo       VARCHAR2(20 CHAR) NOT NULL,
    profecha        VARCHAR2(20 CHAR) NOT NULL,
    CONSTRAINT profesional_pk PRIMARY KEY (id_profesional) ENABLE
);

INSERT INTO profesional VALUES
(1,10,'Depto 1','Título 1','11/11/2000');

INSERT INTO profesional VALUES
(2,20,'Depto 2','Título 2','11/11/2001');

INSERT INTO profesional VALUES
(3,30,'Depto 3','Título 3','11/11/2002');

INSERT INTO profesional VALUES
(4,40,'Depto 4','Título 4','11/11/2003');

INSERT INTO profesional VALUES
(5,50,'Depto 5','Título 5','11/11/2004');

INSERT INTO profesional VALUES
(6,60,'Depto 6','Título 6','11/11/2005');

INSERT INTO profesional VALUES
(7,70,'Depto 7','Título 7','11/11/2006');

INSERT INTO profesional VALUES
(8,80,'Depto 8','Título 8','11/11/2007');

INSERT INTO profesional VALUES
(9,90,'Depto 9','Título 9','11/11/2008');

INSERT INTO profesional VALUES
(10,100,'Depto 10','Título 10','11/11/2009');


SELECT id_profesional, proexperiencia, prodepto, protitulo, profecha FROM profesional;


DROP TABLE profesional;