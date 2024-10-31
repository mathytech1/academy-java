-- Build a single SQL query to achieve all of the following:
SELECT
    TO_CHAR(
        DATE_TRUNC('month', "createdOn"),
        'YYYY-MM'
-- Select the truncated month and the count of users from the User table
-- Truncate the createdOn timestamp to the month level and format it as “YYYY-MM”
    ) AS month,
    COUNT(*) AS "userCount"
-- Count the number of users for each truncated month
FROM
    "user"
GROUP BY
-- Group the users by the truncated month
    DATE_TRUNC('month', "createdOn")
ORDER BY
-- Order the results by month in ascending order
month;