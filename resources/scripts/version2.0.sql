create table professor(
id_professor integer not null primary key,
nome varchar(255),
cpf integer,
rg integer)

create table curso(
id_curso integer not null primary key,
nome varchar(255))

create table ano_atividade(
id_ano_atividade integer not null primary key,
ano integer,
semestre integer)

create table materia(
id_materia integer not null primary key,
id_ano_atividade integer references ano_atividade (id_ano_atividade),
nome varchar(255))

create table turma(
id_turma integer not null primary key,
id_curso integer references curso (id_curso),
descricao varchar(255))

create table disponibilidade_professor(
id_disponibilidade integer not null primary key,
id_professor integer references professor (id_professor),
dia date)

create table professor_materia(
id_professor_materia integer not null primary key,
id_professor integer references professor (id_professor),
id_materia integer references materia (id_materia))

create table grade(
id_grade integer not null primary key,
dia date,
id_professor integer references professor (id_professor),
id_materia integer references materia (id_materia),
id_turma integer references turma(id_turma))

create table materia_curso(
id_materia_curso integer not null primary key,
id_curso integer references curso (id_curso),
id_materia integer references materia (id_materia))

