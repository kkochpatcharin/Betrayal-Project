/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betrayalatthehouseonthehill;
import java.util.*;
/**
 *
 * @author Kevin
 */
public abstract class Card extends GameObject {
    
    private String name;
    private String description;
    
    public Card(Controller gameController) {
        super(gameController);
    }
    
    public abstract List<Player> getTargets();
    public abstract void onDraw();
    public abstract void onDiscard();
}
