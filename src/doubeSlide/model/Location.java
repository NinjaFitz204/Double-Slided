package doubeSlide.model;

public class Location {
	/**
	 * row of the location
	 */
	public int row;
	/**
	 * column of the location;
	 */
	public int col;
	
	public Location (int r, int c) {
		row = r;
		col = c;
	}
	
	/**
	 * sets location
	 * @param r - row
	 * @param c - column
	 */
	public void setLocation(int r,int c) {
		row = r;
		col = c;
	}
}