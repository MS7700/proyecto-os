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
