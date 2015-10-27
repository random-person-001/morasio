/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.adventure;

/**
 *
 * @author 104410
 */
public class Protaganist {
    public int baseAttack = 3;
    public int baseDefend = 3;
    public boolean dead = false;
    public int turns = -1;

    /**
     *The nodes, in order, that the character has visited.  Takes care of half the irregulars.
     */
    public String [] path = new String [200];
    
    public Util u = new Util();
    
    public void hi (){
        u.p("hi");
    }
}

