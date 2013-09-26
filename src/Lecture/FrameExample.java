package Lecture;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FrameExample extends JFrame
{
	public FrameExample (String myTitle)
	{
		super(myTitle);
		setSize(300,300);
		setLocation(100,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		setContentPane(createPane());
		
		setJMenuBar(createMenu());
		
		setVisible(true);
		
		
	}
	
	private Container createPane()
	{
		Container pane = new JPanel();
		JLabel name = new JLabel("name");
		JTextField textField = new JTextField(10);
		pane.add(name);
		pane.add(textField);
		return pane;
	}
	
	
	private JMenuBar createMenu()
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		JMenuItem openMenu = new JMenuItem("Open File");
		JMenuItem newMenu = new JMenuItem("New File");
		fileMenu.add(openMenu);
		fileMenu.add(newMenu);
		return menuBar;
	}
	
}//End Class
