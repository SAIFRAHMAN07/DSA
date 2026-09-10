SELECT a.name,
       SUM(b.amount) AS balance
FROM Users a
JOIN Transactions b
ON a.account = b.account
GROUP BY b.account , a.name
HAVING SUM(b.amount) > 10000;