package org.add;

public class GreensTech {
	public void greensOmr(String name) {
		System.out.println("Institute name"+name);
	}
	public void greensOmr(String name,int id) {
		
		System.out.println("Course Name"+name + "Fees"+id);
	}
	public void greensOmr(int id,String name) {
		System.out.println("Course Duration"+id + "Trainer name"+name);
	}
	public static void main(String[] args) {
		GreensTech obj=new GreensTech();
		obj.greensOmr("Greens");
		obj.greensOmr("Selenium", 17000);
		obj.greensOmr(3, "Kanista");

}
}