package doubeSlide.model;

public class Tile {
	/**
	 * location of the tile
	 */
	Location location = new Location(0,0);
	int position;
	
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
	 * sets the location of the tile
	 * @param loc
	 */
	public void setLocation(Location loc) {
		location = loc;
	}
	
	/**
	 * returns location of the tile
	 * @return Location
	 */
	public Location getLocation() {
		return location;
	}

	public int getPosition() {
		return position;
	}
	
	public void setPosition(int p) {
		position = p;
	}
}
