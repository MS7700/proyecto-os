create table prestamo(
    estudianteid int,
    pagoid int,
    primary key(estudianteid, pagoid)
);
create table estudiante(
    estudianteid int primary key,
    matricula varchar(12),
    cedula varchar(10)
);
create table pago(
    pagoid int primary key,
    carrera varchar(50),
    periodo int,
    monto decimal
);

alter table prestamo ADD FOREIGN KEY (estudianteid) REFERENCES estudiante(estudianteid); 
alter table prestamo ADD FOREIGN KEY (pagoid) REFERENCES pago(pagoid); 

insert into estudiante values(1,'20190154','0112223334');
insert into estudiante values(2,'20190045','0112223335');
insert into estudiante values(3,'20190378','0112223336');
insert into estudiante values(4,'20192824','0112223337');
insert into estudiante values(5,'20180774','0112223338');

insert into pago values(1,'Ingenieria de Software',1,40000);
insert into pago values(2,'Ingenieria de Software',2,40000);
insert into pago values(3,'Ingenieria de Sistemas',1,30000);
insert into pago values(4,'Ingenieria de Sistemas',2,33000);
insert into pago values(5,'Ingenieria de Industrial',1,27000);
insert into pago values(6,'Ingenieria de Industrial',2,37000);

insert into prestamo values(1,1);
insert into prestamo values(1,2);
insert into prestamo values(2,3);
insert into prestamo values(2,4);
insert into prestamo values(3,5);
insert into prestamo values(3,6);
insert into prestamo values(4,1);
insert into prestamo values(4,2);
insert into prestamo values(5,3);
insert into prestamo values(5,4);
