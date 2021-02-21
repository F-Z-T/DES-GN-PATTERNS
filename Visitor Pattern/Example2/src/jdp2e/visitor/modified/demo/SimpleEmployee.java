package jdp2e.visitor.modified.demo;

public class SimpleEmployee implements Employee{
	
	private String name;
	private String dept;
	
	private int yearsOfExperience;
	
	public SimpleEmployee(String name, String dept, int experience)
	{
	this.name = name;
	this.dept = dept;
	this.yearsOfExperience = experience;
	}
	
	public String getName()
	{
	return name;
	}
	
	public String getDept()
	{
	return this.dept;
	}
	
	public int getExperience()
	{
	return yearsOfExperience;
	}

	@Override
	public void printStructures() {
		System.out.println("\t\t" + getName() + " works in " + getDept() + " Experience :" + getExperience() + " years");
		
	}

	@Override
	public void acceptVisitor(Visitor visitor) {
		visitor.visitTheElement(this);
		
	}
	
	
	
	

}
