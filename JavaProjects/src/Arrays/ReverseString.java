package Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		String s= "i am good boy";
		 String reverses1= " ";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			reverses1=reverses1+s.charAt(i);
		}
		System.out.println("original string is :"+s);
         System.out.println(reverses1);
        
	}
	
	     

}
