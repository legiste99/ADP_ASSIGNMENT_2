package za.ac.cput.legiste;


import java.util.Set;
import java.util.TreeSet;

/**
 * @author Legiste Ndabashinze - 217046207
 *  ADP3 - Assignment 2
 */

public class Set_ {

    static Set<Integer> times_table = new TreeSet();

    public static boolean Add(int num){
        int i = 1;
        //int sum = num*i;
        while (i<=12){
            times_table.add(num*i);
            i++;
        }

        if (times_table.isEmpty()) {
            System.out.println("times_table is empty");
            return true;
        }
        else{
            System.out.println("times_table is NOT empty");
            return false;
        }
    }

    public static boolean Remove(int num){
        if (times_table.contains(num)){
            times_table.remove(num);
            System.out.println(num +" has been REMOVED");
            return true;
        }
        else {
            System.out.println(num +" NOT FOUND!, FAILED TO REMOVE!");
            return false;
        }
    }

    public static boolean Find(int num){
        if (times_table.contains(num)){
            System.out.println(num+": has been FOUND");
            return true;
        }
        else {
            System.out.println(num+": NOT FOUND");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Default data");
        Add(10);
        System.out.println(times_table.toString()+"\n");

        System.out.println("Searching for "+20);
        Find(20);
        System.out.println("");//found at index X

        System.out.println("Removing "+20);
        Remove(20);
        System.out.println(times_table.toString()+"\n");

        System.out.println("Removing 20 which has already been removed");
        Remove(20);
        System.out.println("");

        System.out.println("Searching 20 which has been removed");
        Find(20);
        System.out.printf("");





    }

}
