/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betrayalatthehouseonthehill;

import java.util.Date;

/**
 *
 * @author Kevin
 */
public class Player extends GameObject {
    
    private String name;
    private Date birthday;
    private String description;
    
    private int[] strengthStats;
    private int strength;
    int[] speedStats;
    int speed;
    private int[] sanityStats;
    private int sanity;
    private int[] knowledgeStats;
    private int knowledge;
    
    Tile currentTile;
    boolean traitor;
    
    public Player(Controller gameController) {
        super(gameController);
    }
    
}
