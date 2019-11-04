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
	
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Location)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Location c = (Location) o; 
          
        // Compare the data members and return accordingly  
        return Integer.compare(row, c.row) == 0
                && Integer.compare(col, c.col) == 0; 
    } 
}