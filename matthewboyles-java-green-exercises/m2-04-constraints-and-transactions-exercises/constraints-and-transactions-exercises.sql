-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

insert into actor values(201, 'HAMPTON', 'AVENUE');
insert into actor values(202, 'LISA', 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.
	
Insert into film (film_id, title, description, release_year, language_id, original_language_id, rental_duration, rental_rate,length, replacement_cost, rating)
Values ('1001', 'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', '1', null, '6', '0.99', '198', '20.99', 'PG');

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor values (201, 1001);
insert into film_actor (actor_id, film_id) values (202, 1001);

-- 4. Add Mathmagical to the category table.

insert into category values (17, 'Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

insert into film_category (film_id, category_id) values (1001, 17);
insert into film_category (film_id, category_id) values (274, 17);
insert into film_category (film_id, category_id) values (494, 17);
insert into film_category (film_id, category_id) values (714, 17); 
insert into film_category (film_id, category_id) values (996, 17);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

update film
set rating = 'G'
where film_id = 274;
update film
set rating = 'G'
where film_id = 1001;
update film
set rating = 'G'
where film_id = 494;
update film
set rating = 'G'
where film_id = 714;
update film
set rating = 'G'
where film_id = 996;

-- 7. Add a copy of "Euclidean PI" to all the stores.
--select * from inventory order by inventory_id desc limit 1;
insert into inventory (inventory_id, film_id, store_id) values (4581, 1001, 1);
insert into inventory (inventory_id, film_id, store_id) values (4582, 1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

Delete
from film
where title = 'EUCLIDEAN PI';

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

Delete
from category
where name = 'Mathmagical';
--ALSO DID NOT DELETE DUE TO FOREIGN KEY CONSTRAINT.

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)

Delete
from film_category
where category_id = 17;
--SUCCEEDED BECAUSE THERE WERE NO SPECIFIC FOREIGN KEY CONSTRAINTS.

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)

Delete
from category
where name = 'Mathmagical';
Delete
from film
where title = 'EUCLIDEAN PI';

--MATHMAGICAL DELETION WAS SUCCESS DUE TO NO FOREIGN KEY CONSTRAINTS,
--BUT EUCLIDEAN WAS NOT DELETED DUE TO FILM_ACTOR CONSTRAINTS, AS WELL AS INVENTORY FK CONSTRAINTS

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

--FILM_ACTOR CONSTRAINTS, AS WELL AS INVENTORY FK CONSTRAINTS

