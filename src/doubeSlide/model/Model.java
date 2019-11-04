package doubeSlide.model;

public class Model {
	
	public Puzzle puzzle;
	
	public Model() {
		puzzle = new Puzzle();
	}
	
	public FilledTile[] getTiles() {
		
		return puzzle.tiles;
	}
	
	public Tile getEmptyTile() {
		return puzzle.emptyTile;
	}
	
	public void resetPuzzle() {
		
		puzzle = new Puzzle();
	}

}
