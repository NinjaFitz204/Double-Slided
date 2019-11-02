package doubeSlide.controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import doubeSlide.model.Model;
import doubeSlide.view.SlidedApp;

public class moveController extends MouseAdapter {
		Model model;
		SlidedApp app;
		
		public moveController(SlidedApp app, Model m) {
			this.app = app;
			this.model = m;
		}
		
		public void mousePressed(MouseEvent me) {
			System.out.println(me.getPoint());
		}
	}


