package doubeSlide.controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import doubeSlide.model.FilledTile;
import doubeSlide.model.Location;
import doubeSlide.model.Model;
import doubeSlide.view.SlidedApp;

public class moveController extends MouseAdapter {
	Model model;
	SlidedApp app;

	public moveController(SlidedApp app, Model m) {
		this.app = app;
		this.model = m;
	}

	/**
	 * moves the tile that is clicked on the the empty tile
	 * 
	 * @param loc
	 */
	public void MoveTile(Location loc) {
		// gets location of empty tile
		Location empty = model.getEmptyTile().getLocation();
		System.out.print(" ");
		System.out.print(empty.row);
		System.out.println(empty.col);

		// return out of method if clicked on empty tile
		if (loc.equals(empty)) {
			return;
		}

		int clickedTile = 0;

		// checks if mouse click is next to empty

		if ((loc.row == empty.row && (loc.col == empty.col + 1 || loc.col == empty.col - 1))
				|| (loc.col == empty.col && (loc.row == empty.row + 1 || loc.row == empty.row - 1))) {
			// move and flips tile to empty spot
			for (int i = 0; i < 9; i++) {
				if (model.puzzle.tiles[i].getLocation().row == loc.row
						&& model.puzzle.tiles[i].getLocation().col == loc.col) {
					clickedTile = i;
					break;
				}
			}
		}else {
			return;
		}

		// swaps position of the empty and clicked tile
		int pos = model.puzzle.tiles[clickedTile].position;
		model.puzzle.tiles[clickedTile].location = empty;
		model.puzzle.tiles[clickedTile].position = model.puzzle.emptyTile.position;
		model.puzzle.tiles[clickedTile].flip();
		model.puzzle.emptyTile.location = loc;
		model.puzzle.emptyTile.position = pos;

		app.repaint();

		isWin();
		isLose();

	}

	public void isWin() {
		
		boolean isWinning = true;
		
		//test if tiles are in right place
		for(FilledTile tile: model.puzzle.tiles) {
			switch (tile.position) {
			case(1):
				if(!(tile.flipped && tile.getNumber() == 1))
					isWinning = false;
				break;
			case(2):
				break;
			case(3):
				break;
			case(4):
				break;
			case(5):
				break;
			case(6):
				break;
			case(7):
				break;
			case(8):
				break;
			case(9):
				break;
			}
			//breaks out if a tile is out place
			if(!isWinning)
				return;
		}

	}

	public void isLose() {

	}

	/**
	 * gets the row and col of the tile that is clicked
	 */
	public void mousePressed(MouseEvent me) {
		Point point = me.getPoint();
		// gets row and column
		int col;
		int row;
		if (point.y < 100)
			col = 0;
		else if (point.y < 200)
			col = 1;
		else
			col = 2;

		if (point.x < 100)
			row = 0;
		else if (point.x < 200)
			row = 1;
		else
			row = 2;

		System.out.print(row);
		System.out.print(col);

		MoveTile(new Location(row, col));
	}
}
