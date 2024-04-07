Table: Weather
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id is the column with unique values for this table. There are no different rows with the same recordDate. This table contains information about the temperature on a certain day.
Write a solution to find all dates Id with higher temperatures compared to its previous dates (yesterday). Return the result table in any order.

SELECT w1.id FROM Weather AS w1 JOIN Weather AS w2
ON SUBDATE(w1.recordDate, 1) = w2.recordDate AND w1.temperature > w2.temperature;
