select 
k.emp_no,
a.emp_name,
case
    when k.score >= 96 then 'S'
    when k.score >= 90 then 'A'
    when k.score >= 80 then 'B'
    else 'C'
end as grade,
case
    when k.score >= 96 then sal*0.2
    when k.score >= 90 then sal*0.15
    when k.score >= 80 then sal*0.1
    else 0
end as bonus
from
(
    select emp_no, year, avg(score) as score
    from hr_grade
    group by emp_no, year
) k,
hr_employees a
where k.emp_no = a.emp_no