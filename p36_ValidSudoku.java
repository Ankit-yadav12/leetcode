import java.util.HashSet;

public class p36_ValidSudoku  {

    public static boolean isValidSudoku(char[][] board) {
        int n = 9;
        // making the hashmaps
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for (int r = 0; r < n; r++) {
            rows[r] = new HashSet<>();
            cols[r] = new HashSet<>();
            boxes[r] = new HashSet<>();
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                char val = board[r][c];

                // check if there is any number at the location or not
                if (val == '.')
                    continue;

                // checking the row
                if (rows[r].contains(val))
                    return false;
                rows[r].add(val);

                // checking the columns
                if (cols[c].contains(val))
                    return false;
                cols[c].add(val);

                // checking the values
                int idx = (r / 3) * 3 + c / 3;

                if (boxes[idx].contains(val))
                    return false;
                boxes[idx].add(val);
            }
        }

        return true;
    }

      public static void main(String[] args) {
        // Example Sudoku board
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = isValidSudoku(board);

        // Print the result
        System.out.println("Is the given Sudoku board valid: " + result);
    }
}
