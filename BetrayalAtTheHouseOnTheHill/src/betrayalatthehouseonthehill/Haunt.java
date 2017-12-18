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
public abstract class Haunt extends GameObject {
    
    public Haunt(Controller gameController) {
        super(gameController);
    }

    abstract void endCurrentTurn(Player currentPlayer);
    abstract void beginNextTurn(Player currentPlayer);
    
}
