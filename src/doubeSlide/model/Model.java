package doubeSlide.model;

public class Model {
	
	private Puzzle puzzle;
	
	public Model() {
		puzzle = new Puzzle();
	}
	
	public FilledTile[] getTiles() {
		
		return puzzle.tiles;
	}

}
