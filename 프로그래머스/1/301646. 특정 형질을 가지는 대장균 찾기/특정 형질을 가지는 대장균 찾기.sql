select count(*) count
from ecoli_data
where (genotype & 1 > 0 or genotype & 4 > 0) and genotype & 2 = 0