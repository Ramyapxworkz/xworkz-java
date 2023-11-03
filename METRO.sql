CREATE DATABASE BANGALORE;
DROP DATABASE BANGALORE;
USE BANGALORE;
CREATE TABLE METRO(STATION_NAME VARCHAR(30),
STATION_CODE VARCHAR(20),
LINE_COLOR VARCHAR(20),
LINE_NAME VARCHAR(20),
DISTANCE_BW_STATION VARCHAR(100),
OPERATING_HOURS VARCHAR(20),
FARE_INFORMATION VARCHAR(20),
ACCESSIBILITY_INFORMATION VARCHAR(20),
ROUTE_MAP VARCHAR(50),
MAINTENANCE_SCHEDULE VARCHAR(20));

ALTER TABLE METRO ADD COLUMN NAME_MATRO VARCHAR(20);
ALTER TABLE METRO RENAME COLUMN STATION_CODE TO STATION_CODENUM;
ALTER TABLE METRO DROP COLUMN DISTANCE_BW_STATION;
INSERT INTO METRO VALUES('UNION SQUARE','USQ','#FF0000','RED LINE','RAJAJINAGAR TO MEJESTIC','Weekdays: 6:00 AM - 11:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators', 'ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','green line','6km nagavara','Weekdays: 6:00 AM - 11:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','green line','7km mejestic','Weekdays: 7:00 AM - 12:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','green line','8km rajajinagar','Weekdays: 7:00 AM - 8:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','green line','9km navaranga','Weekdays: 6:00 AM - 12:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','purpal line','10km yalahanka','Weekdays: 5:00 PM - 6:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','purpal line','11km maharaja college','Weekdays: 7:00 PM - 8:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','purpal line','2km sandal soap factory','Weekdays: 8:00 PM - 9:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','purpal line','6km yalahanka','Weekdays: 9:00 PM - 10:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');
INSERT INTO METRO VALUES('Bangalore','BNG','111','purpal line','6km rajajinagar','Weekdays: 8:00 PM - 9:00 PM, Weekends: 7:00 AM - 10:00 PM','FARE RULE','elevators, ramps, tactile paving metro system',' layout, including station locations, connecting lines, and important landmarks.','Facilities','EXPRESS');

SELECT *  FROM METRO;


ALTER TABLE METRO MODIFY COLUMN OPERATING_HOURS VARCHAR(100);
ALTER TABLE METRO MODIFY COLUMN ROUTE_MAP VARCHAR(100);
ALTER TABLE METRO MODIFY COLUMN ACCESSIBILITY_INFORMATION VARCHAR(100);
ALTER TABLE METRO RENAME METRO_BANGALORE;
ALTER TABLE METRO_BANGALORE CHANGE  MAINTENANCE_SCHEDULE MAINTENANCE_SCHEDUL VARCHAR(25);

CREATE TABLE MOVIE(MovieID INT,
TITLE VARCHAR(30),
RELESE_YEAR VARCHAR(30),
GENRE VARCHAR(30),
DIRECTOR VARCHAR(30),
HERO_NAME VARCHAR(30),
HEROIN_NAME VARCHAR(30),
RATINGS BOOLEAN,
RUNTIME_MIN VARCHAR(30),
 LANGUAGE VARCHAR(30));
 ALTER TABLE MOVIE RENAME MOVIE_INFORMATION;
 ALTER TABLE MOVIE_INFORMATION ADD COLUMN RELESE_DATE VARCHAR(20);
 ALTER TABLE MOVIE_INFORMATION RENAME COLUMN  RELESE_YEAR TO RELEASE1_YEAR;
 ALTER TABLE MOVIE_INFORMATION DROP COLUMN DIRECTOR;
 ALTER TABLE MOVIE_INFORMATION CHANGE RUNTIME_MIN RUNTIME_MINUTE VARCHAR(30);
 ALTER TABLE MOVIE_INFORMATION RENAME COLUMN GENRE TO MOVIE_NAME;
 alter TABLE MOVIE_INFORMATION CHANGE RATINGS RATINGS INT;
 ALTER TABLE MOVIE_INFORMATION DROP COLUMN RATINGS;
 
 INSERT INTO MOVIE_INFORMATION VALUES (1,'STORY','2019','RAJAHULI','YASH','MEGHANA RAJ','3 HOURS','KANNADA','MONDAY');
  INSERT INTO MOVIE_INFORMATION VALUES (2,'STORY','2020','KIRIK PARTY','RAKSHITH SHETTY','RASHMIKA','3 HOURS','KANNADA ','SUNDAY');
  INSERT INTO MOVIE_INFORMATION VALUES (3,'STORY','2018','VikranthRona','Sudeep ','MILANA NAGRAJ','2 HOURS','KANNADA ','MONDAY');
  INSERT INTO MOVIE_INFORMATION VALUES (4,'STORY','2021','KGF','PrashanthNeel ','RR','2:50 HOURS','KANNADA ','MONDAY');
  INSERT INTO MOVIE_INFORMATION VALUES (5,'STORY','2023','SitaRamam','DQ ','RR','2:50 HOURS','TELUGU ','MONDAY');
