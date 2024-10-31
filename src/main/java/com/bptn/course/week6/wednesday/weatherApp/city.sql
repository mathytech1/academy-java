CREATE TABLE "city" (
    "cityId" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    "name" VARCHAR NOT NULL,
    "weatherCityId" INTEGER NOT NULL,
    "countryId" INTEGER NOT NULL,
    "timezone" VARCHAR NOT NULL,
    "latitude" NUMERIC NOT NULL,
    "longitude" NUMERIC NOT NULL,
    CONSTRAINT "cityPkey" PRIMARY KEY ("cityId"),
    CONSTRAINT "cityCountryIdFkey" FOREIGN KEY ("countryId") REFERENCES "country"("countryId")
);


--insert a new city record into the table
INSERT INTO "city" ("name", "timezone", "longitude", "latitude", "weatherCityId", "countryId")
VALUES( 'London','GMT', -0.1278, 51.5074, 12345,1);

--select all the records from City table

SELECT*FROM "city";


--Select all records for the city with a "cityId" of 1.
SELECT*FROM "city" WHERE "cityId"=1;

--Update the "timezone" for the city with a "cityId" of 1 to "BST"
UPDATE "city" SET "timezone"='BST' WHERE "cityId"=1;

--insert another new city record into the table

INSERT INTO "city" ("name", "timezone", "longitude", "latitude", "weatherCityId", "countryId")
VALUES( 'PARIS','CET', 2.3, 51.5074, 12345,2);
--Select all cities with a "countryId" of 2.
SELECT*FROM "city" WHERE "countryId"=2;

--Update the "timezone" for all cities in the table to "UTC".
UPDATE "city" SET "timezone"='UTC'; 