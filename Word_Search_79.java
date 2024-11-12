/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
Constraints:
m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.*/
public class Word_Search_79 {
    public boolean exist(char[][] board, String word) {
        boolean ans = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    ans = f(board.length, board[0].length, i, j, board, 0, word);
                    if (ans) {

                        return ans;
                    }
                }
            }
        }
        return false;
    }

    public static boolean f(int m, int n, int r, int c, char[][] board, int idx, String word) {
        if (idx == word.length()) {
            return true;
        }
        if (c < 0 || c >= n || r < 0 || r >= m || board[r][c] != word.charAt(idx)) {
            return false;
        }
        board[r][c] = '#';
        int row[] = { 1, 0, 0, -1 };
        int col[] = { 0, -1, 1, 0 };

        for (int i = 0; i < row.length; i++) {
            boolean ans = f(m, n, r + row[i], c + col[i], board, idx + 1, word);
            if (ans) {
                return true;
            }
        }
        board[r][c] = word.charAt(idx);
        return false;
    }
}
