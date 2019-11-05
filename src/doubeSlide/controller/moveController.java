package doubeSlide.controller;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import doubeSlide.model.FilledTile;
import doubeSlide.model.Location;
import doubeSlide.model.Model;
import doubeSlide.model.Puzzle;
import doubeSlide.model.Tile;
import doubeSlide.view.SlidedApp;

public class moveController implements KeyListener,MouseListener {
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
	public void moveTile(Location loc) {
		Puzzle puz = model.getPuzzle();
		FilledTile[] tiles = puz.getTiles();
		Tile emptyTile = puz.getEmpty();

		int clickedTile = 0;
		// gets location of empty tile
		Location empty = puz.getEmpty().getLocation();
		System.out.print(" ");
		System.out.print(empty.row);
		System.out.println(empty.col);

		// return out of method if clicked on empty tile
		if (loc.equals(empty)) {
			return;
		}

		// checks if mouse click is next to empty
		if ((loc.row == empty.row && (loc.col == empty.col + 1 || loc.col == empty.col - 1))
				|| (loc.col == empty.col && (loc.row == empty.row + 1 || loc.row == empty.row - 1))) {
			// move and flips tile to empty spot
			for (int i = 0; i < 9; i++) {
				if (tiles[i].getLocation().row == loc.row && tiles[i].getLocation().col == loc.col) {
					clickedTile = i;
					break;
				}
			}
		}else {
			return;
		}

		// swaps position of the empty and clicked tile
		int pos = tiles[clickedTile].getPosition();
		tiles[clickedTile].setLocation(empty);
		tiles[clickedTile].setPosition(emptyTile.getPosition());
		tiles[clickedTile].flip();
		emptyTile.setLocation(loc);
		emptyTile.setPosition(pos);
		puz.addMove();
		
		//set all vars
		puz.setTiles(tiles);
		puz.setEmpty(emptyTile);
		model.setPuzzle(puz);
		//test end condition
		model.getPuzzle().endCondition();
		//redraws 	
		app.repaint();

		

	}

	/**
	 * gets the row and col of the tile that is clicked
	 */
	public void mousePressed(MouseEvent me) {
		
		//stops mouseevent if there is an endcondition
		if(!model.getPuzzle().getEndCondition().equals(""))
			return;
		
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

		moveTile(new Location(row, col));
	}

	@Override
	public void keyPressed(KeyEvent me) {
		/*
		System.out.println("keypressed");
		Location empty = model.getPuzzle().emptyTile.location;
		int row = empty.row;
		int col = empty.col;
		
		if(me.getKeyCode() == me.VK_KP_RIGHT) {
			col++;
			
		}if(me.getKeyCode() == me.VK_KP_LEFT) {
			col--;
			
		}if(me.getKeyCode() == me.VK_KP_DOWN) {
			row--;
			
		}if(me.getKeyCode() == me.VK_KP_UP) {
			row++;
		}
		
		if(row>3||col>3) {
			
		}else {
			empty.col=col;
			empty.row=row;
		}
		
		moveTile(empty);
		*/
	}

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("keyrelease");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("keytyped");
		
	}
}
