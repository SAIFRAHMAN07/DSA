SELECT a.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI a
ON a.id = e.id;