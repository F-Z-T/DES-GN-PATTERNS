package jdp2e.visitor.modified.demo;

public interface Visitor {
	
	void visitTheElement(CompositeEmployee employees);
	void visitTheElement(SimpleEmployee employee);

}
