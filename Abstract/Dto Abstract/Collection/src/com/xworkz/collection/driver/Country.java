package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class Country {
	public static void main(String[] args) {
		List<String> countryList=new ArrayList();

        countryList.add("Afghanistan");
        countryList.add("Albania");
        countryList.add("Algeria");
        countryList.add("Andorra");
        countryList.add("Angola");
        countryList.add("Antigua and Barbuda");
        countryList.add("Argentina");
        countryList.add("Armenia");
        countryList.add("Australia");
        countryList.add("Austria");
        countryList.add("Azerbaijan");
        countryList.add("Bahamas");
        countryList.add("Bahrain");
        countryList.add("Bangladesh");
        countryList.add("Barbados");
        countryList.add("Belarus");
        countryList.add("Belgium");
        countryList.add("Belize");
        countryList.add("Benin");
        countryList.add("Bhutan");
        countryList.add("Bolivia");
        countryList.add("Bosnia and Herzegovina");
        countryList.add("Botswana");
        countryList.add("Brazil");
        countryList.add("Brunei");
        countryList.add("Bulgaria");
        countryList.add("Burkina Faso");
        countryList.add("Burundi");
        countryList.add("Cabo Verde");
        countryList.add("Cambodia");
        countryList.add("Cameroon");
        countryList.add("Canada");
        countryList.add("Central African Republic");
        countryList.add("Chad");
        countryList.add("Chile");
        countryList.add("China");
        countryList.add("Colombia");
        countryList.add("Comoros");
        countryList.add("Congo");
        countryList.add("Costa Rica");
        countryList.add("Croatia");
        countryList.add("Cuba");
        countryList.add("Cyprus");
        countryList.add("Czechia");
        countryList.add("Denmark");
        countryList.add("Djibouti");
        countryList.add("Dominica");
        countryList.add("Dominican Republic");
        countryList.add("East Timor");
        countryList.add("Ecuador");
        countryList.add("Egypt");
        countryList.add("El Salvador");
        countryList.add("Equatorial Guinea");
        countryList.add("Eritrea");
        countryList.add("Estonia");
        countryList.add("Eswatini");
        countryList.add("Ethiopia");
        countryList.add("Fiji");
        countryList.add("Finland");
        countryList.add("France");
        countryList.add("Gabon");
        countryList.add("Gambia");
        countryList.add("Georgia");
        countryList.add("Germany");
        countryList.add("Ghana");
        countryList.add("Greece");
        countryList.add("Grenada");
        countryList.add("Guatemala");
        countryList.add("Guinea");
        countryList.add("Guinea-Bissau");
        countryList.add("Guyana");
        countryList.add("Haiti");
        countryList.add("Honduras");
        countryList.add("Hungary");
        countryList.add("Iceland");
        countryList.add("India");
        countryList.add("Indonesia");
        countryList.add("Iran");
        countryList.add("Iraq");
        countryList.add("Ireland");
        countryList.add("Israel");
        countryList.add("Italy");
        countryList.add("Ivory Coast");
        countryList.add("Jamaica");
        countryList.add("Japan");
        countryList.add("Jordan");
        countryList.add("Kazakhstan");
        countryList.add("Kenya");
        countryList.add("Kiribati");
        countryList.add("Korea, North");
        countryList.add("Korea, South");
        countryList.add("Kosovo");
        countryList.add("Kuwait");
        countryList.add("Kyrgyzstan");
        countryList.add("Laos");
        countryList.add("Latvia");
        countryList.add("Lebanon");
        countryList.add("Lesotho");
        countryList.add("Liberia");
        countryList.add("Libya");

        System.out.println(countryList.size());
        
        countryList.forEach(s->System.out.println(s));
        System.out.println("========================");
        countryList.subList(5, 70);

   
	}

}
