package doubeSlide.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import doubeSlide.controller.moveController;
import doubeSlide.model.Model;

public class SlidedApp extends JFrame {

	private JPanel contentPane;
	JPanel gamePanel;
	moveController moveController;

	/**
	 * Create the frame.
	 */
	public SlidedApp(Model model) {

		moveController = new moveController(this, model);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		gamePanel = new PuzzleView(model);
		gamePanel.addMouseListener(moveController);
		gamePanel.addKeyListener(moveController);
		gamePanel.setBounds(20, 45, 310, 350);
		contentPane.add(gamePanel);

		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(10, 11, 89, 23);
		contentPane.add(btnReset);
		// adds function to the reset button
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.resetPuzzle();
				repaint();
			}
		});

		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(240, 11, 89, 23);
		contentPane.add(btnQuit);
		// adds function to the reset button
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});

		JLabel lblNumberOfMoves = new JLabel("Number of Moves");
		lblNumberOfMoves.setBounds(120, 5, 100, 14);
		contentPane.add(lblNumberOfMoves);
	}

}
