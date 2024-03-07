select a.dept_id, b.dept_name_en, round(avg(a.sal),0) as avg_sal
from hr_employees a,
     hr_department b
where a.dept_id = b.dept_id
group by a.dept_id, b.dept_name_en
order by avg_sal desc;