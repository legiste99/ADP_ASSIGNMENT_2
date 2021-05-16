package za.ac.cput.legiste;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Legiste Ndabashinze - 217046207
 *  ADP3 - Assignment 2
 */

public class Collection_ {

    static Collection times_table = new ArrayList<String>();

    public static void Add(int num) {
        int i = 1;
        while (i <= 12) {
            times_table.add(i * num);
            i++;
        }
    }

    public static boolean Remove(int num) {

        if (times_table.isEmpty()) {
            System.out.println(num + "FAILED TO REMOVE! - Empty Collection");
            return false;
        } else if (times_table.contains(num)) {
            times_table.remove(num);
            System.out.println(num + " has been REMOVED");
            return true;
        } else {
            System.out.println(num + " NOT FOUND!, FAILED TO REMOVE!");
            return false;
        }

    }

    public static boolean Find(int num) {
        if (times_table.isEmpty()) {
            System.out.println("Empty Collection - number NOT FOUND");
            return false;
        } else if (times_table.contains(num)) {
            //int index = times_table;
            System.out.println("number FOUND");
            return true;
        } else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (times_table.isEmpty()){
            System.out.println("Collection is Empty");
            return true;
        }
        else{
            System.out.println("Collection is NOT Empty");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Default data of 5 times table");
        Add(5);
        System.out.println(times_table+"\n");

        System.out.println("Searched 10:");
        Find(10);
        System.out.println(times_table+"\n");

        System.out.println("Removed 10:");
        Remove(10);
        System.out.println(times_table+"\n");

        System.out.println("Trying to removed 10 that don't exist anymore ");
        Remove(10);
        System.out.println(times_table+"\n");

        System.out.println("Searching 10 which has been removed...");
        Find(10);
        System.out.println(times_table+"\n");
    }
}
