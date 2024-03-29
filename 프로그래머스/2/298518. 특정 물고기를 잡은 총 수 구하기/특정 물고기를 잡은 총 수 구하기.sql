-- 코드를 작성해주세요
select count(*) as fish_count
from fish_info a,
     FISH_NAME_INFO b
where a.FISH_TYPE = b.FISH_TYPE
and b.fish_name in ('BASS', 'SNAPPER');