INSERT INTO MOVIE_INFORMATION VALUES (6,'STORY','2023','Bramhastra','Ranveer ','RR','2:50 HOURS','HIV ','MONDAY');
INSERT INTO MOVIE_INFORMATION VALUES (6,'STORY','2022','Ugram','Shreemurali ','RR','2:50 HOURS','KAN ','SUNDAY');
INSERT INTO MOVIE_INFORMATION VALUES (6,'STORY','2022','BAJARANGI','SHIVARAJ KUMAR ','SOME ONE','2:50 HOURS','KAN ','SUNDAY');
INSERT INTO MOVIE_INFORMATION VALUES (6,'STORY','2019','RAMACHARI',' YASH ','RADHIKA','2:50 HOURS','KAN ','SUNDAY');
INSERT INTO MOVIE_INFORMATION VALUES (6,'STORY','2022','DILWALA ',' SUSHANTH ','RADHIKA','2:50 HOURS','KAN ','MONDAY');

 SELECT * FROM MOVIE_INFORMATION;
 
 CREATE TABLE MALLS(MALLID INT,
 MallName VARCHAR(50),
 Location VARCHAR(50),
 TotalStores INT,
 TotalFloors INT,
 ParkingCapacity INT,
 YearBuilt INT,
 AnchorStore VARCHAR(100),
 MallType VARCHAR(50));
 ALTER TABLE MALLS RENAME MALL1;
 ALTER TABLE MALL1 ADD COLUMN MALL_LOCATION VARCHAR(20);
 ALTER TABLE MALL1 RENAME COLUMN MallName to MALL_NAME;
 ALTER TABLE MALL1 DROP COLUMN TotalFloors;
 ALTER TABLE MALL1 CHANGE MallType MALL_TYPE VARCHAR(30);
 INSERT INTO MALL1 VALUES(1,'ORION MALL','BANAGALORE ',50,200,2015, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(2,'LULU MALL','BANAGALORE ',10,99,2016, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(3,'VISHAL MALL','BANAGALORE ',20,80,2016, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(4,'D MART ','BANAGALORE ',30,50,2017, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(5,'BAZAR MALL','BANAGALORE ',20,10,2018, 'MacyS','Shopping Center','BANGALORE MAIN STREET');
 INSERT INTO MALL1 VALUES(6,'MALL AND ASIAN MALL','BANAGALORE ',40,200,2015, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(7,'GT MALL','BANAGALORE ',40,20,2010, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(8,'GARUDA MALL','BANAGALORE ',60,89,2022, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(9,'MANTHRI SQUARE MALL','BANAGALORE ',10,90,2019, 'MacyS','Shopping Center','123 MAIN STREET');
 INSERT INTO MALL1 VALUES(10,'UB CITY MALL','BANAGALORE ',5,77,2023, 'MacyS','Shopping Center','123 MAIN STREET');

 SELECT * FROM MALL1;

CREATE TABLE  Resorts(ResortID INT ,
    ResortName VARCHAR(255),
    Location VARCHAR(255),
    Rating DECIMAL(3, 1),
    TotalRooms INT,
    TotalPools INT,
    TotalRestaurants INT,
    SpaAvailable BOOLEAN,
    Beachfront BOOLEAN,
    SkiResort BOOLEAN,
    GolfCourse BOOLEAN
);

ALTER TABLE Resorts RENAME RESORT_NAME;
 ALTER TABLE RESORT_NAME ADD COLUMN RESORT_LOCATION VARCHAR(20);
 ALTER TABLE RESORT_NAME RENAME COLUMN ResortName to RESTORANT_NAME;
  ALTER TABLE RESORT_NAME DROP COLUMN TotalPools;
  ALTER TABLE RESORT_NAME CHANGE GolfCourse GOLF_COURSE VARCHAR(30);
 INSERT INTO RESORT_NAME VALUES(1,'Paradise Resort','123 Beachfront Avenue',4.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'ROYAL GASLAXY','BANGALORE',4.2,5,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'REDLION HOTEL','BANGALORE  ',5.2,6,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'BLUE MOOD HOTEL  ','DAVANAGERE',6.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'ROYAL VILLA RESORT ','  BANGALORE',4.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'ZION HOTEL ','DAVANGERE  ',6.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,' ARBORRO RESORT','MAIN ROAD BANG ',4.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'PRADDON ','DAVAGAGERE ',4.2,7,1,1,1,1,0,'BANGALORE');
 INSERT INTO RESORT_NAME VALUES(1,'GRAND AND EPIC','MYSORE ',4.2,7,1,1,1,1,0,'BANGALORE');

 SELECT * FROM RESORT_NAME;
 
 CREATE TABLE Restaurants (
    RestaurantID INT,
    RestaurantName VARCHAR(255),
    CuisineType VARCHAR(100),
    Address VARCHAR(255),
    City VARCHAR(100),
    State VARCHAR(50),
    ZipCode VARCHAR(20),
    Rating INT,
    Capacity INT,
    OpeningHours VARCHAR(255)
);
ALTER TABLE Restaurants RENAME RESTAURANT_NAME;
ALTER TABLE RESTAURANT_NAME ADD COLUMN RESTAURANT_LOCATION VARCHAR(20);
 ALTER TABLE RESTAURANT_NAME RENAME COLUMN RestaurantName to RESTAURANT_NAME;
  ALTER TABLE RESTAURANT_NAME DROP COLUMN City;
  ALTER TABLE RESTAURANT_NAME CHANGE OpeningHours OPENING_HOURS VARCHAR(30);
  
 INSERT INTO  RESTAURANT_NAME VALUES(1, 'The Bistro', 'French', '123 Main Street', 'KATNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(2, 'Curry Constellation', 'French', '234 Main Street', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(3, 'Bollywood Biryani ', 'French', '13 Main Street', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(4, 'Tandoori Twilight ', 'French', '55 DAVANAGERE', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(5, 'Spice Symphony', 'French', '123 BANGALORE ', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(6, 'Masala Magic', 'French', '123 BANGALORE ', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(7, 'Chai Charm ', 'French', '123 BANGALORE ', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(8, 'Saffron Sunrise ', 'French', '123 Main Street', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(9, 'Naan Nirvana', 'French', '123 Main Street', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');
 INSERT INTO  RESTAURANT_NAME VALUES(10, 'Punjabi Palace ', 'French', '123 Main Street', 'KARNATAKA', '12345', 4, 50, 'Mon-Sat: 11:00 AM - 9:00 PM','INDIA UNIQUE');


 SELECT * FROM RESTAURANT_NAME;
 
 
 CREATE TABLE Showrooms (
    ShowroomID INT ,
    ShowroomName VARCHAR(255),
    Location VARCHAR(255),
    ShowroomType VARCHAR(100),
    Capacity INT,
    ShowroomSizeSqFt DECIMAL(10, 2),
    OperatingHours VARCHAR(255),
    ContactPhone VARCHAR(20),
    ContactEmail VARCHAR(255),
    ManagerName VARCHAR(100)
);

ALTER TABLE Showrooms RENAME SHOWROOM_DETAILS;
ALTER TABLE SHOWROOM_DETAILS ADD COLUMN SHOWROOM_TIMINGS VARCHAR(20);
ALTER TABLE SHOWROOM_DETAILS RENAME COLUMN ShowroomName TO SHOWROOM_NAME;
ALTER TABLE SHOWROOM_DETAILS DROP COLUMN Capacity;
ALTER TABLE SHOWROOM_DETAILS CHANGE ManagerName MANAGER_NAME VARCHAR(30);
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'TechHub Electronics Showroom', '123 Main Street, CityName', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@techhub.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (2, 'Quality Auto Sales', '123 Main Street, CityName', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Quality.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Victory Mitsubishi', '123 Main Street, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Victory.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Plaza Auto Mall', '123 Main Street, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Plaza.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Mr Cars Auto Sales', 'rajajinagar, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@techhub.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Brooklyn Auto Mall', 'hebbal, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Brooklyn.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Sato Auto Used Cars', 'mejestic, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Sato.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Yonkers Auto Mall', 'dasara halli, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Yonkers.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Vavi’s Auto Sales', 'tumkur road, bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@Vavi.com', 'John Doe','9:30AM-9:30PM');
INSERT INTO SHOWROOM_DETAILS VALUES (1, 'Cars With Deals', 'main raod  , bangalure', 'Electronics',1500.00, 'Mon-Fri: 9:00 AM - 7:00 PM', '+1234567890', 'info@techhub.com', 'John Doe','9:30AM-9:30PM');

SELECT * FROM SHOWROOM_DETAILS;