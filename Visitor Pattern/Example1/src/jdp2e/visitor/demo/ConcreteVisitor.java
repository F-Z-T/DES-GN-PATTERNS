package jdp2e.visitor.demo;

public class ConcreteVisitor implements Visitor {
	@Override
	public void visit(MyClass myClassObject)
	{
	System.out.println("Current value of myInt="+ myClassObject.
	getMyInt());
	System.out.println("Visitor will make it double and display it.");
	System.out.println("Current value of myInt="+ 2*myClassObject.
	getMyInt());
	System.out.println("Exiting from Visitor.");
	}
}
