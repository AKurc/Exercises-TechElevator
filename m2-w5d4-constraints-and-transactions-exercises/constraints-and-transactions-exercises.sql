-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
BEGIN TRANSACTION;

INSERT INTO actor (first_name, last_name)
VALUES ('Hampton', 'Avenue');

INSERT INTO actor (first_name, last_name)
VALUES ('Lisa', 'Byway');

SELECT * FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue';

ROLLBACK;

COMMIT;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
BEGIN TRANSACTION;

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT * FROM film WHERE title = 'Euclidean PI' AND description = 'The epic story of Euclid as a pizza delivery boy in ancient Greece';

ROLLBACK;

COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT actor.actor_id, actor.first_name, actor.last_name FROM actor ORDER BY actor.actor_id DESC;
SELECT * FROM film WHERE title = 'Euclidean PI';

BEGIN TRANSACTION;
ROLLBACK;

INSERT INTO film_actor (actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue'), (SELECT film_id FROM film WHERE title = 'Euclidean PI'));

INSERT INTO film_actor (actor_id, film_id)
VALUES ((SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway'), (SELECT film_id FROM film WHERE title = 'Euclidean PI'));
--INSERT INTO table-name (column-names)
--SELECT column-names 
--FROM table-name
--WHERE condition

--INSERT INTO film (actor.first_name, actor.last_name, actor.actor_id)
--VALUES ('Lisa','Byway', 202);
--INSERT INTO film_actor (actor_id, film_id)
--VALUES ((SELECT film.film_id FROM film WHERE title = 'Euclidean PI')(SELECT actor.actor_id FROM film WHERE title = 'Euclidean PI'));

--INSERT INTO film_actor (actor_id, film_id)
--VALUES ((SELECT film.film_id FROM film WHERE title = 'Euclidean PI')(SELECT actor.actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue'));


-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;
ROLLBACK;
INSERT INTO category (name) VALUES 'Mathmagical';

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
BEGIN TRANSACTION;
ROLLBACK;
INSERT INTO category (name) VALUES 
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
