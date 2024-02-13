package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {  
    	Map<Integer, String> monthsMap = new HashMap<>();
        monthsMap.put(1, "January");
        monthsMap.put(2, "February");
        monthsMap.put(3, "March");
        monthsMap.put(4, "April");
        monthsMap.put(5, "May");
        monthsMap.put(6, "June");
        monthsMap.put(7, "July");
        monthsMap.put(8, "August");
        monthsMap.put(9, "September");
        monthsMap.put(10, "October");
        
        System.out.println("Phone numbers"+monthsMap.values());
        System.out.println("===================");
       System.out.println(monthsMap.keySet()); 
  System.out.println("=========================");
  System.out.println(monthsMap.putIfAbsent(5, "May"));
  System.out.println(monthsMap);
  System.out.println("========================");
  System.out.println(monthsMap.containsKey(4));
  System.out.println("================");
  System.out.println(monthsMap.containsValue("July"));
  System.out.println("===============");
  System.out.println(monthsMap.size());
  System.out.println("================");
  System.out.println(monthsMap.get(5));
  System.out.println("+++++++++++++++++++");
        
        Map<Integer, String> moviesMap = new HashMap<>();
        moviesMap.put(1, "Avatar");
        moviesMap.put(2, "Titanic");
        moviesMap.put(3, "Avengers: Endgame");
        moviesMap.put(4, "The Lion King");
        moviesMap.put(5, "Frozen II");
        moviesMap.put(6, "Spider-Man: Far From Home");
        moviesMap.put(7, "Joker");
        moviesMap.put(8, "Toy Story 4");
        moviesMap.put(9, "The Avengers");
        moviesMap.put(10, "Black Panther");
        System.out.println("Phone numbers"+monthsMap.values());
        System.out.println("===================");
       System.out.println(moviesMap.keySet()); 
  System.out.println("=========================");
  System.out.println(moviesMap.putIfAbsent(5, "Frozen II"));
  System.out.println(moviesMap);
  System.out.println("========================");
  System.out.println(moviesMap.containsKey(4));
  System.out.println("================");
  System.out.println(moviesMap.containsValue("The Avengers"));
  System.out.println("===============");
  System.out.println(moviesMap.size());
  System.out.println("================");
  System.out.println(moviesMap.get(5));
  System.out.println("+++++++++++++++++++");
        
        
        Map<Integer, String> countriesMap = new HashMap<>();
        countriesMap.put(1, "India");
        countriesMap.put(2, "United States");
        countriesMap.put(3, "China");
        countriesMap.put(4, "Brazil");
        countriesMap.put(5, "Russia");
        countriesMap.put(6, "Japan");
        countriesMap.put(7, "Germany");
        countriesMap.put(8, "United Kingdom");
        countriesMap.put(9, "France");
        countriesMap.put(10, "Italy");
        

        Map<Integer, String> carsMap = new HashMap<>();
        carsMap.put(1, "Toyota Corolla");
        carsMap.put(2, "Ford F-Series");
        carsMap.put(3, "Honda Civic");
        carsMap.put(4, "Volkswagen Golf");
        carsMap.put(5, "Toyota RAV4");
        carsMap.put(6, "Ford Focus");
        carsMap.put(7, "Chevrolet Silverado");
        carsMap.put(8, "Toyota Camry");
        carsMap.put(9, "Honda CR-V");
        carsMap.put(10, "Chevrolet Equinox");
        

        Map<Integer, String> laptopsMap = new HashMap<>();
        laptopsMap.put(1, "Apple MacBook Pro");
        laptopsMap.put(2, "Dell XPS 13");
        laptopsMap.put(3, "HP Spectre x360");
        laptopsMap.put(4, "Microsoft Surface Laptop");
        laptopsMap.put(5, "Lenovo ThinkPad X1 Carbon");
        laptopsMap.put(6, "Asus ZenBook 13");
        laptopsMap.put(7, "Acer Swift 3");
        laptopsMap.put(8, "Google Pixelbook Go");
        laptopsMap.put(9, "Razer Blade 15");
        laptopsMap.put(10, "Samsung Galaxy Book Flex");
        
        Map<Integer, String> electronicsMap = new HashMap<>();
        electronicsMap.put(1, "Samsung Galaxy S21 Ultra");
        electronicsMap.put(2, "Apple iPhone 13 Pro Max");
        electronicsMap.put(3, "Sony PlayStation 5");
        electronicsMap.put(4, "Samsung QLED QN90A");
        electronicsMap.put(5, "Apple AirPods Pro");
        electronicsMap.put(6, "Amazon Kindle Paperwhite");
        electronicsMap.put(7, "LG OLED CX");
        electronicsMap.put(8, "Fitbit Charge 5");
        electronicsMap.put(9, "DJI Mavic Air 2");
        electronicsMap.put(10, "Bose QuietComfort 45");
        
  
        Map<Integer, String> sportsMap = new HashMap<>();
        sportsMap.put(1, "Football (Soccer)");
        sportsMap.put(2, "Cricket");
        sportsMap.put(3, "Basketball");
        sportsMap.put(4, "Tennis");
        sportsMap.put(5, "Golf");
        sportsMap.put(6, "Baseball");
        sportsMap.put(7, "Rugby");
        sportsMap.put(8, "Athletics (Track and Field)");
        sportsMap.put(9, "Swimming");
        sportsMap.put(10, "Boxing");
        

        Map<Integer, String> gmailsMap = new HashMap<>();
        gmailsMap.put(1, "infosys@gmail.com");
        gmailsMap.put(2, "tcs@gmail.com");
        gmailsMap.put(3, "wipro@gmail.com");
        gmailsMap.put(4, "socgen@gmail.com");
        gmailsMap.put(5, "jpmorgan@gmail.com");
        gmailsMap.put(6, "zoho@gmail.com");
        gmailsMap.put(7, "ibm@gmail.com");
        gmailsMap.put(8, "dell@gmail.com");
        gmailsMap.put(9, "amazon@gmail.com");
        gmailsMap.put(10, "flipkart@gmail.com");
        

        Map<Integer, Long> phoneNumbersMap = new HashMap<>();
        phoneNumbersMap.put(1, 9123456789L);
        phoneNumbersMap.put(2, 9234567890L);
        phoneNumbersMap.put(3, 9345678901L);
        phoneNumbersMap.put(4, 9456789012L);
        phoneNumbersMap.put(5, 9567890123L);
        phoneNumbersMap.put(6, 9678901234L);
        phoneNumbersMap.put(7, 9789012345L);
        phoneNumbersMap.put(8, 9890123456L);
        phoneNumbersMap.put(9, 9001234567L);
        phoneNumbersMap.put(10, 9112345678L);
        
        System.out.println("Phone numbers"+phoneNumbersMap.values());
        System.out.println("===================");
       System.out.println(phoneNumbersMap.keySet()); 
  System.out.println("=========================");
  System.out.println(phoneNumbersMap.putIfAbsent(5, 9567890123L));
  System.out.println(phoneNumbersMap);
  System.out.println("========================");
  System.out.println(phoneNumbersMap.containsKey(4));
  System.out.println("================");
  System.out.println(phoneNumbersMap.containsValue(9890123456L));
  System.out.println("===============");
  System.out.println(phoneNumbersMap.size());
  System.out.println("================");
  System.out.println(phoneNumbersMap.get(5));
  System.out.println("+++++++++++++++++++");
  
  
  
  
  
        Map<Integer, String> socialMediaMap = new HashMap<>();
        socialMediaMap.put(1, "Facebook");
        socialMediaMap.put(2, "Instagram");
        socialMediaMap.put(3, "Twitter");
        socialMediaMap.put(4, "LinkedIn");
        socialMediaMap.put(5, "Snapchat");
        socialMediaMap.put(6, "Pinterest");
        socialMediaMap.put(7, "TikTok");
        socialMediaMap.put(8, "WhatsApp");
        socialMediaMap.put(9, "Telegram");
        socialMediaMap.put(10, "YouTube");

 
        System.out.println("Values of monthsMap:");
        for (String value : monthsMap.values()) {
            System.out.println(value);
        }
        System.out.println();
        
      
        System.out.println("Keys of moviesMap:");
        for (Integer key : moviesMap.keySet()) {
            System.out.println(key);
        }
        System.out.println();

      
        monthsMap.putIfAbsent(11, "November");
        System.out.println("Months map after putting November if not present:");
        System.out.println(monthsMap);
        System.out.println();

      
        int keyToCheck = 5;
        System.out.println("Is key " + keyToCheck + " present in monthsMap? " + monthsMap.containsKey(keyToCheck));
        System.out.println();

       
        String valueToCheck = "March";
        System.out.println("Is value \"" + valueToCheck + "\" present in monthsMap? " + monthsMap.containsValue(valueToCheck));
        System.out.println();

      
        System.out.println("Size of moviesMap: " + moviesMap.size());
        System.out.println();

   
        int keyToGet = 3;
        System.out.println("Value for key " + keyToGet + " in monthsMap: " + monthsMap.get(keyToGet));
    }
}
