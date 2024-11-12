import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        char[][] board = {


                {'5', '3', '.',         '.', '7', '.',      '.', '.', '.'},
                {'6', '5', '.',         '1', '9', '5',      '.', '.', '.'},
                {'.', '9', '8',         '.', '.', '.',      '.', '6', '.'},

                {'8', '.', '.',         '.', '6', '.',      '.', '.', '3'},
                {'4', '.', '.',         '8', '.', '3',      '.', '.', '1'},
                {'7', '.', '.',         '.', '2', '.',      '.', '.', '6'},

                {'.', '6', '.',         '.', '.', '.',      '2', '8', '.'},
                {'.', '.', '.',         '4', '1', '9',      '.', '.', '5'},
                {'.', '.', '.',         '.', '8', '.',      '.', '7', '9'}


        };



        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int squares_num = r/3 * 3 + c/3;
                if (board[r][c] == '.') {
                    continue;
                }
                if (rows[r].contains(board[r][c]) || cols[c].contains(board[r][c]) || squares[squares_num].contains(board[r][c] )) {
                    System.out.println(false);
                    return;
                }
                rows[r].add(board[r][c]);
                cols[c].add(board[r][c]);
                squares[squares_num].add(board[r][c]);
            }
        }
        System.out.println(true);
    }
}