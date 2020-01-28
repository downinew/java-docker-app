package Base;

import java.awt.Canvas;
import javax.swing.JFrame;
import Constants.Names;

public class Main {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame(Names.WindowName);
		
		frame.setSize(500, 500);
		
		Canvas canvas = new Canvas();
		
		frame.add(canvas);
		
		
		
		frame.setVisible(true);
	}

}
