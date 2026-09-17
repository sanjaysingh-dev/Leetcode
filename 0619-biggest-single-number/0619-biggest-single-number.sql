# Write your MySQL query statement below

SELECT MAX(num) AS num
FROM (
     SELECT num,
     COUNT(*) OVER(PARTITION BY num) AS sz
     FROM MyNumbers
) n
WHERE sz = 1;