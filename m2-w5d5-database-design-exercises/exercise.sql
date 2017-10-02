BEGIN TRANSACTION;

CREATE TABLE employee (
        employee_id SERIAL,
        job_title VARCHAR(50) NOT NULL,
        last_name VARCHAR(50) NOT NULL,
        first_name VARCHAR(50) NOT NULL,
        gender VARCHAR(10) NOT NULL,
        birthday DATE,
        hiredate DATE,
        department_id INTEGER,
        CONSTRAINT pk_employee_employee_id PRIMARY KEY ( employee_id ),
        CONSTRAINT fk_department_id FOREIGN KEY ( department_id ) REFERENCES department(department_id)
        );

CREATE TABLE department (
        department_id SERIAL,
        department VARCHAR(100) NOT NULL,
        CONSTRAINT pk_department_department_id PRIMARY KEY ( department_id )
        );

CREATE TABLE project (
        project_id SERIAL,
        project VARCHAR(255) NOT NULL,
        start_date DATE,
        CONSTRAINT pk_project_project_id PRIMARY KEY ( project_id )
        );
        
CREATE TABLE employee_project (
        employee_id INTEGER,
        project_id INTEGER,
        CONSTRAINT pk_employee_project_employee_id_project_id PRIMARY KEY ( project_id, employee_id ),
        CONSTRAINT fk_employee_id FOREIGN KEY ( employee_id ) REFERENCES employee(employee_id),
        CONSTRAINT fk_project_id FOREIGN KEY ( project_id ) REFERENCES project(project_id)
        );

CREATE TABLE department_project (
        department_id INTEGER,
        project_id INTEGER,
        CONSTRAINT pk_department_project_department_id_project_id PRIMARY KEY ( department_id, project_id ),
        CONSTRAINT fk_department_id FOREIGN KEY ( department_id ) REFERENCES department(department_id),
        CONSTRAINT fk_project_id FOREIGN KEY ( project_id ) REFERENCES project(project_id)
        );
        
COMMIT;      
ROLLBACK;

DROP TABLE employee;
DROP TABLE employee_project;


INSERT INTO department (name) VALUES ('World Saving');
INSERT INTO department (name) VALUES ('Blowing Things Up');
INSERT INTO department (name) VALUES ('Hero Lineup');
INSERT INTO project (project, startdate) VALUES ('Captain America', '1/1/2017');
INSERT INTO project (project, startdate) VALUES ('Hulk', '1/1/2017');
INSERT INTO project (project, startdate) VALUES ('Wonder Woman', '1/1/2017');
INSERT INTO project (project, startdate) VALUES ('Thor', '1/1/2017');
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Captain America', 'Rogers', 'Steve', 'M', '3/1/1941', '3/2/1941', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Captain Marvel', 'Danvers', 'Carol', 'F', '3/1/1941', '3/2/1941', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Thor', 'Odenson', 'Thor', '3/1/1941', '3/2/1941', 1);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Black Widow', 'Romanova', 'Natasha', 'F', '3/1/1941', '3/2/1941', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Wonder Woman', 'Amazon', 'Diana', 'F', '3/1/1941', '3/2/1941', 2);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Iron Man', 'Stark', 'Tony', 'M', '3/1/1941', '3/2/1941', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Ant Man', 'Lang', 'Scott', 'M', '3/1/1941', '3/2/1941', 3);
INSERT INTO employee (job_title, last_name, first_name, gender, birthday, hiredate, department_id) VALUES ('Daredevil', 'Murdock', 'Matthew', 'M', '3/1/1941', '3/2/1941', 3);


