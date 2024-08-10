import java.util.Arrays;

public class ZigzagConvertion {
    public static void main(String[] args) {
    	String s = "PAYPALISHIRING";
    	int n = 4;
    	char[][] a = new char[n][s.length()];
    	for(int i = 0; i < n; i++) {
    		Arrays.fill(a[i], '0');
    	}
    	int  row =0, col =0;
    	boolean flag = true;
    	for(int i = 0; i < s.length(); i++) {
    		a[row][col] = s.charAt(i);
    		if(flag) {
    			if(row == n-1) {
    				flag = false;
    				row--;
    				col++;
    			}
    			else {
        			row++;
        		}
    		}
    		else {
    			if(row == 0) {
    				flag = true;
    				row++;
    			}
    			else {
    				row--;
    				col++;
    			}
    		}
    	}
    	for(int i = 0; i < n;i++) {
    		for(int j = 0;j < s.length();j++) {
    			System.out.print(a[i][j]);
    		}
    		System.out.println();
    	}
    }
}
