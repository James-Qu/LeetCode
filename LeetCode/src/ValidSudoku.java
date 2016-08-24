import java.util.HashSet;
import java.util.Set;
/*36. Valid Sudoku  QuestionEditorial Solution  My Submissions
Total Accepted: 83854
Total Submissions: 262701
Difficulty: Easy
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, 
where empty cells are filled with the character '.'.


A partially filled sudoku which is valid.

Note:
A valid Sudoku board (partially filled) is not necessarily solvable. 
Only the filled cells need to be validated.*/
public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={{'.','8','7','6','5','4','3','2','1',},
						{'2','.','.','.','.','.','.','.','.'},
						{'3','.','.','.','.','.','.','.','.'},
						{'4','.','.','.','.','.','.','.','.'},
						{'5','.','.','.','.','.','.','.','.'},
						{'6','.','.','.','.','.','.','.','.'},
						{'7','.','.','.','.','.','.','.','.'},
						{'8','.','.','.','.','.','.','.','.'},
						{'9','.','.','.','.','.','.','.','.'},};
		System.out.println(isValidSudoku(board));
	}
	public static boolean isValidSudoku(char[][] board) {
        int verticalLen=board.length;
        int horiLen=board[0].length;
        Set<Character> set=new HashSet<Character>();
        //check row
        for(int i=0;i<verticalLen;i++){
            //Set<Character> set=new HashSet<Character>();
            set.clear();
            for(int j=0;j<horiLen;j++){
                if(board[i][j]!='.'&&!set.add(board[i][j])){
                    return false;
                }
            }
        }
        //check line
        for(int j=0;j<horiLen;j++){
            //Set<Character> set=new HashSet<Character>();
            set.clear();
            for(int i=0;i<verticalLen;i++){
                if(board[i][j]!='.'&&!set.add(board[i][j])){
                    return false;
                }
            }
        }
        //check square
        for(int i=0;i<verticalLen;i+=3){
            //Set<Character> set=new HashSet<Character>();
            for(int j=0;j<horiLen;j+=3){
                //board[i][j] is the square left corner
                set.clear();
                for(int n=i;n<i+3;n++){
                    for(int m=j;m<j+3;m++){
                        if(board[n][m]!='.'&&!set.add(board[n][m])){
                        return false;
                        }
                    
                    }
                }
            }
        }
        return true;
    }
}
