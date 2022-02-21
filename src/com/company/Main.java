package com.company;

import cleanHello.Book;
import heritage.Carre;
import heritage.FigureGeometrique;
import polymorphisme.Animal;
import polymorphisme.Chien;
import polymorphisme.Oiseau;
import polymorphisme.Pigeon;
import reference.Car;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Book myBook = new Book("Titre","Etienne",3, "OC");

        myBook.title = "The new title";

        System.out.println(myBook);
        System.out.println(myBook.title);

        FigureGeometrique figure = new FigureGeometrique(1, 1);
        figure.moveTo(1, 1);
        Carre carre = new Carre(1, 1, 2);
        carre.moveTo(2, 2);

        Animal a1 = new Animal();
        Animal a2 = new Chien();
        Animal a3 = new Pigeon();
        Animal a4 = new Oiseau();

        a1.deplacer();
        a2.deplacer();
        a3.deplacer();
        a4.deplacer();

        // Utilisez un tableau pour stocker un nombre fixe d'éléments
        int[] cupsOfCoffePerDayOfTheWeek;
        cupsOfCoffePerDayOfTheWeek = new int[7];

        // C'est la même chose que :
        // int[] cupsOfCoffePerDayOfTheWeek = new int[7];

        cupsOfCoffePerDayOfTheWeek[4] = 3;
        System.out.println(cupsOfCoffePerDayOfTheWeek[0]);

        // Listes ordonnées
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(5);
        myList.add(1, 12);
        myList.set(0, 4);
        myList.remove(1);
        System.out.println(myList.size());

        // Les Ensemble - collection non ordonnée
        Set<String> ingredients = new HashSet<String>();
        ingredients.add("egg");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");
        ingredients.remove("salt");
        System.out.println(ingredients.size());

        // Dictionnaire ou "maps"
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Jenny", 34);
        myMap.put("Livia", 28);
        myMap.put("Paul", 31);
        myMap.put("jenny", 21);
        System.out.println(myMap.get("Jenny")); // -> 34
        System.out.println(myMap.get("jenny")); // -> 21

        Car car = new Car();
        Car carToPaint = car;
        System.out.println(car.color);
        System.out.println(carToPaint.color);
        carToPaint.color = "yellow";
        System.out.println(car.color);
        System.out.println(carToPaint.color);


    }
}
