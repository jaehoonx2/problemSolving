select c.id, c.genotype, p.genotype as parent_genotype
  from ecoli_data c,
       ecoli_data p
 where 1=1
   and c.parent_id = p.id
   and p.genotype & c.genotype >= p.genotype
 order by c.id asc;