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
public class Tile extends GameObject {
    private String name;
    private boolean[] possibleFloors;
    private int currentFloor;
    private Edge north, south, east, west;
    private List<Edge> allEdges;

    public Tile(Controller gameController) {
        super(gameController);
    }
    
}
