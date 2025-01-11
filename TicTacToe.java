import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

    
    public static void main(String[] args) {
        char[][] board = {{'1', '|','2', '|', '3'},
                {'-','+','-','+','-'},
                {'4','|','5', '|', '6'},
                {'-','+','-','+','-'},
                {'7','|','8', '|', '9'}};
        printBoard(board);

        while (true) {
            String player = "player";
            System.out.print(player + " Input your move from 1-9: ");
            Scanner scanner = new Scanner(System.in);
            int PlayerTurn = scanner.nextInt();
            System.out.println(PlayerTurn);
            placePiece(board, PlayerTurn, "player");

            Random random = new Random();
            int ComTurn = random.nextInt(9) + 1;
            placePiece(board, ComTurn, "Computer");

            printBoard(board);
        }
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
    public static String winnerChek() {
        List topRow = Arrays.asList(1, 2, 3);
        List bottomRow = Arrays.asList(4, 5, 6);
        List downRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List buttomtCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List leftRowCol = Arrays.asList(1, 5, 9);
        List rightRowCol = Arrays.asList(3, 5, 7);

        List<List> winners = new ArrayList<List>();
        winners.add(topRow);
        winners.add(bottomRow);
        winners.add(downRow);
        winners.add(leftCol);
        winners.add(buttomtCol);
        winners.add(rightCol);
        winners.add(leftRowCol);
        winners.add(rightRowCol);
}

