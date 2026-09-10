SELECT e.machine_id,
       round(AVG(a.timestamp - e.timestamp),3) AS processing_time
FROM Activity e
INNER JOIN Activity a
ON e.process_id = a.process_id
AND e.machine_id = a.machine_id
AND e.activity_type = 'start'
AND a.activity_type = 'end'
GROUP BY e.machine_id;