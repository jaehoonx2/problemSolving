select a.id, b.fish_name, a.length
 from fish_info a,
      fish_name_info b,
      (
        select fish_type, max(length) as length
          from fish_info a
         where 1=1
         group by fish_type      
      ) c
where 1=1
  and a.fish_type = b.fish_type
  and a.fish_type = c.fish_type
  and a.length = c.length
order by a.id asc;