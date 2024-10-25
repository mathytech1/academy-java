-- Create the "User" table
CREATE TABLE "User"(
  "userId" INT NOT NULL GENERATED ALWAYS AS IDENTITY,
  "firstName" VARCHAR(100) NOT NULL,
  "lastName" VARCHAR(100) NOT NULL,
  "username" VARCHAR(100) NOT NULL,
  "phone" VARCHAR(100) NOT NULL,
  "emailId" VARCHAR(100) NOT NULL,
  "password" VARCHAR(100) NOT NULL,
  "emailVerified" BOOLEAN NOT NULL DEFAULT FALSE,
  "createdOn" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  CONSTRAINT "userPKey" PRIMARY KEY ("userId"),
  CONSTRAINT "userEmailIdKey" UNIQUE ("emailId"),
  CONSTRAINT "userUsernameKey" UNIQUE ("username")
);

-- Insert a new row into the "User" table
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Jessie', 'Doe','jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');

-- Select all rows from the "User" table
SELECT * FROM "User";
-- Insert a new row into the "User" table
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified")
VALUES ('Jessie', 'Doe','jessiedoe', '+1-555-1234', 'jessiedoe@example.com', 'password123', 'true');

-- Select all rows from the "User" table
SELECT * FROM "User";

-- Insert multiple users with a single insert statement using a VALUES list
INSERT INTO "User"("firstName", "lastName", "username", "phone", "emailId", "password", "emailVerified", "createdOn")
VALUES ('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', true, NOW()),
  ('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc', false, NOW()),
  ('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123', false, NOW());

-- Select all rows from the "User" table where the value of the "emailVerified" column is true
SELECT * FROM "User" WHERE "emailVerified"=true;
-- Insert a few more users into the "User" table, (at least four more)

-- Update user with username "tomjones"
UPDATE "User" SET "username"='randyjones' WHERE "username"='tomjones';

-- Select user with username "tomjones"
SELECT * FROM "User" WHERE "username"='tomjones';

-- Delete user with username "randyjones"
DELETE FROM "User" WHERE "username"='randyjones';

-- Select all rows from the "User" table
SELECT * FROM "User";

-- Create the "Profile" table
CREATE TABLE "Profile"(
	"profileId" Integer NOT NULL GENERATED ALWAYS AS IDENTITY, 
	"userId" Integer NOT NULL, 
	"headline" VARCHAR NOT NULL, 
	"picture" VARCHAR NOT NULL, 
	"bio" VARCHAR, 
	"city" VARCHAR, 
	"country" VARCHAR,
	CONSTRAINT "ProfilePkey" PRIMARY KEY ("profileId"),
	CONSTRAINT "ProfileUserIdFkey" FOREIGN KEY ("userId") REFERENCES "User"("userId")
);

-- Select all rows from the "Profile" table
SELECT * FROM "Profile";

-- Insert two new profiles with a single statement using a VALUES list. (use your won data)
INSERT INTO "Profile"("userId", "headline", "picture", "bio", "city", "country")
VALUES(2, 'Life lately!', 'profile pic', 'Enjoy Life!', 'Edmonton', 'Canada'),
	  (4, 'My New Post!', 'dog pic', 'Take it easy!', 'Montreal', 'Canada');

-- Select all rows from the "Profile" table where the country is "Canada".
SELECT * FROM "Profile" WHERE "country" = 'Canada';

-- Update the profile with userId = 2
UPDATE "Profile" SET "city" = 'Atlanta', "country" = 'USA' WHERE "userId" = 2;

-- Delete profile with profileId = 3
DELETE FROM "Profile" WHERE "profileId" = 3;

-- Select all rows from the "Profile" table
SELECT * FROM "Profile";

-- Select the row from the "Profile" table with userdId = 2
SELECT * FROM "Profile" WHERE "userId" = 2;

-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.
SELECT * FROM "User" AS u LEFT JOIN "Profile" AS p ON u."userId" = p."userId";

-- Join the "User" and "Profile" tables to get the details of the users who have a profile.
SELECT * FROM "User" AS u RIGHT JOIN "Profile" AS p ON u."userId" = p."userId";
