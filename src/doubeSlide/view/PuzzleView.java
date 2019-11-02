package doubeSlide.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import doubeSlide.model.*;

/**
 * draws the tiles onto the board
 * @author Zack
 *
 */
public class PuzzleView extends JPanel{
	Model model;
	
	public PuzzleView(Model m) {
		model = m;
	}
	
	public void paintComponent(Graphics g) {
		//loops through tiles to draw them
		FilledTile tiles[] = model.getTiles();
		for(int i = 0; i<8; i++) {
			FilledTile tile = tiles[i];
			Location location = tile.getLocation();
			int row = location.row;
			int col = location.col;
			
			//sets color to draw Tile
			if (tile.getFlippedStatus())
				g.setColor(Color.GRAY);
			else
				g.setColor(Color.BLACK);
			
			
			
		}
	}

}
