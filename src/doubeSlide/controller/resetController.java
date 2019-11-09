package doubeSlide.controller;

import doubeSlide.model.Model;
import doubeSlide.view.SlidedApp;

public class resetController {
	Model model;
	SlidedApp app;

	public resetController(Model m, SlidedApp a) {
		// TODO Auto-generated constructor stub
		model = m;
		app = a;
	}

	public void reset() {
		// TODO Auto-generated method stub
		model.resetPuzzle();
	}

}
