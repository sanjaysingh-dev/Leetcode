# Write your MySQL query statement below

SELECT e.employee_id, e.name, COUNT(*) AS reports_count, ROUND(AVG(m.age)) AS average_age
FROM Employees e 
JOIN Employees m  
WHERE e.employee_id = m.reports_to
GROUP BY e.employee_id 
HAVING COUNT(*) >= 1
ORDER BY e.employee_id;
