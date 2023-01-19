package Arrays;

public class ArrayIndexOutOfBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= new int [5];
         a[0]=6;
         a[4]=9;
         a[2]=4;
         a[1]=3;
         a[3]=7;
         
         System.out.println(a[4]);
         System.out.println(a[0]);
         System.out.println(a[3]);
         
         System.out.println("Total length of array : " + a.length);
         
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         
         }
         
	}

}
