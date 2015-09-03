package spiralMatrix;
/*
 * Given aNXN matrix, starting from the upper right corner of the 
 * matrix start printingvalues in a counter-clockwise fashion. 
 * E.g.: Consider N = 4 
 * Matrix= {
 * 			a, b, c, d, 
 * 			e, f, g, h, 
 * 			i, j, k, l, 
 * 			m, n, o, p} 
 * Your function should output: dcbaeimnoplhgfjk
 */
 
public class spiralMatrix {
	public static void main(String args[]) {
		char[][] matrix = {
				 			{'a', 'b', 'c', 'd'}, 
				  			{'e', 'f', 'g', 'h'}, 
				  			{'i', 'j', 'k', 'l'}, 
				  			{'m', 'n', 'o', 'p'}
				  		};
		drawSpiral(matrix);
	}
	public static void drawSpiral(char[][] matrix) {
		StringBuilder sb = new StringBuilder();
		int row = matrix.length;
		int col = matrix[0].length;
		int x = 0;
		int y = col;
		while (true) {
			for (int i = 0; i < col; i++) {
				sb.append(matrix[x][--y]);
			}
			row--;
			if (row == 0) {
				break;
			}
			for (int i = 0; i < row ; i++) {
				sb.append(matrix[++x][y]);
			}
			col--;
			if (col == 0) {
				break;
			}
			for (int i = 0; i < col; i++) {
				sb.append(matrix[x][++y]);
			}
			row--;
			if (row == 0) {
				break;
			}
			for (int i = 0; i < row; i++) {
				sb.append(matrix[--x][y] );
			}
			col--;
			if (col == 0) {
				break;
			}	
		}
		System.out.println(sb);
	}
}
