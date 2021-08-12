CREATE TABLE usuario (
    id_usuario      NUMBER(9) NOT NULL,
    usunombre       VARCHAR2(20 CHAR),
    usufechanac     VARCHAR2(20 CHAR),
    usurun          VARCHAR2(10 CHAR),
    usutipo         VARCHAR2(20 CHAR),
    CONSTRAINT usuario_pk PRIMARY KEY (id_usuario) ENABLE
);

INSERT INTO usuario VALUES
(1,'Nombre 1','11/11/2000','11111111-0','Administrativo');

INSERT INTO usuario VALUES
(2,'Nombre 2','11/11/2001','11111111-1','Cliente');

INSERT INTO usuario VALUES
(3,'Nombre 3','11/11/2002','11111111-2','Profesional');

INSERT INTO usuario VALUES
(4,'Nombre 4','11/11/2003','11111111-3','Administrativo');

INSERT INTO usuario VALUES
(5,'Nombre 5','11/11/2004','11111111-4','Cliente');

INSERT INTO usuario VALUES
(6,'Nombre 6','11/11/2005','11111111-5','Profesional');

INSERT INTO usuario VALUES
(7,'Nombre 7','11/11/2006','11111111-6','Administrativo');

INSERT INTO usuario VALUES
(8,'Nombre 8','11/11/2007','11111111-7','Cliente');

INSERT INTO usuario VALUES
(9,'Nombre 9','11/11/2008','11111111-8','Profesional');

INSERT INTO usuario VALUES
(10,'Nombre 10','11/11/2010','11111111-9','Administrativo');

SELECT id_usuario, usunombre, usufechanac, usurun, usutipo FROM usuario;

UPDATE  usuario
SET     usunombre = 'nombre', usufechanac = 'fecha', usurun = 'run', usutipo = 'tipo'
WHERE   usurun = '11111111-1';

DROP TABLE usuario;