
create schema courses;
use courses;

CREATE TABLE course(
	course_code VARCHAR(6) NOT NULL,
    course_name VARCHAR(255),
    PRIMARY KEY (course_code)
    );
    
create table section(
	id varchar(8) not null,
    course_code varchar(6),
    room_num smallint,
    instructor varchar(255),
    primary key(id),
    foreign key (course_code) references course(course_code)
    );
    
create table grade(
	id INT NOT NULL auto_increment,
    student_name VARCHAR(255),
    section_id varchar(8),
    score int,
    primary key (id),
    foreign key (section_id) references section(id)
);

insert into course values 
('CS101', 'Intro to Java'),
('CS103', 'Databases');

INSERT INTO section (id, course_code, room_num, instructor) VALUES
('CS101-A', 'CS101', 1802, 'Balderez'),
('CS101-B', 'CS101',  1650, 'Su'),
('CS103-A', 'CS103',  1200, 'Rojas'),
('CS103-B', 'CS103',  1208, 'Tonno');

INSERT INTO grade (student_name, section_id, score) VALUES
('Maya Charlotte', 'CS101-A', 98),
('James Fields', 'CS101-A', 82),
('Michael Alcocer', 'CS101-B', 65),
('Maya Charlotte', 'CS103-A', 89),
('Tomas Lacroix', 'CS101-A', 99),
('Sara Bisat', 'CS101-A', 87),
('James Fields', 'CS101-B', 46),
('Helena Sepulvida', 'CS103-A', 72);

SELECT * FROM grade;

SELECT student_name, score from grade;

-- Cuenta el número de estudiantes por section
select section_id, count(*) from grade group by section_id;
    
-- Muestra la nota media por sección
select section_id, avg(score) from grade group by section_id;

-- Filtrar datos con WHERE
select * from grade where student_name = 'Maya Charlotte';

-- Mostrar la nota media por sección siempre que la nota media sea mayor que x;
select section_id, avg(score) from grade group by section_id having avg(score) > 60;

-- Mostrar la suma de las notas, el conteo de las notas y la media de la seccion CS101-A
select section_id as 'Section ID', sum(score)  as 'Sum of scores', count(*), avg(score) from grade where section_id = 'CS101-A' group by section_id;

-- Like y operadores AND y OR
select * from grade where student_name LIKE '%arl%' OR section_id LIKE "%-A";

-- Rangos de números
select * from grade where score BETWEEN 70 AND 80;

-- Quiero ver todos los estudiantes
-- Ordenar con order by
-- Mostrar datos únicos: distinct
select distinct student_name from grade order by student_name DESC;


-- Mostrar nombre de estudiante, score, instructor

select g.student_name, g.score, s.instructor from grade g join section s on g.section_id = s.id;

select g.student_name, g.score, s.instructor from grade g join section s on g.section_id = s.id;

select g.student_name,
 c.course_code, c.course_name, s.room_num, s.instructor, g.score
from grade g 
join section s on g.section_id = s.id 
join course c on s.course_code = c.course_code where s.id = 'CS101-A' order by score desc;
