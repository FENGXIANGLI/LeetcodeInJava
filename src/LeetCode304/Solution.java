public class Solution {

private int [][] dp;

    public NumMatrix(int[][] matrix) {
    	if (matrix.length == 0 || matrix[0].length == 0) return;
        dp = new int[matrix.length][matrix[0].length + 1];
        for (int i =0; i< matrix.length;i++) {
        	for (int j=0;j<matrix[0].length ;j++ ) {
        		dp[i][j+1] = dp[i][j] + matrix[i][j];
        	}
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
    	int sum = 0;
        for (int i = row1;i< row2 + 1 ;i++ ) {
        	sum += dp[i][col2 + 1] - dp[i][col1];
        }
        return sum;
    }

    public static void main(String[] args) {
    	// int[] testNew =  new int[10];
    	// System.out.println(testNew[0]);
    	Solution testSolution = new Solution();
    	// testSolution
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);