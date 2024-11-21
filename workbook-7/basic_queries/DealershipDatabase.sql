CREATE TABLE dealerships(
    dealership_id INT AUTO_INCREMENT PRIMARY KEY,
    dealername VARCHAR(50) NOT NULL,
    address VARCHAR(50) NOT NULL,
    phone_number VARCHAR(15)
);
CREATE TABLE vehicles (
    vin VARCHAR(17) PRIMARY KEY,
    make VARCHAR(55),
    model VARCHAR(55),
    year int,
    price DECIMAL(10, 2),
    sold BOOLEAN
);
CREATE TABLE inventory(
	dealership_id INT NOT NULL,
	FOREIGN KEY (dealership_id) REFERENCES dealerships (dealership_id),
    vin VARCHAR(17),
	FOREIGN KEY (vin) REFERENCES vehicles (vin)
);
CREATE TABLE sales_conctract(
	customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_firstName VARCHAR(10),
    customer_lastName VARCHAR(10),
    customerPhone VARCHAR(10),
    address VARCHAR(30),
	vin VARCHAR(17),
    FOREIGN KEY (vin) REFERENCES vehicles (vin)
);
INSERT INTO dealerships
VALUES 
		(1,"WeGOTcars", "123 blast ave", "555-5555"),
		(2,"weGOTmoreCars", "321 tsalb st", "543-5990"),
        (3,"weHavesomeCars", "244 justri st", "234-2423"),
        (4,"weHavesomeMorecars","347 industrial rd", "222-2222");
        
 INSERT INTO vehicles 
 VALUES
			("0199293","ford","f150",1992,5000.00),
            ("0192333","ford","f250",1990,8000.00),
            ("0499293","chevrolet","duramaxc",2007,20000.00);
INSERT INTO sales_conctract    
VALUES
			(1,"chuy","gomez","454-5445","222 somewhere ave", vin),
            (2,"lazarus","dun","322-3223","111 someplace rd", vin),
            (3,"dimitri","ankalev","676-6677","109 oregon dr",vin);