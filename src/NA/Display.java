package NA;

import javax.swing.JFrame;

public class Display {
	private JFrame frame;
	private String title;
	private int width, height;
	
	public Display (String title, int width, int height) {
		super();
		this.title = title;
		this.width = width;
		this.height = height;
		createDisplay();
	}

	public void createDisplay () {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
	}
}
