select route,
       concat(round(sum(d_between_dist),1), 'km') as TOTAL_DISTANCE,
       concat(round(avg(d_between_dist),2), 'km') as AVERAGE_DISTANCE
from SUBWAY_DISTANCE
group by line, route
order by round(sum(d_between_dist),1) desc;