package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieNames {
  public static void main(String[] args) {
	List<String> movieNames=new ArrayList<>();
    movieNames.add("Dangal");
    movieNames.add("PK");
    movieNames.add("Bahubali");
    movieNames.add("3 Idiots");
    movieNames.add("Lagaan");
    movieNames.add("Sholay");
    movieNames.add("Dilwale Dulhania Le Jayenge");
    movieNames.add("Chennai Express");
    movieNames.add("Kabhi Khushi Kabhie Gham");
    movieNames.add("Gully Boy");
    movieNames.add("Queen");
    movieNames.add("Andhadhun");
    movieNames.add("Article 15");
    movieNames.add("Mulk");
    movieNames.add("Koi Mil Gaya");
    movieNames.add("Bajrangi Bhaijaan");
    movieNames.add("Sultan");
    movieNames.add("Padmaavat");
    movieNames.add("Uri: The Surgical Strike");
    movieNames.add("Dabangg");
    movieNames.add("KGF");
    movieNames.add("Pailwaan");
    movieNames.add("Yajamana");
    movieNames.add("Drishya");
    movieNames.add("KGF2");
    movieNames.add("Kirik Party");
    movieNames.add("Raajakumara");
    movieNames.add("Ulidavaru Kandanthe");
    movieNames.add("Mungaru Male");
    movieNames.add("RangiTaranga");
    movieNames.add("Dandupalya");
    movieNames.add("Arjun");
    movieNames.add("Avane Srimannarayana");
    movieNames.add("Tagaru");
    movieNames.add("Hubballi");
    movieNames.add("Bhakta Prahlada");
    movieNames.add("Sathya Harishchandra");
    movieNames.add("Premada Kanike");
    movieNames.add("Mussange maathu");
    movieNames.add("Googly");
    movieNames.add("The Green Mile");
    movieNames.add("The Pianist");
    movieNames.add("Parasite");
    movieNames.add("Psycho");
    movieNames.add("Gladiator");
    movieNames.add("The Lion King");
    movieNames.add("The Departed");
    movieNames.add("Whiplash");
    movieNames.add("The Prestige");
    movieNames.add("Grave of the Fireflies");
    movieNames.add("Arasu");
    movieNames.add("Vamshi");
    movieNames.forEach(s->System.out.println(s));
    System.out.println("========================");
    System.out.println(movieNames.subList(5, 40));

    System.out.println("Total No. Of Movies: " + movieNames.size());
    
    


}
}