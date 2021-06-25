CREATE TABLE PUPIL(
       pupil_id NUMBER,
       first_name VARCHAR(30),
       last_name VARCHAR(30),
       gender VARCHAR(30),
       class_id VARCHAR(30),
       PRIMARY KEY (pupil_id)
);

CREATE TABLE TEACHER(
       teacher_id NUMBER,
       first_name VARCHAR(30),
       last_name VARCHAR(30),
       gender VARCHAR(30),
       subject VARCHAR(30),
       PRIMARY KEY (teacher_id)
);

CREATE TABLE PUPIL_TEACHER(
       pupil_teacher_id NUMBER,
       pupil_id NUMBER,
       teacher_id NUMBER
);

