//View.java
//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)

//inspired by Joseph Bergin's MVC gui at http://csis.pace.edu/~bergin/mvc/mvcgui.html

//View is an Observer

import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame; 
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	//for CloseListener()
import java.awt.event.WindowAdapter;	//for CloseListener()
import java.lang.Integer;		//int from Model is passed as an Integer
import java.util.Observable;		//for update();

class View implements java.util.Observer {

	//attributes as must be visible within class
	private TextField myTextField;
	private Button button; 

	//private Model model;		//Joe: Model is hardwired in, 
					//needed only if view initialises model (which we aren't doing)
	
	View() {
		System.out.println("View()");	
		
		//frame in constructor and not an attribute as doesn't need to be visible to whole class
		Frame frame 		= new Frame("simple MVC");
		frame.add("North", new Label("broken counter"));

		myTextField 		= new TextField();
		frame.add("Center", myTextField);

		//panel in constructor and not an attribute as doesn't need to be visible to whole class
		Panel panel 		= new Panel();
		button	 		= new Button("PressMe");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(200,100);
		frame.setLocation(100,100);
		frame.setVisible(true);

	} //View()

	// Called from the Model
    	public void update(Observable obs, Object obj) {


		//parse obj
		myTextField.setText("" + ((Integer)obj).intValue());	//obj is an Object, need to cast to an Integer

    	} //update()

	//to initialise TextField
	public void setValue(int v){
    		myTextField.setText("" + v);
	} //setValue()
    	
	public void addController(Controller controller){
		System.out.println("View      : adding controller");
		button.addActionListener(controller);	//need controller before adding it as a listener 
	} //addController()


	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} //windowClosing()
	} //CloseListener

} //View