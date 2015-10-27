/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.adventure;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 104410
 */
public class Iceland {
    Scanner in = new Scanner (System.in);
    
    private final String arrName [] = {"ICELAND", "village", "glacier", "fightGla", "pencilG","climbMtn" ,"climb2" ,"climb3"};
    private final String arr1ac1 [] = {"village", "climb",   "fight",   "pencil",   "",       "continue" ,"further","enter"};
    private final String arr1ac2 [] = {"town",    "mountain","stay",    "weak",     "",       "climb"    ,"higher" ,"in"};
    private final String arr1to  [] = {"village", "climbMtn","fightGla","pencilG",  "death",  "climb2"   ,"mntCave","mtnCave"};
    private final String arr2ac1 [] = {"mountain","assess",  "run",     "stab",     "-",      "back"     ,"back"   ,""};
    private final String arr2ac2 [] = {"climb",   "glacier", "flee",    "weapon",   "-",      "village"  ,"village"};
    private final String arr2to  [] = {"climbMtn","glacier", "runGlac", "stabG",    "-",      "-"        ,"village"};
    private final String arr3ac1 [] = {"-",       "-",       "-",       "throw",    "-",      "-"        ,"-"      };
    private final String arr3ac2 [] = {"-",       "-",       "-",       "distract", "-",      "-"        ,"-"      };
    private final String arr3to  [] = {"-",       "-",       "-",       "distractG","-",      "-"        ,"-"      };      
    private final String arrText [] = {"It's cold, here.  Very cold.  You shiver, and pull your clothes tighter.  \n  You can climb a mountain, or venture to the village.",
                                                  "You go to the quaint, tiny village on the island, and stay in a sauna for a while. \n  You can go off and climb the huge mountain again, or assess the glacier blocking access to the dock.",
                                                              "Walking out onto the glacier, your feet become rather chilled.  As you step onto a high spot, the huge snakelike behemonth of ice comes alive, writhing like a snake below you.  \n  You can run, or fight.",
                                                                       "You are fighting a snakish, formerly abiotic, glacier!  \n  Your options are: Stab the glacier with your best weapon, or throw a distraction.",
                                                                                    "Really?  You attempt to stab a freaking glacier with a crude wooden caligraphy device?  \n  And think that that'll win?  I suppose you do stab it, with your flimsy pencil you found in the hotel.  The pencil breaks, as expected.  \n  And then the head of the great glacier-snake comes around and swollows you whole.  You die.",
                                                                                              "The mountain towers over you, a great snow-covered extinct volcanoe.  Feeling feeble and small, you slowly begin your ascent.  \n  After a few hours, you are what you estimate to be one-tenth of the way up the mountain.  \n  You can turn back, or continue onward."                                                   
    };
    
    private int searchArray(String query){
        for(int element = 0; element < arrName.length; element++){
            if(query.equals(arrName[element])){
               //System.out.println(element);
               return element;
            }
        }
        return -1;
    }
    
    
    public String main (Protaganist you) throws InterruptedException {
        Util u = new Util();
        int inode;
        String snode = "ICELAND";
        while(!you.dead){
            Thread.sleep(200);
            you.turns++;
            you.path [you.turns] = snode;
            inode = searchArray(snode);
            if (inode == -1)
                System.out.println("\n\n\n\nOh no!\nYou're trying to go somewhere that there isn't data on!");
            boolean answered = false;
            u.p("\n\nYou've been to...");
            u.p(Arrays.toString(you.path));
            u.p("");
            
            switch (snode){
                case "death":
                    System.out.println("You have died, probably due to stupid decisions.  You can restart to try again.");
                    you.dead = true;
                    break;
                case "payTicketGuy":
                    //node = util.genericPlace("You buy ferry ticket?", "buy", "Canada");
                    //if (snode.contentEquals("Canada"))
                    //    return "Canada";
                    System.out.println("You have a nice, enjoyable journey to Canada.");
                    return "CANADA";
                default: //If the node is not custom
                    System.out.println(arrText[inode]);
                    while (!answered){
                        //whatever
                        String input = in.nextLine().trim().toLowerCase();
                        if(input.equals("-")){
                            System.out.println("That wasn't a response.  That's never a response, and never will be. \n Type what you wanna do, bro.");
                        }
                        else if(input.contains(arr1ac1[inode]) || input.contains(arr1ac2[inode])){
                            snode = arr1to[inode];
                            answered = true;
                        }
                        else if(input.contains(arr2ac1[inode]) || input.contains(arr2ac2[inode])){
                            snode = arr2to[inode];
                            answered = true;
                        }
                        else if(input.contains(arr3ac1[inode]) || input.contains(arr3ac2[inode])){
                            snode = arr3to[inode];
                            answered = true;
                        }
                        else if(input.equals("")){
                            System.out.println("Please type what you want to do.");
                        }
                        else {
                            System.out.println("That wasn't recognized.  Could you rephrase that?");
                        }
                    }
                    break;
            }
        }
        return "CANADA";
    }
}
