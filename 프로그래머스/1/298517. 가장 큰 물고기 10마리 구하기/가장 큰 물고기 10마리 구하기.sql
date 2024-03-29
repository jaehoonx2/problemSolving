select id, length
  from FISH_INFO
where length > 10
order by length desc, id asc
limit 10;