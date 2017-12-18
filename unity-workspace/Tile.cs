using System;

public class Tile {
	Object texture;
	Coordinate coor;
	int floor;
	bool[] possibleFloors;
	Object[] players;
	Edge northEdge, southEdge, eastEdge, westEdge;
	Edge[] otherEdges;
	CardType cardType = null;

	void addEdge (Edge edge);
	Edge[] getListOfEdges() {
		List<Edge> edgeList = new List<> ();
		if (this.northEdge != null) {
			edgeList.add (this.northEdge);
		}
		if (this.southEdge != null) {
			edgeList.add (this.southEdge);
		}
		if (this.eastEdge != null) {
			edgeList.add (this.eastEdge);
		}
		if (this.westEdge != null) {
			edgeList.add (this.westEdge);
		}
		edgeList.add (otherEdges.Clone ());
		return edgeList.toArray ();
	}

}