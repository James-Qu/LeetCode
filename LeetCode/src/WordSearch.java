import java.util.ArrayList;
import java.util.List;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={
		                 {'A','B','C','E'},
		                 {'S','F','C','S'},
		                 {'A','D','E','E'}
		               };
		System.out.println(exist(board,"ABC"));
	}
    public static boolean exist(char[][] board, String word) {
        if(board==null||board.length==0){
            return false;
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(backtrack(word.toCharArray(),board,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    private static boolean backtrack(char[] word,char[][] board,int i,int j,int start){
        if(start==word.length){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word[start]){
            return false;
        }
        return backtrack(word,board,i+1,j,start+1)||backtrack(word,board,i,j+1,start+1)||backtrack(word,board,i-1,j,start+1)||backtrack(word,board,i,j-1,start+1);
    }
}
