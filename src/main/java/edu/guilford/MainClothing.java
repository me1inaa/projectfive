package edu.guilford;

import java.util.Arrays;

public class MainClothing {
    public static void main( String[] args )
    {

    //instantiate 3 shirts
    Shirt shirt1 = new Shirt("Pacsun", "Blue", "Medium", "Silk", "Short");
    Shirt shirt2 = new Shirt("Target", "Red", "Large", "Cotton", "Long");
    Shirt shirt3 = new Shirt("Polo", "Green", "Small", "Wool", "Short");

    //instantiated 3 pants
    Pants pants1 = new Pants("Old Navy", "Blue", "Medium", "Cotton", "Short");
    Pants pants2 = new Pants("Levis", "Blue", "Large", "Denim", "Long");
    Pants pants3 = new Pants("American Eagle", "Black", "Small", "Denim", "Long");

    //instantiated 3 socks
    Socks socks1 = new Socks("Nike", "Black", "Medium", "Cotton", "Short");
    Socks socks2 = new Socks("Adidas", "White", "Small", "Polyester", "Short");
    Socks socks3 = new Socks("Puma", "White", "Small", "Cotton", "Short");


    //create an array of clothing
    Clothing[] clothingArray = {shirt1, shirt2, shirt3, pants1, pants2, pants3, 
        socks1, socks2, socks3};

    //use the abstract method on the array
    System.out.println("Here are the clothes: ");
    for (Clothing clothing : clothingArray) {
        System.out.println(clothing.getDescription());
    }

    //using the comparable interface to sort the clothing by brand
    System.out.println("\nHere are the clothes sorted by brand: ");
    Arrays.sort(clothingArray);
    //print out the sorted array
    for (Clothing clothing : clothingArray) {
        System.out.println(clothing.getDescription());

    }

    //using the inherited method wash() on the array
    System.out.println("\nHere are the clothes after washing: ");
    for (Clothing clothing : clothingArray) {
        clothing.wash();
        //print out the washed array
        System.out.println(clothing.getDescription());
    }

    //using polymorphism to print out the description of the clothing
    Clothing mostExpensive = shirt3;
    System.out.println("\nThe most expensive clothing is: " + mostExpensive.getDescription());
    mostExpensive = pants2;
    System.out.println("The most expensive clothing is: " + mostExpensive.getDescription());


    }
}
