-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (actor_id, first_name, last_name)
VALUES (201, 'HAMPTON', 'AVENUE'),
       (202, 'LISA', 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in
-- ancient Greece', 2008, 1, 198);
 
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (actor_id, film_id)
VALUES ( 201, 1001),
       (202, 1001);
       
DELETE FROM film
WHERE film_id = 1003;

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

UPDATE film_category(film_id, category_id)
SET (1001,17)

UPDATE film_category
SET category_id = 17
WHERE film_id IN (SELECT film_id FROM film WHERE title = 'EGG IGBY'); 

UPDATE film_category
SET category_id = 17
WHERE film_id IN (SELECT film_id FROM film WHERE title = 'KARATE MOON' OR title = 'RANDOM GO' OR title = 'YOUNG LANGUAGE'); 
       
SELECT * FROM film
WHERE title = 'EUCLIDEAN PI';

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film 
SET rating = 'G'
WHERE film_id IN (SELECT film_id FROM film_category WHERE category_id = 17 );


-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory(film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'), 1),
       ((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'), 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- < delete on table "film" violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor" is still referenced from table "film_actor" >
DELETE FROM film
WHERE film_id IN (SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI');

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- < delete on table "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category" is still referenced from table "film_category">
DELETE FROM category
WHERE name IN (SELECT name FROM category WHERE name = 'Mathmagical');

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <It did succeed. It has no foreign keys so it was able to be deleted>
DELETE FROM film_category
WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical');

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <It did succeed this time. The foreign keys  were removed so it was able to be deleted>

DELETE FROM category
WHERE name IN (SELECT name FROM category WHERE name = 'Mathmagical');

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


