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
public class Morasio {
    Scanner in = new Scanner (System.in);
    //private final String arrCust []= {"f",      "f",      "f",      "f",    "f",      "f",  "f",      "f",       "f",          "f",     "f",            "f",          "f",          "f",      "f",     "f"};
    private final String arrName []= {"MORASIO","sleep",  "sleep2", "fight","sleep3", "run","explore","MainSt",  "slums",      "bar",   "docks",        "deeperSlums","cellar",     "steal$","burnBar","stealLiquor","die" ,"payTicketGuy"  };
    private final String arr1ac1 []= {"sleep",  "sleep",  "sleep",  "",     "",       "",   "main",   "dock",    "deeper",     "cellar","stab",         "",           "lamp",       "",       "main",  ""           ,""    ,""              };
    private final String arr1ac2 []= {"rest",   "more",   "more",   "",     "",       "",   "st",     "ferry",   "further",    "stairs","kill",         "",           "knock",      "",       "st",    ""           ,""    ,""              };
    private final String arr1to  []= {"sleep",  "sleep2", "sleep3", "die",  "MORASIO","die","MainSt", "docks",   "deeperSlums", "cellar","stabTicketGuy","die",       "burnBar",    "explore","MainSt","slums"      ,"-"   ,""              };
    private final String arr2ac1 []= {"explore","explore","fight",  "-",    "-",      "-",  "slum",   "explore", "steal",      "steal", "give",         "-",          "steal",      "-",      "slums", "-"          ,"-"   ,""              };
    private final String arr2ac2 []= {"look",   "look",   "defend", "-",    "-",      "-",  "slums",  "more",    "rob",        "pickpocket","money",    "-",          "take",       "-",      "slum",  "-"          ,"-"   ,""              };
    private final String arr2to  []= {"explore","explore","fight",  "-",    "-",      "-",  "slums",  "explore", "steal$",     "steal$","payTicketGuy", "-",          "stealLiquor","-",      "slums", "-"          ,"-"   ,""              };
    private final String arr3ac1 []= {"-",      "-",      "run",    "-",    "-",      "-",  "bar",    "-",       "sleep",      "-",     "-",            "-",          "-",          "-",      "-",     "-"          ,"-"   ,""              };
    private final String arr3ac2 []= {"-",      "-",      "flee",   "-",    "-",      "-",  "tavern", "-",       "nap",        "-",     "-",            "-",          "-",          "-",      "-",     "-"          ,"-"   ,""              };
    private final String arr3to  []= {"-",      "-",      "run",    "-",    "-",      "-",  "bar",    "-",       "sleep",      "-",     "-",            "-",          "-",          "-",      "-",     "-"          ,"-"   ,""              };
    private final String arrText []= {"You wake up from the harsh cold.  The sun is sinking below the horizon, lighting up the sky with a brilliant blood red.  As another cold \nwind cuts through your thin clothes, you decide that something ought to happen. \n  You can stay here and try to get some sleep, or go explore!",
                                          "You attempt to fall asleep, but there are incessant sirens getting louder.\n  You can still go explore, or try harder to sleep.",
                                                    "The sirens blare, and cops are sweeping the neighborhood you're in.\n  As they come upon you, you can attempt to flee, to fight, or to sleep.",
                                                              "You take out your measly dagger and hold it threateningly at the cops coming around the corner.  \n Unfortunately, they have the modern miracle of guns, which allows them to kill you without putting theirselves \n in danger.  You bleed out as they take you to the hospital.",
                                                                      "Letting all the noise and commotion sweep above you, you finally settle into a restless sleep in your alleyway. \n  Press enter to continue",
                                                                                "Attempting to flee, you sprint out the alleyway, and bodyslam a cop who was also about to round the corner.  \n He fumbles for his gun, you unsuccessfully keep him from grabbing it, and he \n shoots you in the leg, ignoring your pleas.  You are taken in an ambulance, but die shortly thereafter of internal bleeding.",
                                                                                      "You discover that you are in city of Morasio, the capital of a kingdom with the same name.  It's fairly modern.\n  You can go to a crowded bar, the slums, or Main Street.",
                                                                                                "You knock on the door of 1762 Main St.  You see an old, kindly woman bustling downstairs and open the door for you.  \n You are invited to come in, and sit by the fire.  She tells you much about her son's adventures, and gives \n you enough money for a ferry ticket to the nearest island. \n  You can go back to exploring or go down to the docks.",
                                                                                                           "You wander deeper into the slums, a bad feeling settles in your gut. \n  You can wander further, attempt to take a nap, or attempt to pickpocket someone.",
                                                                                                                         "The bar is stuffy and crowded.  Drunkards talk loudly to their friends, and the bartender hurridly scurries around behind the counter. \n  You can go to the cellar, or try to pickpocket someone here.",
                                                                                                                                  "Seagulls cry and circle overhead while waves smash loudly into the wharf.  At the ferry terminal, a man is aggressively trying \n to get people to pay him for tickets onto the ferry, which leaves in three minutes. \n  You can give the ticket man your money, or attempt to stab him.",
                                                                                                                                                  "As you wander deeper into the slums, the buildings get shadier and sketchier.  A bad feeling arises in your gut about this. \n As you round another corner, you walk into a tight alley, realizing too late that you have come \n upon a drug dealer's trading spot.  Immediately recognizing you as an outsider, the residents mug you and you die, \n bleeding profusely, in a lonely adjacent alley.",
                                                                                                                                                                "Your eyes struggle to adjust to the darkness of the cellar, and you nearly slip and fall on the wet, slippery stairs.  \n The cellar appears to be filled with barrels, presumably full of alcoholic mixtures. \n  You can knock over an oil lamp, or try to steal some liquor.",
                                                                                                                                                                              "You find a man whom you estimate could not beat you in a fistfight, and inconspictuously slip his wallet out. \n You found some money inside! \n  Press enter to continue.",
                                                                                                                                                                                           "With a maniacle laugh, you knock an oil lamp over onto the wooden barrels, witch start to burn.  Soon the alcohol inside \n will make pretty blue flames, but before you are incinerated you decide to flee.  But where to? \n  There's the slums and Main Street",
                                                                                                                                                                                                      "You grab some expensive-looking bottles and stuff them into your flimsy coat.  With any luck, someone may assume you bought those. \n  You emerge into the slums--as soon as you press enter.",
                                                                                                                                                                                                                    ""     ,""
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
        String snode = "MORASIO";
        //u.
        
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
