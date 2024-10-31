CREATE TABLE "seat" ("id" INTEGER NOT NULL PRIMARY KEY, "student" VARCHAR NOT NULL);

INSERT INTO "seat" 
VALUES (1, 'Abbot'),
       (2, 'Doris'),
       (3, 'Emerson'),
       (4, 'Green'),
       (5, 'Jeames');

-- write an SQL query to swap the seat id of every two consecutive students in the Seat table. 
-- If the total number of students in the table is odd, the id of the last student should not be swapped. 
-- Return the result table ordered by id in ascending order.

SELECT 
    CASE 
        WHEN MOD("id", 2) = 1 AND "id" < (SELECT MAX("id") FROM "seat") THEN "id" + 1
        WHEN MOD("id", 2) = 0 THEN "id" - 1
        ELSE "id"
    END AS "id",
    "student"
FROM "seat"
ORDER BY "id" ASC;

