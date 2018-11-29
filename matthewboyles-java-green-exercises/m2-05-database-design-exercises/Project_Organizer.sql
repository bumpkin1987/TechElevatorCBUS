SELECT name From park order by name asc; --  1st query


SELECT park_id, name FROM park WHERE park_id = ?;


select name, open_from_mm, open_to_mm, campground_id, daily_fee -- 2nd query --campground reservation info query
from campground
where park_id = ?;



select reservation.name, site.site_id, from_date, to_date, -- occupied sites with who they were given a time range
from reservation 
join site on site.site_id = reservation.site_id
join campground on campground_id = site.campground_id
where (to_date >= '2018-10-30') and (from_date <= '2018-11-05') and site.campground_id = 1; -- (select site_id from site where campground_id =1)-- way to see who will be stayin on any given dates at specified site


select name, location, establish_date, visitors, description -- 4th query-- park info screen shit
from park
where park_id = ?;


select site_number, max_occupancy, accessible, max_rv_length, utilities, (? ::date - ? ::date) * daily_fee 
from site
join campground on campground.campground_id = site.campground_id
where site.campground_id = ? and site_id not in 
(select distinct site.site_id 
from reservation 
where (from_date between ? and ?) 
or (to_date between ? and ?)  
limit 5;

---------------------------------------

Select distinct site.site_id, site.campground_id, site.site_number, site.max_occupancy, site.accessible, site.max_rv_length,
site.utilities, (? ::date - ? ::date) * c.daily_fee from site
join campground as c on site.campground_id = c.campground_id
where site.campground_id = 1
and site_id not in
(SELECT distinct s.site_id
FROM site as s
JOIN campground as c
ON s.campground_id=c.campground_id
JOIN reservation as r
ON s.site_id = r.site_id
WHERE (r.from_date between ? and ?)
OR (r.to_date between ? and ?)
)
LIMIT 5;

