create table PC_Catalogo (
	catalogoId LONG not null primary key,
	title VARCHAR(75) null,
	image VARCHAR(75) null,
	description VARCHAR(75) null
);

create table PC_Tutorial (
	articleId LONG not null primary key,
	catalogoId LONG,
	title VARCHAR(75) null,
	image VARCHAR(75) null,
	description VARCHAR(75) null
);