package doubeSlide.controller;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		 * @param loc
		 */
		public void MoveTile(Location loc) {
			//gets location of empty tile
			Location empty = model.getEmptyTile().getLocation();

			//checks if mouse click is next to empty
			if(loc.row == empty.row || loc.row == empty.row-1 ||loc.row == empty.row+1 ) {
				if(loc.col == empty.col ||loc.col == empty.col-1 ||loc.col == empty.col+1 )
			}
			
			// move and flips tile to empty spot
			
			repaint();
			
		}
		
		/**
		 * gets the row and col of the tile that is clicked
		 */
		public void mousePressed(MouseEvent me) {
			Point point = me.getPoint();
			// gets row and column
			int col;
			int row;
			if(point.x < 100)
				col = 0;
			else if(point.x <200)
				col = 1;
			else col = 3;
			
			if(point.y < 100)
				row = 0;
			else if(point.y <200)
				row = 1;
			else row = 3;
			
			MoveTile(new Location(row,col));
		}
	}


