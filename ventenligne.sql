create database ventenligne;
use venteligne;

create table profil(

	idProfil int(3) not null auto_increment,
	mail varchar(100),
	nom varchar(50),
	prenom varchar(50),
	mdp varchar(50),
	droits varchar(50),
	adresse varchar(50),
	primary key(idProfil)

);

insert into profil values (null, "admin@gmail.com","admin Nom", "admin Prenom", "123", "tout","rue de paris"),
	(null, "user@gmail.com","user Nom", "user Prenom", "123", "0-0-1","rue de lyon");


create table client(

	idClient int(3) not null auto_increment,
	nom varchar(50),
	prenom varchar(50),
	mail varchar(50),
	adresse varchar(50),
	primary key(idClient)
);

insert into client values("","ben","oka","oka@gmail.com","rue de paris, limoges"),
	("","Edwina","serine","edw@gmail.com","rue de lyon, paris"),
	("","kamar","elie","kamar@gmail.com","rue de lille, Lyon");