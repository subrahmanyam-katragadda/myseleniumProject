package OOPS;

public class Inheritances {

	void dog (int a,int b) {
		System.out.println(a+b);
		}

	void bird () {
		System.out.println("phone");
	}
	void cat () {
	System.out.println("milk");
	}

	}
	class Babu2 extends Inheritances{
		void jermany() {
			System.out.println("car");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Babu2 u = new Babu2();
	u.jermany();
	u.dog(10, 50);

		}
	
}
