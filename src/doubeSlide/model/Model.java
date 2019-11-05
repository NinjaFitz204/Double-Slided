package doubeSlide.model;

public class Model {
	
	Puzzle puzzle;
	
	public Model() {
		puzzle = new Puzzle();
	}
		
	public void resetPuzzle() {
		
		puzzle = new Puzzle();
	}
	
	public Puzzle getPuzzle() {
		return puzzle;
	}
	
	public void setPuzzle(Puzzle p) {
		puzzle = p;
	}

}
