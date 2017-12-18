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
    String name;
    boolean[] possibleFloors;
    int currentFloor;
    boolean[] doors;
    Direction orientation;
    Edge north, east, south, west;
    List<Edge> allEdges;

    public Tile(Controller gameController) {
        super(gameController);
    }
     
}
