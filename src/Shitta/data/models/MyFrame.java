package Shitta.data.models;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

//public class User {

	public class MyFrame extends JFrame {
		
		public MyFrame() {
			setTitle("My Application");
			setSize(400, 300);
			
			// Create a menu bar
			JMenuBar menuBar = new JMenuBar();
			JMenu fileMenu = new JMenu("File");
			JMenu editMenu = new JMenu("Edit");
			menuBar.add(fileMenu);
			menuBar.add(editMenu);
			setJMenuBar(menuBar);
			
			// Create a central widget
			JLabel centralWidget = new JLabel("Hello, World!");
			setContentPane(centralWidget);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new MyFrame();
		}
	}
	
//}
