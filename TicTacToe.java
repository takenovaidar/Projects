public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{' ', '|',' ', '|', ' '},
                {'-','+','-','+','-'},
                {' ','|',' ', '|', ' '},
                {'-','+','-','+','-'},
                {' ','|',' ', '|', ' '}};
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

