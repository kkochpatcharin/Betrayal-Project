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
public class Controller {
    private List<Tile> house;
    private List<Edge> edges;
    private int turn;
    private int numOriginalPlayers;
    private List<Player> activePlayers;
    private List<Tile> unusedTiles;
    private int hauntCounter;
    private Haunt haunt;
    
    public Player getPlayer(int i) {
        return this.activePlayers.get(i);
    }
    
    void initGame(List<Player> players) {
        this.activePlayers = players;
        this.numOriginalPlayers = players.size();
        for (Player p : players) p.traitor = false;
        this.hauntCounter = 0;
        this.haunt = null;
        // set up unused tiles
        this.unusedTiles = new ArrayList<>();
        this.edges = new ArrayList<>();
        // add tiles from probably some dposit
        
        this.numOriginalPlayers = players.size();
        // add basement basement landing, upper landing, basement landing to house
        this.house = new ArrayList<>();
        this.turn = 0;
    }
    
    void beginNextTurn() {
        Player currentPlayer = activePlayers.get(turn);
        if (haunt != null) {
            haunt.beginNextTurn(currentPlayer);
        }
        // yield control to game interface
    }
    
    void endCurrentTurn() {
        // regain control from game interface
        Player currentPlayer = activePlayers.get(turn);
        if (haunt != null) {
            haunt.endCurrentTurn(currentPlayer);
        }
        turn++;
        turn %= this.activePlayers.size();
    }
}
