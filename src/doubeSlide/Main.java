package doubeSlide;

import doubeSlide.view.SlidedApp;
import doubeSlide.model.Model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		SlidedApp app = new SlidedApp(model);
		app.setVisible(true);
	}

}
