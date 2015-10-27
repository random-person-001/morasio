/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package text.adventure;
import java.util.Scanner;
/**
 *
 * @author 104410
 */
public class Util {
    
    /**
     * Searches the older style of array, where aspects of a node are spread between distinct arrays
     * @param array (nameArray) (the older way of storing data for the nodes, where all the names line up in an array and so on with characteristics.)
     * @param query the node name that you want to find
     * @return the index of the first instance of query (-1 if not found)
     */
    //
    public int searchArray(String [] array, String query){
        for(int element = 0; element < array.length; element++){
            if(query.equals(array[element])){
               //System.out.println(element);
               return element;
            }
        }
        return -1;
    }
    
    /**
     * Searches the newer type of data array, that found in the MoonBase class.
     * @param data (the consolidated, newer way of storing data for the nodes.)
     * @param query -- the node name that you want to find
     * @return the index of the first instance of query (-1 if not found)
     */
        public int searchNewArray(String [] data, String query){
        for(int element = 0; element < data.length; element+=11){ //Every eleven entries, a new node is found
            if(query.equals(data[element])){
               //System.out.println(element);
               return element;
            }
        }
        return -1;
    }
    
    /**
     * Has the character visited a place in the past?  Find out with this boolean function!
     * @param query Node name in question
     * @param you 
     * @return whether you've been there or not!
     */
    public boolean beenThere(String query, Protaganist you){
        for (String place : you.path) {
            if (query.equals(place)) {
                //System.out.println(element);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Stop typing System.out.println all the time!  Just do util.p!
     * @param toPrint
     */
    public void p(String toPrint){   // Simplify writing code
        System.out.println(toPrint);
    }
    
    /**
     * Rather obsolete.
     * @param arr something to match the input to
     * @return the input, sometimes
     */
    public String input (String[] arr){
        Scanner in = new Scanner (System.in);
        String input = in.nextLine().trim().toLowerCase();
        while (true){
            int i = 0;
            while(arr.length < i){
                if(input.contains(arr[i])){
                    return input;
                }
            }
        }
    }
    
    /**
     * A rather Jared-Style branching option.  Not adopted.
     * @param placetext
     * @param option1Text
     * @param option1TextAccepted1
     * @param option1TextAccepted2
     * @param option1Return
     * @return "Morasio"
     */
    public String genericPlace (String placetext, String option1Text, String option1TextAccepted1, String option1TextAccepted2, String option1Return) {
        System.out.println(placetext);
        System.out.println("You can...");
        System.out.println(option1Text);
        Scanner in = new Scanner (System.in);
        String input = in.nextLine().trim().toLowerCase();
        while(!input.contains(option1TextAccepted1) || !input.contains(option1TextAccepted2)) {
            System.out.println("Sorry, that wasn't recognized.");
            input = in.nextLine().trim().toLowerCase();
        }
        
        return "Morasio";
    }
}
