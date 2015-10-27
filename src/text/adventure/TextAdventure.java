/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package text.adventure;


public class TextAdventure{

    
/**
 *
 * @author Riley the Great
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
    
    public void p(String toPrint){   // Simplify writing code
        System.out.println(toPrint);
    }
    
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\nLoading world(s?) ...");
        Canada canada = new Canada();
        Morasio morasio = new Morasio();
        Iceland iceland = new Iceland();
        moonBase moonbase = new moonBase();
        String land = "MOONBASE";
        Protaganist you = new Protaganist();
        System.out.println("... Done!");
        while (!you.dead) {
            System.out.println(land);
            switch (land){
                    case "MORASIO":
                        land = morasio.main(you);
                        break;
                        
                    case "CANADA":
                        land = canada.main(you);
                        break;
                        
                    case "ICELAND":
                        land = iceland.main(you);
                        break;
                        
                    case "MOONBASE":
                        land = moonbase.main(you);
                        break;
                        
                    default:
                        System.out.println("Bro, it returned something that wasn't a recognized land.  \n  Ensure proper capitolization in the return statement.");
                        return;
            }
            Thread.sleep(5000);  //Delay going between worlds.
            System.out.println("\nYou're going on to a whole new world!\n");
        }
        System.out.println("\nHave fun in heaven!");
    }
    /*
    private String line="aabbacc";
    private int findString (String str, int start){
        int index1, index2;
        str = str.substring(start);
        boolean atEnd = false;
        while(!atEnd){
            index1 = line.indexOf(str);
            if (index1 == -1){
                atEnd = true;
                return -1;
            }
            index2 = line.substring(index1).indexOf(str);
            if(index1+1 == index2){ //doubles
                //pass
            }
            else {
                return -1;
            }
        }
    }*/
}
