package main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JFrame;

public class Main {
	public JFrame frame;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public void exitProcedure() {
		new Main();
		new Main();
		frame.dispose();
	}
	
	public Main() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setSize(100,100);
		frame.setTitle("Lol");
		Random random = new Random();
		frame.setLocation(random.nextInt(500), random.nextInt(500));
	    frame.addWindowListener(new WindowAdapter() {
	        @Override
	        public void windowClosing(WindowEvent event) {
	            exitProcedure();
	        }
	    });
	}
	
}
