package doubeSlide.model;

public class Puzzle {
	
	Tile emptyTile = new Tile();
	/**
	 * array of tlies in the puzzle
	 */
	FilledTile tiles[] = {new FilledTile(1,false),new FilledTile(4,false),new FilledTile(2,true),new FilledTile(2,false),new FilledTile(1,false),new FilledTile(3,true),new FilledTile(3,false),new FilledTile(4,false)};
	/**
	 * holds the end condition 
	 */
	String endCondition = "";
	/**
	 * hold the number of moves
	 */
	int numberMoves;
	
	
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
		numberMoves = 0;
	}
	
	/**
	 * test if the puzzle is at a win or lose state
	 */
	public void endCondition() {
		String endCond = "";
		endCond += isWin();
		endCond += isLose();
		endCondition = endCond;
	}
	
	/**
	 * test if the puzzle has been won
	 */
public String isWin() {
		
		boolean isWinning = true;
		
		//test if tiles are in right place
		for(FilledTile tile: tiles) {
			switch (tile.position) {
			case(1):
				if(!(!tile.flipped && tile.getNumber() == 1))
					isWinning = false;
				break;
			case(2):
				if(!(!tile.flipped && tile.getNumber() == 2))
					isWinning = false;
				break;
			case(3):
				if(!(!tile.flipped && tile.getNumber() == 3))
				isWinning = false;
				break;
			case(4):
				if(!(tile.flipped && tile.getNumber() == 4))
				isWinning = false;
				break;
			case(5)://empty spot
				break;
			case(6):
				if(!(!tile.flipped && tile.getNumber() == 4))
					isWinning = false;
				break;
			case(7):
				if(!(tile.flipped && tile.getNumber() == 3))
					isWinning = false;
				break;
			case(8):
				if(!(tile.flipped && tile.getNumber() == 2))
					isWinning = false;
				break;
			case(9):
				if(!(tile.flipped && tile.getNumber() == 1))
					isWinning = false;
				break;
			}
			//breaks out if a tile is out place
			if(!isWinning)
				return "";
		}
		
		if(emptyTile.position!=5)
			return "";
		//need to change this to change graphic shit
		System.out.println("you win");
		return "you win";

	}

/**
 * test if the puzzle has been lost
 */
	public String isLose() {
		
		//loop through all tiles and ++ to each var if thats the number thats showing
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for(FilledTile tile: tiles) {
			switch(tile.getNumber()) {
			case(1):
				one++;
				break;
			case(2):
				two++;
				break;
			case(3):
				three++;
				break;
			case(4):
				four++;
				break;
			}
		}
		
		
		//if one of the vars is greater or equal to 4 you lose
		if(one>= 4|| two>=4 || three>=4 || four>=4 ) {
			System.out.println("you lose");
			return "you lose";
		}
		return "";
	}
	
	public FilledTile[] getTiles() {
		return tiles;
	}
	
	public void setTiles(FilledTile[] t) {
		tiles = t;
	}
	
	public Tile getEmpty() {
		return emptyTile;
	}
	
	public void setEmpty(Tile emp) {
		emptyTile = emp;
	}
	
	public String getEndCondition() {
		return endCondition;
	}
	
	public int getNumberMoves() {
		return numberMoves;
	}
	
	public void addMove() {
		numberMoves++;
	}
}


