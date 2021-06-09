CREATE DATABASE PracticaII

USE PracticaII

        Create table nominaAPEC (
        
	periodo varchar(6) not null,
	sueldo_bruto decimal not null,
	cedula varchar(11) not null,
	tipo_moneda varchar(3) not null,

        PRIMARY KEY(periodo,cedula)
	);

        Create table nominaAPAP (
        
	RNC varchar(9) not null,
	periodo varchar(6) not null,
	sueldo_bruto decimal not null,
	cedula varchar(11) not null,
	tipo_moneda varchar(3) not null,
        PRIMARY KEY(periodo,cedula)
	);