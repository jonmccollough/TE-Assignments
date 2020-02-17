
create table employee (
        employee_number serial,
        job_title VARCHAR(100),
        last_name VARCHAR(100),
        first_name VARCHAR(100),
        gender VARCHAR(10),
        date_of_birth DATE,
        date_of_hire DATE,
        department_works_for VARCHAR(100),
        project_number INT,
        department_number INT,
        
        constraint pk_employee primary key (employee_number)
        
);

create table project (
        project_number serial,
        project_name VARCHAR(100),
        start_date DATE,
        number_of_project_employees INT NOT NULL,
        
        constraint pk_project primary key (project_number)
       
);

create table department (
        department_number serial,
        department_name VARCHAR(100),
        number_of_department_employees INT NOT NULL,
        
        constraint pk_department primary key (department_number) 
);

create table employee_project (
        employee_number INT NOT NULL,
        project_number INT NOT NULL
        
);

ALTER TABLE employee
ADD FOREIGN KEY (department_number) references department (department_number);

ALTER TABLE employee_project
ADD FOREIGN KEY (employee_number) references employee(employee_number),
ADD FOREIGN KEY (project_number) references project (project_number);
 


INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_works_for)
VALUES ('Chief Business Man', 'Adultman', 'Vincent', 'Male', '1970-01-01', '2020-02-02', 'Executive');

Insert INTO department (department_number, department_name, number_of_department_employees)
VALUES (1, 'Executive', 12);

Insert INTO department (department_number, department_name, number_of_department_employees)
VALUES (2, 'Transportation', 174);

Insert INTO department (department_number, department_name, number_of_department_employees)
VALUES (3, 'Produtction', 725);
        
INSERT INTO employee (job_title, last_name, first_name, gender, date_of_birth, date_of_hire, department_works_for)
VALUES ('Professional Angry Chef', 'Ramsay', 'Gordon', 'Male', '1966-10-08', '2002-04-21', 'Production'),
       ('Wolf of Wall Street', 'Belfort', 'Jordan', 'Male', '1962-07-09', '1990-09-20', 'Executive'),
       ('Distribution Manager', 'Escobar', 'Pablo', 'Male', '1949-12-01', '1962-4-20', 'Transportation'),
       ('Redistribution Coordinator', 'Parker', 'Bonnie', 'Female', '1910-10-01', '1932-06-07', 'Production'),
       ('Redistribution Coordinator', 'Barrow', 'Clyde', 'Male', '1909-03-24', '1932-06-07', 'Production'),
       ('Chief Chemist', 'White', 'Walter', 'Male', '1958-09-07', '2011-08-17', 'Production'),
       ('Supplier Relations Manager', 'Montana', 'Anthony', 'Male', '1956-03-05', '1985-08-11', 'Transportation');

INSERT INTO project (project_number, project_name, start_date, number_of_project_employees)
VALUES (1, 'Project Blue Book', '1960-01-01', '286'),
       (2, 'Operation Paper Clip', '1944-07-03', '345'),
       (3, 'Panama Canal Expansion', '1934-01-09', '432'),
       (4, 'Diamond Casino Development Project', '2019-07-28', '26'),
       (5, 'Statue of Liberty II: Boogaloo', '2020-02-01', '593');
       
INSERT INTO employee_project(employee_number, project_number)
VALUES (1, 1),
       (1, 2),
       (1, 4),
       (1, 3),
       (1, 5),
       (2, 1),
       (2, 4),
       (3, 2),
       (4, 4),
       (4, 5);
       
       
       
drop table employee cascade;
drop table project cascade;
drop table department cascade;
drop table employee_project cascade;