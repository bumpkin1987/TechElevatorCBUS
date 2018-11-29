-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

select a.first_name, a.last_name, f.title
from film_actor as fa
join actor a
on a.actor_id = fa.actor_id
join film f
on f.film_id = fa.film_id
where a.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select a.first_name, a.last_name, f.title
from film_actor as fa
join actor a
on a.actor_id = fa.actor_id
join film f
on f.film_id = fa.film_id
where a.last_name = 'REYNOLDS';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select a.first_name, a.last_name, f.title
from film_actor as fa
join actor as a
on a.actor_id = fa.actor_id
join film as f
on f.film_id = fa.film_id
where a.last_name = 'DEAN';

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select film.title
from category
join film_category
on category.category_id = film_category.category_id
join film
on film.film_id = film_category.film_id
where name = 'Documentary';

-- 5. All of the ‘Comedy’ films
-- (58 rows)

select film.title
from category
join film_category
on category.category_id = film_category.category_id
join film
on film.film_id = film_category.film_id
where name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select film.title
from category
join film_category
on category.category_id = film_category.category_id
join film
on film.film_id = film_category.film_id
where name = 'Children' and film.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select film.title
from category
join film_category
on category.category_id = film_category.category_id
join film
on film.film_id = film_category.film_id
where name = 'Family' and film.rating = 'G' and film.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select a.first_name, a.last_name, f.title
from film_actor as fa
join actor a
on a.actor_id = fa.actor_id
join film f
on f.film_id = fa.film_id
where a.last_name = 'LEIGH' and f.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

select film.title, film.release_year
from category
join film_category
on category.category_id = film_category.category_id
join film
on film.film_id = film_category.film_id
where name = 'Sci-Fi' and film.release_year = '2006';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select actor.first_name, actor.last_name, film.title
from actor 

join film_actor 
on actor.actor_id = film_actor.actor_id 

join film 
on film_actor.film_id = film.film_id 

join film_category 
on film.film_id = film_category.film_id 

join category
on film_category.category_id = category.category_id

where actor.last_name = 'STALLONE' and category.name = 'Action';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select address, city, district, country
from country
join city
on country.country_id = city.country_id
join address
on city.city_id = address.city_id
join store
on address.address_id = store.address_id;


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select store.store_id, address, staff.first_name, staff.last_name
from address
join store
on address.address_id = store.address_id
join staff
on store.store_id = staff.store_id;


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

select customer.first_name, customer.last_name, count(customer.customer_id) as total
from customer
join rental
on customer.customer_id = rental.customer_id
group by customer.first_name, customer.last_name
order by total desc
limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)


--

select customer.first_name, customer.last_name, sum(payment.amount) as total
from customer
join rental
on customer.customer_id = rental.customer_id
join payment
on rental.rental_id = payment.rental_id
group by customer.first_name, customer.last_name
order by total desc
LIMIT 10;


-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals) go through store to inventory to rental id
select store.store_id, count(rental.rental_id)
from store
join inventory
on store.store_id = inventory.store_id
join rental
on inventory.inventory_id = rental.inventory_id
group by store.store_id;


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

select film.title, count(rental.rental_id)
from film
join inventory
on film.film_id = inventory.film_id
join rental
on inventory.inventory_id = rental.inventory_id
group by film.title
order by count desc
limit 10;
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

select c.name, count(r.rental_id) as number_of_rentals
from category as c
join film_category as fc
on c.category_id = fc.category_id
join film as f
on fc.film_id = f.film_id
join inventory as i
on i.film_id = f.film_id
join rental as r
on i.inventory_id = r.inventory_id
group by c.name
order by number_of_rentals desc
limit 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select f.title, count(r.rental_id) as number_of_rentals
from category as c
join film_category as fc
on c.category_id = fc.category_id
join film as f
on fc.film_id = f.film_id
join inventory as i
on i.film_id = f.film_id
join rental as r
on i.inventory_id = r.inventory_id
where c.name = 'Action'
group by f.title
order by number_of_rentals desc
limit 5;
-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
select a.first_name, a.last_name, count(r.rental_id) as number_of_rentals
from actor as a
join film_actor as fa
on a.actor_id = fa.actor_id
join film as f
on fa.film_id = f.film_id
join inventory as i
on i.film_id = f.film_id
join rental as r
on i.inventory_id = r.inventory_id
group by a.first_name, a.last_name
order by number_of_rentals desc
limit 10;
-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
select a.first_name, a.last_name, count(r.rental_id) as number_of_rentals
from actor as a
join film_actor as fa
on a.actor_id = fa.actor_id
join film as f
on fa.film_id = f.film_id
join film_category as fc
on f.film_id = fc.film_id
join category as c
on fc.category_id = c.category_id
join inventory as i
on i.film_id = f.film_id
join rental as r
on i.inventory_id = r.inventory_id
where c.name = 'Comedy'
group by a.first_name, a.last_name
order by number_of_rentals desc
limit 5;




