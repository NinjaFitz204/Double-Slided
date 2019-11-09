package doubeSlide.model;

public class Model {
	
	Puzzle puzzle;
	
	public Model() {
		puzzle = new Puzzle();
	}
	
	/**
	 * resets the puzzle
	 */
	public void resetPuzzle() {
		
		puzzle = new Puzzle();
	}
	
	/**
	 * 
	 * @return the puzzle
	 */
	public Puzzle getPuzzle() {
		return puzzle;
	}
	
	/**
	 * sets the puzzle
	 * @param p
	 */
	public void setPuzzle(Puzzle p) {
		puzzle = p;
	}

}
