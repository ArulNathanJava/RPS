import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;    //https://docs.oracle.com/javase/7/docs/api/java/awt/Frame.html#setTitle(java.lang.String)
import javax.swing.JPanel;
public class VendingMachine extends JFrame{
	
	private JButton b1 = new JButton("Rock");
	private JButton b2 = new JButton("Paper");
	private JButton b3 = new JButton("Scizzor");
	public static void main(String[] args) {
		new VendingMachine();
	}

	public VendingMachine() {
		this.setSize(100, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("S.R.P.");
		ClickListener cl = new ClickListener();
		JPanel panel1 = new JPanel();
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		b1.addActionListener(cl);
	    this.add(panel1);
		this.setVisible(true);
	}
	
	private class ClickListener implements ActionListener {
		
	    public void actionPerformed(ActionEvent e) {
	    	
	    }
	}
}

/*
public class MainClass extends JFrame {   //use the code from the JFrame class , no need to write your own setTitle method
  private JButton button1 = new JButton("Click Me!");

  public static void main(String[] args) {
    new MainClass();
  }
  public MainClass() {
    this.setSize(200, 100);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("I'm Listening"); //invoke the setTitle method of its superclass: JFrame

    ClickListener cl = new ClickListener(); //inner class used as an ActionListener 
    JPanel panel1 = new JPanel(); //panels are containers to add your GUI components- textBoxes, buttons, etc. 
    
    button1.addActionListener(cl); //associate an ActionListener, it will automatically run actionPerformed method when button is clicked
    panel1.add(button1); //JPanel is a subclass of Container class inherits the method add, and adds button1 component to the panel
    this.add(panel1); //add panel to Jframe

    this.setVisible(true); //make JFrame visible
  }

  private class ClickListener implements ActionListener {  //https://docs.oracle.com/javase/7/docs/api/java/awt/event/ActionListener.html
    private int clickCount = 0;

    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button1) {
        clickCount++;
        if (clickCount == 1)
          button1.setText("I've been clicked ");
        else
          button1.setText("I've been clicked!" + clickCount + " times!");
      }
    }*/