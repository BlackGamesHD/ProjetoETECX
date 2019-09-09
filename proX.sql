create database dbinfox;
use dbinfox;

create table tbusuario(
iduser int primary key,
usuario varchar(50) not null,
telefone varchar(15),
login varchar(20) not null unique,
senha varchar(20) not null
);

INSERT INTO tbusuario(iduser, usuario, telefone, login, senha) 
values (1, 'Administrador', '11987654321', 'admin', 'admin');

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
endcli varchar (100),
fonecli varchar (20) not null,
emailcli varchar(70)
);

create table tbos(
os int primary key auto_increment,
data_os timestamp default current_timestamp,
equipamento varchar(150) not null,
defeito varchar(150) not null,
servico varchar(150),
tecnico varchar(30),
valor decimal(10,2),
idcli int not null,
foreign key(idcli) references tbclientes(idcli)
);

 
 /*Adicionar uma coluna na tabela*/
 alter table tbusuario add column perfil varchar(20) not null;
 
 /*Atualiza os dados da coluna*/
update tbusuario set perfil='admin' where iduser=1