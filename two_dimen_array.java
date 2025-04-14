package multi_dimen_array;

public class two_dimen_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arry;
		
		arry = new int[3][3];
		for(int i=0; i<arry.length; i++) {
			for(int k=0; k<arry[i].length; k++) {
			arry[i][k] = (3*i) + k;
			}
			}
			for(int i=0; i<arry.length; i++) {
			for(int k=0; k<arry[i].length; k++) {
			System.out.println("Array ["+i+"]["+k+"] = "+ arry[i][k]);
			}
			}
	}}
