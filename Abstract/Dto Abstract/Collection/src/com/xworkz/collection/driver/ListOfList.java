package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {
	public static void main(String[] args) {
	    List<String> streams = new ArrayList<>();
        streams.add("Computer Science");
        streams.add("Electronics");
        streams.add("Mechanical");
        streams.add("Civil");
        streams.add("Chemical");
        streams.add("Biotechnology");
        streams.add("Aerospace");
        streams.add("Electrical");
        streams.add("Information Technology");
        streams.add("Environmental");
        System.out.println(streams.size());
        System.out.println("================");
        streams.forEach(s->System.out.println(s));

        List<String> bangaloreAreas = new ArrayList<>();
        bangaloreAreas.add("Koramangala");
        bangaloreAreas.add("Indiranagar");
        bangaloreAreas.add("Jayanagar");
        bangaloreAreas.add("Whitefield");
        bangaloreAreas.add("Malleshwaram");
        bangaloreAreas.add("BTM Layout");
        bangaloreAreas.add("HSR Layout");
        bangaloreAreas.add("Basavanagudi");
        bangaloreAreas.add("Marathahalli");
        bangaloreAreas.add("Electronic City");
        bangaloreAreas.add("Yelahanka");
        bangaloreAreas.add("Banashankari");
        bangaloreAreas.add("Rajajinagar");
        bangaloreAreas.add("Hebbal");
        bangaloreAreas.add("Kengeri");
        bangaloreAreas.add("Vijayanagar");
        bangaloreAreas.add("JP Nagar");
        bangaloreAreas.add("Cunningham Road");
        bangaloreAreas.add("Shivajinagar");
        bangaloreAreas.add("Domlur");
        System.out.println(bangaloreAreas.size());
        System.out.println("+++++++++++++++++++++++++++++");
        bangaloreAreas.forEach(s->System.out.println(s));

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Rust");
        programmingLanguages.add("C#");
        programmingLanguages.add("TypeScript");
        programmingLanguages.add("HTML");
        programmingLanguages.add("CSS");
        programmingLanguages.add("Scala");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Shell");
        programmingLanguages.add("Lua");
        programmingLanguages.add("Haskell");
        programmingLanguages.add("Objective-C");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Dart");
        programmingLanguages.add("Groovy");
        programmingLanguages.add("R");
        programmingLanguages.add("MATLAB");
        programmingLanguages.add("Assembly");
        programmingLanguages.add("VB.NET");
        programmingLanguages.add("COBOL");
        programmingLanguages.add("Fortran");
        System.out.println("------------------");
        System.out.println(programmingLanguages.size());
        programmingLanguages.forEach(s->System.out.println(s));
        
        
        
        
        List<List<String>> lists=new ArrayList<>();
        lists.add(bangaloreAreas);
        lists.add(streams);
        lists.add(programmingLanguages);
        System.out.println(lists);
        
        lists.forEach(s->System.out.println(s));
	}

}
