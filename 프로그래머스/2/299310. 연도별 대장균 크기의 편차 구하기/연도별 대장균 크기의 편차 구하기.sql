select year(a.DIFFERENTIATION_DATE) as year,
       b.max_size - a.size_of_colony as year_dev,
       a.id
from ecoli_data a,
    (
        select year(DIFFERENTIATION_DATE) as year,
               max(SIZE_OF_COLONY) as max_size
          from ecoli_data
         group by year(DIFFERENTIATION_DATE)
    ) b
where year(a.DIFFERENTIATION_DATE) = b.year
order by year asc, year_dev asc;