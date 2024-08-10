 

public class QueenPossibility {
    public static void main(String[] args) {
    	int a[][] = {{0,0,3,3,1},{0,0,0,0,0},{0,0,1,1,2},{0,8,0,1,1},{0,1,1,0,5}};
    			a[1][0] = 0;
    			if(isSafe(a,1, 0)) {
    				System.out.println(true);
    			}
    			else {
    				System.out.println(false);
    			}
    }
    public static boolean isSafe(int [][]a, int row, int col) {
    	for(int i = 0;i < a.length;i++) {
    		for(int j = 0;j < a.length;j++) {
    			if(a[row][i] != 0 ) {
    				return false;
    			}
    			if(a[i][col] != 0) {
    				return false;
    			}
    			int val = row + col;
    			if(i + j == val) {
    				if(a[i][j] != 0) {
    					return false;
    				}
    			}
    			if(i >= j) {
    				int val1 = row - 1 -i;
    				int val2 = col - 1 -i;
    				if(val2 >= 0 && val1 >= 0) {
    					if(a[val1][val2] != 0) {
    						return false;
    					}
    				}
    				int val3 = row + i +1;
    				int val4 = col + i + 1;
    				if(val3 <= a.length-1 && val4 <= a.length-1) {
    					if(a[val3][val4] != 0) {
    						return false;
    					}
    				}
    			}
    			
    		}
    	}
    	return true;
    }
}