SELECT products.ProductID, products.ProductName, products.UnitPrice, categories.CategoryName
FROM products
INNER JOIN categories
ORDER BY CategoryName, ProductName;

