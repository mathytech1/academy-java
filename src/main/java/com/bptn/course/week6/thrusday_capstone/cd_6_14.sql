--create the function totalRecordsInUser()
CREATE OR REPLACE FUNCTION "totalRecordsInUser"()
RETURNS INTEGER
LANGUAGE plpgsql
AS $$
 DECLARE total INTEGER;
 BEGIN
  SELECT COUNT(*) INTO total FROM "user";
  RETURN total;
 END;
 $$;

-- To call this function and check the total records in the User table, run this statement:
SELECT "totalRecordsInUser"();