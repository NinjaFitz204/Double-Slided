package doubeSlide.model;

public class Tile {
	/**
	 * location of the tile
	 */
	protected Location location;
	
	public Tile() {

	}
	
	/**
	 * sets location of the tile
	 * @param row
	 * @param col
	 */
	public void setLocation(int row, int col) {
		location.setLocation(row,col);
	}
	
	/**
	 * returns location of the tile
	 * @return Location
	 */
	public Location getLocation() {
		return location;
	}

}