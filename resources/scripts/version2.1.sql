create table PROFESSOR(
ID_PROFESSOR serial primary key,
NOME varchar(255),
CPF varchar(15),
RG varchar(15)
);

create table CURSO(
ID_CURSO serial primary key,
NOME varchar(255)
);

create table ANO_ATIVIDADE(
ID_ANO_ATIVIDADE serial primary key,
ANO integer,
SEMESTRE integer
);

create table MATERIA(
ID_MATERIA serial primary key,
ID_ANO_ATIVIDADE integer references ANO_ATIVIDADE (ID_ANO_ATIVIDADE),
NOME varchar(255)
);

create table TURMA(
ID_TURMA serial primary key,
ID_CURSO integer references CURSO (ID_CURSO),
DESCRICAO varchar(255)
);

create table DISPONIBILIDADE_PROFESSOR(
ID_DISPONIBILIDADE serial primary key,
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
DIA_SEMANA enum('SEGUNDA','TERCA','QUARTA','QUINTA','SEXTA','SABADO')
);

create table PROFESSOR_MATERIA(
ID_PROFESSOR_MATERIA serial primary key,
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
ID_MATERIA integer references MATERIA (ID_MATERIA)
);

create table GRADE(
ID_GRADE serial primary key,
DIA_SEMANA enum('SEGUNDA','TERCA','QUARTA','QUINTA','SEXTA','SABADO'),
ID_PROFESSOR integer references PROFESSOR (ID_PROFESSOR),
ID_MATERIA integer references MATERIA (ID_MATERIA),
ID_TURMA integer references TURMA(ID_TURMA)
);

create table MATERIA_CURSO(
ID_MATERIA_CURSO serial primary key,
ID_CURSO integer references CURSO (ID_CURSO),
ID_MATERIA integer references MATERIA (ID_MATERIA)
);


