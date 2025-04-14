package multi_dimen_array;

public class column_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry;
		arry = new int[3][3];
		int sum = 0;
		for(int i=0; i<arry.length; i++) {
		for(int k=0; k<arry[i].length; k++) {
		arry[i][k] = (3*i) + k;
		}
		}
		for(int i=0; i<arry.length; i++) {
		sum = 0;
		for(int k=0; k<arry[i].length; k++) {
		sum = sum + arry[k][i];
		}
		System.out.println("Sum the "+i+" row : "+ sum);
		}
	}}
