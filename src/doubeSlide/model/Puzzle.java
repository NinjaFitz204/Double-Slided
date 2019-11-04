package doubeSlide.model;

public class Puzzle {
	
	
	public Tile emptyTile = new Tile();
	public FilledTile tiles[] = {new FilledTile(1,false),new FilledTile(4,false),new FilledTile(2,true),new FilledTile(2,false),new FilledTile(1,false),new FilledTile(3,true),new FilledTile(3,false),new FilledTile(4,false)};
	
	public Puzzle(){
		// creates tiles
		int i =0;
		for(int c = 0; c<3;c++) {
			for(int r = 0; r<3; r++) {
				if(i==8) {
					emptyTile.setLocation(r,c);
					emptyTile.position = 9;
				}
				else{
					tiles[i].setLocation(r,c);
					tiles[i].position = i+1;
				}
				i++;
			}
		}
	}

}
