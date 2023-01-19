package Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][]= {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		for(int a=0;a<4;a++) {
		for(int b = 0; b<4;b++) {
		System.out.print(arr[a][b]+ " ");
		}
		System.out.println();
	}

}
}