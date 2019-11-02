package doubeSlide.model;

public class Puzzle {
	
	
	Tile emptyTile = new Tile();
	FilledTile tiles[] = {new FilledTile(1,false),new FilledTile(4,false),new FilledTile(3,true),new FilledTile(2,false),new FilledTile(1,false),new FilledTile(2,true),new FilledTile(3,false),new FilledTile(4,false)};
	
	public Puzzle(){
		// creates tiles
		int i =0;
		for(int r = 1; r<4;r++) {
			for(int c = 1; c<4; c++) {
				if(i==8) {
					emptyTile.setLocation(r,c);
				}
				else{
					tiles[i].setLocation(r,c);
				}
				i++;
			}
		}
	}

}
