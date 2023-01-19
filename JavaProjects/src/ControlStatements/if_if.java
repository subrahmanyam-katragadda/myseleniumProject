package ControlStatements;

public class if_if {
	void rama() {
		String name ="koti";
		String state ="ap";
		String nation="india";
		int age=25;
		int salary=100000;
		
		if(name=="koti") {
			if(state=="ap") {
				if(nation=="india") {
					if(age==25) {
						if(salary==100000) {
							System.out.println("congrates");
						}
						else {
							System.out.println("your are salary is lessthan 100000");
						}
						}
					else {
						System.out.println("your are age is lessthan 25");
					}
				}
				else {
					System.out.println("your are not indian");
				}
			}
			else {
				System.out.println("your are not ap");
			}
		}
		else {
			System.out.println("your are not koti");
		}
		
		}
		public static void main(String [] args) {
			if_if obj=new if_if();
			obj.rama();
		}
}
