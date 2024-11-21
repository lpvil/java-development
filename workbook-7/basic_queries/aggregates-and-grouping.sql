SELECT COUNT(*) FROM northwind.suppliers;
SELECT SUM(Salary) FROM northwind.employees;
SELECT MIN(UnitPrice) FROM northwind.products;
SELECT AVG(UnitPrice) FROM northwind.products;
SELECT MAX(UnitPrice) FROM northwind.products;
SELECT * FROM products;
SELECT AVG(UnitPrice) FROM northwind.products WHERE CategoryID;
SELECT SupplierID FROM northwind.products WHERE UnitsOnOrder >= 5;