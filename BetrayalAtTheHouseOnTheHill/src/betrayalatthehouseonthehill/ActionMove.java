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
public class ActionMove extends PlayerAction {
    String direction;
    Edge edge;
    
    public ActionMove(Controller gameController, Edge path) {
        super(gameController);
        
        switch(path.edgeType) {
            case UNKNOWN:
                this.name = "Explore unknown?";
                break;
            case SUSPICIOUS_SHELVES:
                this.name = "Investigate suspicious shelves?";
                this.description = 
                        "A breeze fills the room. Is it coming from the shelves?  "
                        + "Isn't the "+ path.destination.name + " behind that wall?";
                break;
            case WALL_SWITCH:
                this.name = "Flip the switch?";
                this.description = 
                        "One of your friends said they found a secret switch. "
                        + "This must be the one. They said it leads to " + path.destination.name;
                break;
            case HIDDEN:
                this.name = "Investigate the room?";
                this.description = "I wonder where this goes.";
                break;
            default:
                this.name = "Move to ".concat(path.destination.name);
                this.description = "";
        }
    }
    
    @Override
    void performAction() {
        this.gameController.currentTurn.currentPlayer.currentTile = this.edge.destination;
    }
}
