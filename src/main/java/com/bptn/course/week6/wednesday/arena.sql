CREATE TABLE "arena"("id" integer NOT NULL,
	"eventDate" date NOT NULL,
	"peopleCount" integer NOT NULL,
	CONSTRAINT "idPkey" PRIMARY KEY ("id"),
	CONSTRAINT "eventDateUKey" UNIQUE ("eventDate")
	);

INSERT INTO "arena" 
VALUES (1, '2022-03-01', 10),
		(2, '2022-03-02', 109),
		(3, '2022-03-03', 150),
		(4, '2022-03-04', 99),
		(5, '2022-03-05', 145),
		(6, '2022-03-06', 1455),
		(7, '2022-03-07', 199),
		(8, '2022-03-09', 188);

-- Write an SQL query to display the records with three or more rows containing consecutive id's, 
-- and where the number of people is greater than or equal to 100 for each. 
-- Return the result ordered by eventDate in ascending order. 

WITH ConsecutiveGroups AS (
    SELECT 
        "id", 
        "eventDate", 
        "peopleCount",
        "id" - ROW_NUMBER() OVER (ORDER BY "id") AS grp
    FROM "arena"
    WHERE "peopleCount" >= 100
),
GroupedConsecutive AS (
    SELECT grp, COUNT(*) AS group_count
    FROM ConsecutiveGroups
    GROUP BY grp
    HAVING COUNT(*) >= 3
)
SELECT cg."id", cg."eventDate", cg."peopleCount"
FROM ConsecutiveGroups AS cg
JOIN GroupedConsecutive AS gc ON cg.grp = gc.grp
ORDER BY cg."eventDate" ASC;


