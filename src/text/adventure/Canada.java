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
public class Canada {/*
    Scanner in = new Scanner (System.in);
    String returnToAfterCaribouing;
                 //irregulars include: search2, killMonster, village, sneakMonster
    private final String arrName []= {"CANADA",    "pickpocket","hotel",  "explore","forest",  "forest2",      "attackMonster","watchMonster","killMonster","stealCoat","slapCheek", "port",   "scareCaribou",   "slapCheek2","takeTunic","talkCaribou",};
    private final String arr1ac1 []= {"pickpocket","",          "search", "village","continue","yell",         "duck",         "",            "",           "also",     "again",     "",       "",               "",          };
    private final String arr1ac2 []= {"locals",    "",          "steal",  "town",   "deeper",  "charge",       "dive",         "",            "",           "take",     "slap",      "",       "",               
    private String arr1to  []= {"pickpocket","hotel",     "hotel2", "village","forest2", "attackMonster","watchMonster", "village",     "village",    "takeTunic","slapCheek2","ICELAND",returnToAfterCaribouing,
    private final String arr2ac1 []= {"hotel",     "-",         "explore","forest", "back",    "sneak",        "sit",          "-",           "-",          "no",       "stop",      "-",      "-",              
    private final String arr2ac2 []= {"sleep",     "-",         "island", "tree",   "village", "surprise",     "fright",       "-",           "-",          "back",     "back",      "-",      "-",              
    private final String arr2to  []= {"hotel",     "-",         "explore","forest", "village", "sneakMonster", "watchMonster", "-",           "-",          "village",  "village",   "-",      "-",              
    private final String arr3ac1 []= {"-",         "-",         "-",      "-",      "-",       "-",            "stab",         "-",           "-",          "-",        "-",         "-",      "-",              
    private final String arr3ac2 []= {"-",         "-",         "-",      "-",      "-",       "-",            "kill",         "-",           "-",          "-",        "-",         "-",      "-",              
    private final String arr3to  []= {"-",         "-",         "-",      "-",      "-",       "-",            "killMonster",  "-",           "-",          "-",        "-",         "-",      "-",              
    private final String arrText []= {"Canada!  You savor the word as you whisper it.  You have heard very good things about the hospitality \n of these people, and think it'd be a perfect place for you.  No police, nice people, the whole like. \n You have a feeling \n you'll like it here.  \n  From the docks, you can go straight to the hotel, or try pickpocketing the locals first.",
                                                   "As you bustle through the thin crowds, you discreetly slip a hand into a man's pocket, and remove what \n feels to be a wallet.  Upon later inspection, you learn that inside it was some cash and a used plastic \n spoon.  \n  Press enter to retire to the hotel for the night.",
                                                                "The receptionist of the hotel politely points you to your room upstairs.  After settling down from an \n interesting day, you take a quick nap.\n  Refreshed, you decide to either explore the big hotel, or pack up and go explore the island.",
                                                                          "It is a beautiful day to be out.  Sunshine warms your back, while fiery-colored leaves swirl in the eddies\n of the crisp autumn breeze.  From inquiring the locals, you discover that the village is actually \n a ways removed from the port.  Maple trees are predominant on this island, and you have an uncanny feeling \n that they are watching you when you gaze at them.  \n  Do you want to wander the forest, or go to the village?",
                                                                                    "The light lessens as you enter the forest.  The uncanny feeling of the trees being aware of your presence \n increases.  You have no idea why these arboreal multicellular organisms creep you out.  \n  You can venture deeper, or turn back.",
                                                                                               "Thankfully, you stumble upon a clearing, and are relieved by the sudden light.  However, you see quickly \n that you have larger problems to worry about.  A hideous monster across the clearing is gnawing sloppily \n on what appears to be flesh, facing the other way. \n  In the few moments you have before it notices you, you can attempt to sneak up on it and \n  surprise attack it, or you can yell and charge at it.",
                                                                                                               "You decide to attack the monster (with your main weapon, which would be a sweet sword if you explored \n the hotel a while, and a flimsy dagger otherwise).  The monster whirls around ferociously, and lunges \n at you.  \n  While it's flying toward you, you can duck, sit in fright, or try to stab it as it comes.",
                                                                                                                               "As the monster comes closer, you take no offensive move toward it.  Soon, however, you are confused, as \n it flies in over your head, against the tree.  Quickly, however, you realize that the tree's jail-like \n roots coming up around you weren't there when you came, and how much darker it became when the branches \n began to arc down to make a roof over you.  Meanwhile, the creature thoroughly destroyed the tree, \n and comes over to speak to you.  After seeing what the trees here do, you ask it directions to the \n port from the village, which it conveys willingly, even giving you a bottle of maple syrup (\"The \n boiled blood of my enemies!\", it declared proudly) to take with.  \n  You decide to return to the village.",
                                                                                                                                             "You bravely hold out your blade at the beast coming at you, but it is coming in high.  You actually \n have to jump to stab the atrocity as it flies over your head.  In the next half second, you realize \n that it was never coming for you.  It was lunging at the large maple tree behind you, whose roots had \n begun to form a cage about you and branches started arcing down.  The poor beast, who had lept to \n protect you, had been killed by your own hand.The monster writhes in pain, and collapses, bleeding \n profusely, at your feet.  You murdered it.  Then, you see that it was only munching some old, \n discolored tofu from the dump, and was -- to your surprise -- writing a letter apparently to a \n relative, consoling them in the sudden and unexpected loss of their daughter to careless humans. \n Emotionally damaged from what you have done, you unstably wander back to the village.  \n  Press enter.",
                                                                                                                                                            "You steal a man's trenchcoat.  A kindly man, he offers you his tunic as well.  \n  Do you take the tunic or not?",
                                                                                                                                                                       "Giggling slightly in anticipation, you approach a complete stranger and slap them, hard, on the cheek.  In response, the stranger offers you the other cheek.  \n  Do you slap the other cheek as well, or decide to be a nice person?",
                                                                                                                                                                                     "You're at the port.  Yay. Press enter for iceland",
                                                                                                                                                                                                "The caribou runs off, triggering the whole herd to follow.  Soon, all of Canada is clensed of the terriable caribou, now that they are largely failing to swimm off of the cliffs in the Henious Seas."
    };
    
    
    
    
    */
    public String main (Protaganist you) throws InterruptedException {return "";}/*
        //Util util = new Util();
        ///new String() input = util.input(["hi","sup"]);
        int inode;
        String snode = "CANADA";
        int arriveTurns = you.turns;
        
        while(!you.dead){
            Thread.sleep(200);
            you.turns++;
            you.path [you.turns] = snode;
            inode = searchArray(snode);
            if (inode == -1)
                p("\n\n\n\nOh no!\nYou're trying to go somewhere that there isn't data on!");
            boolean answered = false;
            p("\n\nYou've been to...");
            p(Arrays.toString(you.path));
            p("");
            
            
            if (you.turns == arriveTurns + 10){  //Meet the Ambassitor: Special Case!
                returnToAfterCaribouing = snode;
                p("As you go about that, a caribou approaches you with a brisk stride.  It appears to be wearing a tux. \n  You can throw something at it, try to talk to it, yell at it, or ignore it.");
                while (!answered){
                    String input = in.nextLine().trim().toLowerCase();
                    if (input.toLowerCase().contains("yell") || input.toLowerCase().contains("scare") || input.toLowerCase().contains("distract") || input.toLowerCase().contains("throw")){
                        answered = true;                        snode = "scareCaribou";                    }
                    if (input.toLowerCase().contains("talk") || input.toLowerCase().contains("diploma") || input.toLowerCase().contains("ignore") || input.toLowerCase().contains("continue")){
                        answered = true;                        snode = "talkCaribou";                     }
            }   }
            
            
            switch (snode){
                case "death":
                    p("You have died, probably due to stupid decisions.  You can restart to try again.");
                    you.dead = true;
                    break;
                    
                
                
                case "ICELAND":
                    p("");
                    
                    
                    
                case "village":
                    boolean canPort = false;
                    if (beenThere("killMonster", you)  || beenThere("watchMonster", you) ){        canPort = true;                             }
                    
                    p("You're in the village!");
                    if (!canPort){                      p("  You can slap, steal coat, or forest");                               }
                    else{                               p("  You can slap, steal coat, or port!");                                }
                    
                    while (!answered){
                        String input = in.nextLine().trim().toLowerCase();
                        if(input.contains("slap") || input.contains("cheek")){                             snode = "slapCheek";   answered=true;   }
                        else if(input.contains("coat") || input.contains("steal")){                        snode = "stealCoat";   answered=true;   }
                        else if(!canPort && (input.contains("forest") || input.contains("explore"))){      snode = "slapCheek";   answered=true;   }
                        else if(canPort && (input.contains("port") || input.contains("docks"))){           snode = "port";        answered=true;   }
                        else if(input.equals("")){          p("Please type what you want to do.");                                }
                        else {                              p("That wasn't recognized.  Could you rephrase that?");               }
                    }
                    break;
                    
                    
                    
                default: //If the node is not custom
                    p(arrText[inode]);
                    while (!answered){
                        String input = in.nextLine().trim().toLowerCase();
                        if(input.equals("-")){
                            p("That wasn't a response.  That's never a response, and never will be. \n Type what you wanna do, bro.");
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
                            p("Please type what you want to do.");
                        }
                        else {
                            p("That wasn't recognized.  Could you rephrase that?");
                        }
                    }
                    break;
            }
                    
                    
        
        }
        return "dead";
    }*/
    
}
