# Write your MySQL query statement below
-- select name as customers from customers where id not in 
-- (select customerId from orders);

select customers.name as Customers from customers left join orders on 
customers.id = orders.customerId where orders.customerId is null;