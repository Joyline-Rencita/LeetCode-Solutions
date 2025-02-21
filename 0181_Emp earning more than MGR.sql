My Solution :

Write your MySQL query statement below
SELECT e1.name Employee
FROM
    Employee e1 JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;


better Solution :

select t1.name as Employee
from Employee t1
inner join Employee t2
on t1.managerId = t2.id
where t1.salary > t2.salary;
