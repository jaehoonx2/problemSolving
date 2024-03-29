select a.id,
       (select count(*) from ecoli_data where parent_id = a.id) as child_count
from ecoli_data a
order by a.id asc;