Create Table Flight(
Id int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
Departure Timestamp NOT NULL,
Arrival Timestamp NOT NULL,
FOREIGN KEY Plane(Id) REFERENCES Planes(PlaneId),
FOREIGN KEY Airport(Id) REFERENCES Airports(Stall)  
);

Create Table Plane(
Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
StartLocation varchar(255),
Destination varchar(255),
Size int(3)    
);

Create Table Airport(
Id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
Name varchar(255),
Stall int
);




