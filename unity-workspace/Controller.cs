using System;

public class Controller {
	List<Player> activePlayers;
	int numOriginalPlayers;
	List<Edge> edges;
	List<Tile> tiles;
	int hauntCounter;
	Object haunt;

	Player getPlayer(int id) {
		return activePlayers.get (id);
	}
}

