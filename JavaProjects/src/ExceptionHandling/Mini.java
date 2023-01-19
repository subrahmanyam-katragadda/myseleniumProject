package ExceptionHandling;

public class Mini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
        	 int a=100/0;
         }catch(ArithmeticException e) {
        	   System.out.println(e);
         }try {
        	 String s=null;
        	 int s1=s.length();
         }catch(NullPointerException r) {
        	 System.out.println(r);
         }try {
        	 int b[]= new int[5];
        	 b[10]=20;
         }catch(ArrayIndexOutOfBoundsException g) {
        	 System.out.println(g);
         }finally {
        	 System.out.println("Krish Mini");
         }
	}

	}


