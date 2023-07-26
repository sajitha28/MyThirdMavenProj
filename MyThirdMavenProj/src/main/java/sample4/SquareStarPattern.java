package sample4;

public class SquareStarPattern {

	public static void main(String[] args) {
		char arr[][]={{'*','*','*'},{'*','*','*'},{'*','*','*'}};

	        // Print the square star pattern
	        for (char i = 0; i < 3; i++) {
	            for (char j = 0; j < 3; j++) {
	                System.out.print(arr[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}



