//Model.java
//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)

//inspired by Joseph Bergin's MVC gui at http://csis.pace.edu/~bergin/mvc/mvcgui.html

//Model holds an int counter (that's all it is).
//Model is an Observable
//Model doesn't know about View or Controller

public class Model extends java.util.Observable {	
	
	private int counter;	//primitive, automatically initialised to 0

	public Model(){

		System.out.println("Model()");

		/**
		Alternately, when instantiating model, you could run  

		setValue(0);
		*/
		

	} //Model()


	public void setValue(int value) {

		this.counter = value;
		// System.out.println("Model init: counter = " + counter);
		setChanged();
		notifyObservers(counter);

	} //setValue()
	
	public void incrementValue() {

		if (counter <= 5){
		++counter;
		// System.out.println("Model     : counter = " + counter);
		setChanged();
		//model Push - send counter as part of the message
		notifyObservers(counter);}
		else {
			counter = (counter * 3);
			setChanged();
			//model Push - send counter as part of the message
			notifyObservers(counter);
		}


	} //incrementValue()
	
} //Model