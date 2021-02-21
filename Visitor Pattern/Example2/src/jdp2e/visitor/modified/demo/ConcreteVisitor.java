package jdp2e.visitor.modified.demo;

public class ConcreteVisitor implements Visitor {
     
	
	@Override
	public void visitTheElement(CompositeEmployee employees) {
		
		boolean eligibleForPromotion = employee.getExperience() > 15 ?
				true : false;
		System.out.println("\t\t" + employee.getName() + " from "+ employee.getDept() + " is eligible for promotion? " + eligibleForPromotion);
	}

	@Override
	public void visitTheElement(SimpleEmployee employee) {
		boolean eligibleForPromotion = employee.getExperience() > 12 ?
				true : false;
		System.out.println("\t\t" + employee.getName() + " from " + employee.getDept() + " is eligible for promotion? " + eligibleForPromotion);
		
	}
	
	

}
