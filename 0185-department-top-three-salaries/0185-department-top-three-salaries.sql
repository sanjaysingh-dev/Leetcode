# Write your MySQL query statement below


SELECT d.name AS Department, t.name AS Employee, t.salary AS Salary 
FROM (
    SELECT id, name,salary,departmentId, 
    DENSE_RANK() 
    OVER(PARTITION BY departmentId ORDER BY salary DESC) AS rn
    FROM Employee
) t 
JOIN Department d
ON t.departmentId = d.id 
WHERE rn <=3 
ORDER BY d.name;