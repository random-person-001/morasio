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
 * @author riley
 */
public class moonBase {
    private static String data [] = {
    //   NAME        1[accepted 1   accepted 2  where to?]    2[accepted 1   accepted 2         where to?]    3[accepted 1    accepted 2  where to?]         Text
        "MOONBASE",     "up",       "look",     "lookUp",       "explore",      "around",       "explore",      "pickpocket",   "steal",    "pickpocket",   "Hopping off of the ferry, you look around.  Men dressed in lab coats are a common sight here, and the standard of living is unusually high.  \n  You can look up, pickpocket someone, or start exploring the island.",
        "pickpocket",   "run",      "away",     "run",          "surrender",    "give",         "surrender",    "-",            "-",        "-",            "You sidle up to a whitecoat, but as you try to slip your hand into a bulging pocket, the man notices and with startling swiftness puts you into a headlock.  \n  You can run away, or try to surrender.",
        "lookUp",       "explore",  "around",   "explore",      "obelisk",      "to ",          "elevator",     "-",            "-",        "-",            "You crane your neck, straining to see the top of a spindly tower, but even on this clear day, the top of the tower is lost to the haze of the atmosphere.  \n  You can look at it closer, or go explore the island.",
        "run",          "",         "",         "docks",        "-",            "-",            "-",            "-",            "-",        "-",            "Stumbling, you run away.  You are not persued. \n  Press enter to discover your fate.",
        "surrender",    "",         "",         "docks",        "-",            "-",            "-",            "-",            "-",        "-",            "Stumbling as you are apathetically dropped, you flee.  \n  Press enter to discover your fate.",
        "docks",        "follow",   "crates",   "followCrates", "obelisk",      "back",         "elevator",     "-",            "-",        "-",            "As you stand at the cargo terminal, you see a suspcious lot of crates being unloaded.  Sneaking closer (as the area is for authorized personnel only), you see biohazard symbols on them.  You have a feeling that this is a illicit operation.  \n  You can: follow the crates, or go to the obelisky thingy.",
        "followCrates", "steal",    "yes",      "stealCrate",   "no",           "leave",        "elevator",     "-",            "-",        "-",            "Enjoying the thrill of an adventure, you sneak parellel to the movements of the crates, darting behind vehicles and hiding behind large crates.  You're invested in this now.  \n The authorized personnel go on lunch break, and post a guard.  The guard is looking the other way.  \n  Do you wish to steal a crate?",
        "stealCrate",   "",         "",         "elevator",     "-",            "-",            "-",            "-",            "-",        "-",            "Darting out from behind your hiding place, you grab a crate.  It's surprisingly heavy, you discover, as you haul it to safety.  You thought that you might have seen some cameras, so you change your cloak and discreetly carry the crate to the hilly other side of the small island.  Here, opening it, you discover that it contains: XXXXXX!  \n  You manage to stroll casually back to the more urban sect of the island.",
        "elevator"
    
    };
    private final static int _node = 0;
    private final static int _1ac1 = 1;
    private final static int _1ac2 = 2;
    private final static int _1to =  3;
    private final static int _2ac1 = 4;
    private final static int _2ac2 = 5;
    private final static int _2to =  6;
    private final static int _3ac1 = 7;
    private final static int _3ac2 = 8;
    private final static int _3to =  9;
    private final static int _text = 10;
    Scanner in = new Scanner (System.in);
    
    public String main (Protaganist you) throws InterruptedException {
        Util u = new Util();
        int inode;
        String snode = "MOONBASE";
        
        while(!you.dead){
            Thread.sleep(200);
            you.turns++;
            you.path [you.turns] = snode;
            inode = u.searchNewArray(data,snode);
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
                    
                                       
                    
                default: //If the node is not custom
                    u.p(data[inode]);
                    System.out.println(inode);
                    u.p(data[_text+inode]);
                    while (!answered){
                        //whatever
                        String input = in.nextLine().trim().toLowerCase();
                        if(input.equals("-")){
                            u.p("That wasn't a response.  That's never a response, and never will be. \n Type what you wanna do, bro.");
                        }
                        else if(input.contains(data[_1ac1+inode]) || input.contains(data[_1ac2+inode])){
                            snode = data[_1to+inode];
                            answered = true;
                        }
                        else if(input.contains(data[_2ac1+inode]) || input.contains(data[_2ac2+inode])){
                            snode = data[_2to+inode];
                            answered = true;
                        }
                        else if(input.contains(data[_3ac1+inode]) || input.contains(data[_3ac2+inode])){
                            snode = data[_3to+inode];
                            answered = true;
                        }
                        else if(input.equals("")){
                            u.p("Please type what you want to do.");
                        }
                        else {
                            u.p("That wasn't recognized.  Could you rephrase that?");
                        }
                    }
                    break;
            }
        }
        return "CANADA";
    }
    
    
}
