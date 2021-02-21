package jdp2e.visitor.modified.demo;

import java.util.ArrayList;
import java.util.List;

public class ModifiedVisitorPatternExample {

	public static void main(String[] args) {
		System.out.println("***Visitor Pattern combined with CompositePattern Demo***\n");
		SimpleEmployee mathTeacher1 = new SimpleEmployee("Math Teacher-1","Maths",13);
		SimpleEmployee mathTeacher2 = new SimpleEmployee("Math Teacher-2","Maths",6);
		SimpleEmployee cseTeacher1 = new SimpleEmployee("CSE Teacher-1","Computer Sc.",10);
		SimpleEmployee cseTeacher2 = new SimpleEmployee("CSE Teacher-2","Computer Sc.",13);
		SimpleEmployee cseTeacher3 = new SimpleEmployee("CSE Teacher-3","Computer Sc.",7);
		CompositeEmployee hodMaths = new CompositeEmployee("Mrs.S.Das(HOD-Maths)","Maths",14);
		CompositeEmployee hodCompSc = new CompositeEmployee("Mr.V.Sarcar(HOD-CSE)", "Computer Sc.",16);
		CompositeEmployee principal = new CompositeEmployee("Dr.S.Som(Principal)","Planning-Supervising-Managing",20);
		
		hodMaths.addEmployee(mathTeacher1);
		hodMaths.addEmployee(mathTeacher2);
		hodCompSc.addEmployee(cseTeacher1);
		hodCompSc.addEmployee(cseTeacher2);
		hodCompSc.addEmployee(cseTeacher3);
		principal.addEmployee(hodMaths);
		principal.addEmployee(hodCompSc);
		System.out.println("\n Testing the overall structure");
		principal.printStructures();
		System.out.println("\n***Visitor starts visiting our compositestructure***\n");
		System.out.println("---The minimum criteria for promotion is asfollows ---");
		System.out.println("--Junior Teachers-12 years and Seniorteachers-15 years.--\n");
		Visitor myVisitor = new ConcreteVisitor();
		List<Employee> employeeContainer= new ArrayList<Employee>();
		
		for (Employee e : principal.getControls())
		{
		employeeContainer.add(e);
		}
		
		for (Employee e : hodMaths.getControls())
		{
		employeeContainer.add(e);
		}
		
		for (Employee e : hodCompSc.getControls())
		{
		employeeContainer.add(e);
		}
		
		for (Employee e :employeeContainer)
		{
		e.acceptVisitor(myVisitor);
		}
		
		
	}

}
