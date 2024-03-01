package Lab1_1;

public class Ex_2 {
	
	public static void main(String[] args) {
		int[][] M1 = {
				{2,3,1},
				{7,1,6},
				{9,2,4}};
		
		int[][] M2 = {
				{8,5,3},
				{3,9,2},
				{2,7,3}};
		int SumMat[][] = new int[3][3];
		int MultiplyMat[][] = new int[3][3];
		
		for(int i = 0; i<3; i++) {
			for(int j = 0;j<3; j++) {
				SumMat[i][j] = 0;
				SumMat[i][j] += M1[i][j] + M2[i][j];
				System.out.print(SumMat[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				MultiplyMat[i][j] = 0;
				for(int k = 0;k<3;k++) 
					MultiplyMat[i][j]+=M1[i][k]*M2[k][j];
				System.out.print(MultiplyMat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
