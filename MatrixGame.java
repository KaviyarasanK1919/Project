import java.util.Scanner;

public class MatrixGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r = 5;int c = 5;
		int a [][] = new int[r][c];
		for(int i =0;i < r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = 0; 
			}
		}
		boolean run = true;
		
		int player = 1;
		while(run) {
		 if(arrayIsFill(a,r,c)) {
			System.out.println(player + " Enter Row : ");
			int x = scan.nextInt();
			System.out.println(player + " Enter Colomn : ");
			int y = scan.nextInt();
		  
			if(isValidInput(x,y,r,c)) {
				if(alreadyEnter(x,y,a)) {
					a[x][y] = player;
					printArr(a,r,c);
					if(checkWins(a,player,r,c)) {
						System.out.println(player + "Wins the game.");
						run = false;
					}
					else {
						player = (player == 1) ? 2 : 1;
					}
				}
				else {
					System.out.println("Already Entered input. ");
				}
			}
			else {
				System.out.println("Please Enter Valid Input. ");
			}
		   }
		   else {
			   System.out.println("No more Chances left .Match is tie.");
			   run = false;
		   }
		}
		scan.close();
	}
	public static boolean arrayIsFill(int a[][], int r ,int c) {
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				if(a[i][j] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean isValidInput(int x, int y, int r, int c) {
		return x >=0 && x< r && y >= 0 && y < c;
	}
	public static boolean alreadyEnter(int x , int y,int a[][]) {
		return a[x][y] == 0;
	}
	public static void printArr(int a[][], int r, int c) {
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static boolean checkWins(int a[][], int p, int r, int c) {
		for(int i =0;i<r;i++) {
			boolean rowWin = true;
			boolean colWin = true;
			for(int j =0;j<c;j++) {
				if(a[i][j] != p) {
					rowWin = false;
				}
				if(a[j][i] != p) {
					colWin = false;
				}
			}
			if(rowWin || colWin) {
				return true;
			}
		}
		boolean leftdia = true;
		boolean rightdia = true;
		for(int i =0;i<r;i++) {
			if(a[i][i] != p) {
				leftdia = false;
			}
			if(a[i][r-i-1] != p) {
				rightdia = false;
			}
		}
		if(leftdia || rightdia) {
			return true;
		}
		return false;
	}

}
