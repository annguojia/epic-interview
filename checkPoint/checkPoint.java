package checkPoint;
/**
 * N*N matrix is given with input red or black.You can move horizontally, 
 * vertically or diagonally. If 3 consecutive same color found, that color 
 * will get 1 point. So if 4 red are vertically then point is 2. Find the winner.
 */
public class checkPoint {
	public static void main(String args[]) {
//		char[][] matrix = { {'r','b','r','b'},
//							{'r','b','r','b'},
//							{'r','r','b','r'},
//							{'b','r','b','r'}};
		char[][] matrix = { 
				{ 'r', 'r', 'r', 'b' }, 
				{ 'b', 'r', 'b', 'r' },
				{ 'b', 'r', 'r', 'b' }, 
				{ 'b', 'r', 'b', 'b' } 
			};
		int scoreBlack = checkPoint(matrix, 'b');
		int scoreRed = checkPoint(matrix, 'r');
		if (scoreBlack > scoreRed) {
			System.out.println("Black Win!");
		} else {
			System.out.println("Red Win!");
		}
	}
	public static int checkPoint(char[][] matrix, char color) {
		int count = 0;
		//horizontally
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length - 2; j++) {
				if (matrix[i][j] == color && matrix[i][j + 1] == color && matrix[i][j + 1] == color) {
					count++;
				}
			}
			
		}
		//vertically
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length - 2; j++) {
				if (matrix[j][i] == color && matrix[j + 1][i] == color && matrix[j + 2][i] == color) {
					count++;
				}
			}
		}
		//top left to bottom right
		for(int i=0;i<matrix.length-2;i++){
				for(int j=0;j<matrix[0].length-2;j++){
					if(matrix[i][j] == color && matrix[i+1][j+1] == color && matrix[i+2][j+2] == color){
						count++;
				}
			}
		}
		//top right to bottom left
		for(int i = 0;i < matrix.length - 2; i++){
				for(int j = matrix[0].length - 1; j >= 2; j--){
					if(matrix[i][j] == color && matrix[i+1][j-1] == color && matrix[i+2][j-2] == color){
						count++;
				}
			}
		}
		
		return count;
	}
}
