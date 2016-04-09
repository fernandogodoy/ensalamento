create table PROFESSOR(
ID_PROFESSOR integer not null primary key,
NOME varchar(255),
CPF varchar(15),
RG varchar(15)
);

create table CURSO(
ID_CURSO integer not null primary key,
NOME varchar(255)
);

create table ANO_ATIVIDADE(
ID_ANO_ATIVIDADE integer not null primary key,
ANO integer,
SEMESTRE integer
);

create table MATERIA(
ID_MATERIA integer not null primary key,
ID_ANO_ATIVIDADE integer references ANO_ATIVIDADE (ID_ANO_ATIVIDADE),
NOME varchar(255)
);

create table TURMA(
ID_TURMA integer not null primary key,
ID_CURSO integer references CURSO (id_curso),
DESCRICAO varchar(255)
);

create table DISPONIBILIDADE_PROFESSOR(
ID_DISPONIBILIDADE integer not null primary key,
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
DIA_SEMANA enum('SEGUNDA','TERCA','QUARTA','QUINTA','SEXTA','SABADO')
);

create table PROFESSOR_MATERIA(
ID_PROFESSOR_MATERIA integer not null primary key,
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
ID_MATERIA integer references MATERIA (ID_MATERIA)
);

create table GRADE(
ID_GRADE integer not null primary key,
DIA_SEMANA enum('SEGUNDA','TERCA','QUARTA','QUINTA','SEXTA','SABADO'),
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
ID_MATERIA integer references MATERIA (ID_MATERIA),
ID_TURMA integer references TURMA(ID_TURMA)
);

create table MATERIA_CURSO(
ID_MATERIA_CURSO integer not null primary key,
ID_CURSO integer references CURSO (ID_CURSO),
ID_MATERIA integer references MATERIA (ID_MATERIA)
);


