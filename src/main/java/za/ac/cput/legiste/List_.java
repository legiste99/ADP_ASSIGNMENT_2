package za.ac.cput.legiste;

import java.util.*;

/**
 * @author Legiste Ndabashinze - 217046207
 *  ADP3 - Assignment 2
 */

public class List_ {

    static List<String> suburbs;
    public static boolean Add(){

        suburbs = Arrays.asList(
                "Belhar",
                "Belhar",
                "Elsie's River",
                "Goodwood",
                "Kensington",
                "Kraaifontein",
                "Kuils River",
                "Maitland",
                "Panorama",
                "Parow");
        return true;
    }

    public static boolean Remove(int index){ //Remove By Index
        if (suburbs.contains(index)){
            suburbs.remove(index);
            System.out.println("Data with Index ["+index+"] HAS BEEN REMOVED");
            return true;
        }
        else{
            System.out.println("Data with Index ["+index+"] NOT REMOVED, INDEX NOT FOUND");
            return false;
        }
    }

    public static String Find(int index){ //Find by Index
        System.out.println(suburbs.get(index));
        return suburbs.get(index);
    }

    public static void main(String[] args) {

        System.out.println("data:");
        Add();
        System.out.println(suburbs.toString()+"\n");

        System.out.println("Removing :"+1);
        Remove(1);
        System.out.println(suburbs.toString()+"\n");

        System.out.println("Finding Data At Index 5");
        Find(5);

    }
}