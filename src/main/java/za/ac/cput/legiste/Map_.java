package za.ac.cput.legiste;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Legiste Ndabashinze - 217046207
 *  ADP3 - Assignment 2
 */

public class Map_ {

    static Map<Integer, String> map = new HashMap();

    public static boolean Add(){

        map.put(0, "Arron");
        map.put(1, "Barron");
        map.put(2, "Caron");
        map.put(3, "Daron");
        map.put(4, "Error");
        map.put(5, "Faron");
        map.put(6, "Garreth");
        map.put(7, "Heroine");
        map.put(8, "IronMan");
        map.put(9, "Joe-ann");

        if (map.isEmpty()){
            System.out.println("Map is Empty");
            return true;
        }
        else{
            System.out.println("Map is NOT Empty");
            return false;
        }
    }

    public static void Remove(int key){
        if (map.containsKey(key)){
            map.remove(key);
            System.out.println("KEY:"+key+" has been REMOVED");
        }
        else{
            System.out.println("KEY:"+key+" NOT FOUND!, FAILED TO REMOVE!");
        }
    }

    public static String Find(int key){
        if (map.containsKey(key)){
            System.out.println(map.get(key)+" found at KEY:" +key);
            return map.get(key).toString();
        }
        else {
            System.out.println("KEY:"+key +" NOT FOUND");
            return map.get(key).toString();
        }
    }

    public static void main(String[] args) {

        System.out.println("Default data added");
        Add();
        System.out.printf(map.toString()+"\n\n");

        System.out.println("Finding data with KEY "+0);
        Find(0);
        System.out.printf(map.toString()+"\n\n");

        System.out.println("Removing data with key "+0);
        Remove(0);
        System.out.println(map.toString()+"\n\n");

        System.out.println("Trying to Find Removed data with KEY "+0);
        Find(0);
        System.out.printf(map.toString()+"\n\n");

        System.out.println("Trying to Remove Removed data of KEY "+0);
        Remove(0);
        System.out.printf(map.toString()+"\n\n");
    }
}