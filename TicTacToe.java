import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{'1', '|','2', '|', '3'},
                {'-','+','-','+','-'},
                {'4','|','5', '|', '6'},
                {'-','+','-','+','-'},
                {'7','|','8', '|', '9'}};
        printBoard(board);

        String player = "player";
        System.out.print(player + " Input your move from 1-9: ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        System.out.println(position);

        placePiece(board, position, "player");
        printBoard(board);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void placePiece(char[][] board, int position, String user) {
        char symbol = 'X';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("Computer")) {
            symbol = 'O';
        }
        switch (position) {
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
        }
    }
}

