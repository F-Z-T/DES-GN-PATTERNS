package jdp2e.visitor.demo;

public class VisitorPatternExample {

	public static void main(String[] args) {
		System.out.println("***Visitor Pattern Demo***\n");
		Visitor visitor = new ConcreteVisitor();
		MyClass myClass = new MyClass();
		myClass.acceptVisitor(visitor);

	}

}
