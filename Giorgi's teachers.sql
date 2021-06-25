SELECT t.teacher_id, t.first_name, t.last_name FROM PUPIL_TEACHER pt
JOIN TEACHER t
ON t.teacher_id = pt.teacher_id
JOIN PUPIL p
ON p.pupil_id = pt.pupil_id
WHERE p.first_name = 'Giorgi'
