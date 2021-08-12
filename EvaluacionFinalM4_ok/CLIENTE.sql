CREATE TABLE cliente (
    rutempresa      VARCHAR2(10 CHAR) NOT NULL,
    clirazon        VARCHAR2(20 CHAR) NOT NULL,
    clidireccion    VARCHAR2(20 CHAR) NOT NULL,
    clicomuna       VARCHAR2(20 CHAR) NOT NULL,
    cliempleados    NUMBER(4) NOT NULL,
    clitelefono     VARCHAR2(20 CHAR) NOT NULL,
    CONSTRAINT cliente_pk PRIMARY KEY (rutempresa) ENABLE
);

INSERT INTO cliente VALUES
('77888888-0','Empresa 1','Dirección 1','Comuna 1','10','+56900000000');

INSERT INTO cliente VALUES
('77888888-1','Empresa 2','Dirección 2','Comuna 2','20','+56911111111');

INSERT INTO cliente VALUES
('77888888-2','Empresa 3','Dirección 3','Comuna 3','30','+56922222222');

INSERT INTO cliente VALUES
('77888888-3','Empresa 4','Dirección 4','Comuna 4','40','+56933333333');

INSERT INTO cliente VALUES
('77888888-4','Empresa 5','Dirección 5','Comuna 5','50','+56944444444');

INSERT INTO cliente VALUES
('77888888-5','Empresa 6','Dirección 6','Comuna 6','60','+56955555555');

INSERT INTO cliente VALUES
('77888888-6','Empresa 7','Dirección 7','Comuna 7','70','+56966666666');

INSERT INTO cliente VALUES
('77888888-7','Empresa 8','Dirección 8','Comuna 8','80','+56977777777');

INSERT INTO cliente VALUES
('77888888-8','Empresa 9','Dirección 9','Comuna 9','90','+56988888888');

INSERT INTO cliente VALUES
('77888888-9','Empresa 10','Dirección 10','Comuna 10','100','+56999999999');


SELECT rutempresa, clirazon, clidireccion, clicomuna, cliempleados, clitelefono FROM cliente;


DROP TABLE cliente;