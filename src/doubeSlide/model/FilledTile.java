package doubeSlide.model;

public class FilledTile extends Tile{
	/**
	 * number on black side
	 */
	private final int black;
	/**
	 * number on gray side
	 */
	private final int gray;
	/**
	 * true if black is up
	 * false if gray is up
	 */
	private boolean flipped;
	
	/**
	 * creates Filled Tile object
	 * @param gry - number on the gray side
	 * @param flip - true if gray is up
	 */
	public FilledTile(int gry, boolean flip) {
		super();
		black = 5-gry;
		gray = gry;
		flipped = flip;
	}
	
	/**
	 * sets the location of the tile
	 * @param row - row of the tile
	 * @param col - column of the tile
	 */
	public void setLocation(int row, int col) {
		location.setLocation(row,col);
	}
	
	/**
	 * 
	 * @return
	 * the number that is currently facing up
	 */
	public int getNumber() {
		return black;
	}
	
	/**
	 * @return
	 * true if black is up
	 * false if gray is up
	 */
	public boolean getFlippedStatus() {
		return flipped;
	}

}
