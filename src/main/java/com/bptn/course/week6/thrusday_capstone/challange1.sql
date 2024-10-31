CREATE TABLE "department" ("id" INTEGER PRIMARY KEY,
  	"name" VARCHAR);

CREATE TABLE "employee"("id" INTEGER PRIMARY KEY, 
    "name" VARCHAR, 
    "salary" INTEGER, 
    "departmentId" INTEGER,
	CONSTRAINT "departmentIdFkey" FOREIGN KEY ("departmentId") REFERENCES "department"("id")
    );
	
INSERT INTO "department"
  VALUES (1, 'IT'),
         (2, 'Sales');

INSERT INTO "employee"
  VALUES (1, 'Joe', 70000, 1),
        (2, 'Jim', 90000, 1),
        (3, 'Henry', 80000, 2),
        (4, 'Sam', 60000, 2),
        (5, 'Max', 90000, 1);

-- Write an SQL query to find employees who have the highest salary in each of the departments. 
-- Return the result table in any order.

SELECT d."name" AS "Department", 
       e."name" AS "Employee", 
       e."salary" AS "Salary"
FROM "employee" e
JOIN "department" d ON e."departmentId" = d."id"
JOIN (
    SELECT "departmentId", MAX("salary") AS "maxSalary"
    FROM "employee"
    GROUP BY "departmentId"
) AS "deptMax" ON e."departmentId" = "deptMax"."departmentId" 
               AND e."salary" = "deptMax"."maxSalary";
