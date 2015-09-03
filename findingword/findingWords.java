package findingword;

/*
 * Write a program for a word search. If there is an NxN grid 
 * with one letter in each cell. Let the user enter a word and 
 * the letters of the word are said to be found in the grid either 
 * the letters match vertically, horizontally or diagonally in the grid.
 * If the word is found, print the coordinates of the letters as output.
 */
 
 public class findingWords{
	 
 	//one character can not be used twice!
	private static boolean [][] visited ;
 	public static void main(String[] args){
 		char[][] board = {
			{ 'a', 'b', 'c', 'd' }, 
			{ 'e', 'f', 'g', 'h' },
			{ 'i', 'j', 'k', 'l' }, 
			{ 'm', 'n', 'o', 'p' } 
		};
 		visited = new boolean[board.length][board[0].length];
		find("afk",board);
 	}
 	
 	public static void find(String word, char[][] board){
 		for(int i=0;i<board.length;i++){
 			for(int j=0;j<board[0].length;j++){
 				if(findWord(word,board,0,i,j)){
 					System.out.println("("+i+","+j+")");
 					System.out.println("Found!");
 					return;
 				}
 			}
 		}
 		System.out.println("Not Found!");
 	}
 	
 	public static boolean findWord(String word, char[][] board, int pos, int i, int j){
 		if (pos == word.length()) {
 			return true;
 		}
 		if (visited[i][j] == true || i < 0 || j < 0 || i >= board.length || j >= board[0].length ) {
 			return false;
 		}
 		if (board[i][j] == word.charAt(pos)) {
 			visited[i][j] = true;
 			if ( findWord(word, board, pos+ 1, i + 1, j+ 1) || findWord(word, board, pos + 1, i + 1, j) 
 					|| findWord(word, board, pos+ 1, i + 1, j - 1) || findWord(word, board, pos + 1, i , j - 1) 
 					|| findWord(word, board, pos+ 1, i , j+ 1) || findWord(word, board, pos + 1, i + 1, j - 1) 
 					|| findWord(word, board, pos+ 1, i + 1, j+ 1) || findWord(word, board, pos + 1, i + 1, j) ) {
 				return true;
 			}
 			
 		} 
 		visited[i][j] = false;
 		return false;
 		
 	}
 	
}
