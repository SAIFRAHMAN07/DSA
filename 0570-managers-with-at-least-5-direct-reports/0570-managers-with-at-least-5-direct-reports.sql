# Write your MySQL query statement below
SELECT m.name
FROM Employee m
JOIN (
    SELECT managerId
    FROM Employee
    GROUP BY managerId
    HAVING COUNT(*) >= 5
) e
ON m.id = e.managerId;