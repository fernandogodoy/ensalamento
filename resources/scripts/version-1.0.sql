create table professor(
id_professor integer not null primary key,
nome varchar(255),
cpf integer,
rg integer
)

create table materia (
id_materia integer not null primary key,
nome varchar(255)
)


create table preferencia_professor(
id_preferencia integer not null primary key,
id_professor integer not null references professor (id_professor),
preferencia_segunda boolean,
preferencia_terca boolean,
preferencia_quarta boolean,
preferencia_quinta boolean,
preferencia_sexta boolean
)

create table professor_materia(
id_professor integer not null references professor (id_professor),
id_materia integer not null references materia (id_materia)
)

create table materia_curso(
id_curso integer not null references curso (id_curso),
id_materia integer not null references materia (id_materia)
)

create table curso(
id_curso integer not null primary key,
nome varchar(255)
)

create table turma(
id_turma integer not null primary key,
id_curso integer not null references curso (id_curso),
descricao varchar(255)
)

create table grade(
id_grade integer not null primary key,
dia date,
id_professor integer not null references professor (id_professor),
id_materia integer not null references materia (id_materia),
id_turma integer not null references turma (id_turma)
)
