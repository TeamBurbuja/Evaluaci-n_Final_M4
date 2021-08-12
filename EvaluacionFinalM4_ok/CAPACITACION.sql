CREATE TABLE capacitacion (
    id_capacitacion NUMBER(9) NOT NULL,
    rut_cliente     VARCHAR2(10 CHAR) NOT NULL,
    capdia          VARCHAR2(10 CHAR) NOT NULL,
    caphora         VARCHAR2(5 CHAR) NOT NULL,
    caplugar        VARCHAR2(20 CHAR) NOT NULL,
    capduracion     NUMBER(4),
    capasistentes   NUMBER(4),
    CONSTRAINT capacitacion_pk PRIMARY KEY (id_capacitacion) ENABLE
);

INSERT INTO capacitacion VALUES
(1, '771111111', 'Martes', '09:30', 'Providencia', 90, 25);

INSERT INTO capacitacion VALUES
(2, '772222222', 'Jueves', '11:30', 'Macul', 60, 15);

INSERT INTO capacitacion VALUES
(3, '773333333', 'Lunes', '09:00', 'Santiago', 90, 8);

INSERT INTO capacitacion VALUES
(4, '774444444', 'Viernes', '12:30', 'Las Condes', 120, 10);

INSERT INTO capacitacion VALUES
(5, '775555555', 'Lunes', '14:15', 'Quilicura', 40, 22);

INSERT INTO capacitacion VALUES
(6, '776666666', 'Lunes', '13:45', 'Renca', 180, 35);

INSERT INTO capacitacion VALUES
(7, '777777777', 'Miércoles', '10:30', 'Lampa', 90, 15);

INSERT INTO capacitacion VALUES
(8, '778888888', 'Viernes', '11:00', 'Batuco', 35, 13);

INSERT INTO capacitacion VALUES
(9, '779999999', 'Miércoles', '17:00', 'Cerrillos', 120, 27);

INSERT INTO capacitacion VALUES
(10, '781111111', 'Martes', '15:30', 'Maipú', 60, 45);

SELECT id_capacitacion, rut_cliente, capdia, caphora, caplugar, capduracion,
capasistentes FROM capacitacion;

DROP TABLE capacitacion;
