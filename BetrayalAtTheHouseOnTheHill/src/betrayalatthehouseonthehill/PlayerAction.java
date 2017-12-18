/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betrayalatthehouseonthehill;

/**
 *
 * @author Kevin
 */
public abstract class PlayerAction extends GameObject {
    
    protected String name;
    protected String description;
    
    
    public PlayerAction(Controller gameController) {
        super(gameController);
    }
    abstract void performAction();
}
