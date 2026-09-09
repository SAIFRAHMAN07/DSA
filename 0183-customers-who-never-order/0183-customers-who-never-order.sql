# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders e
ON c.id = e.customerId
WHERE e.customerId IS NULL;