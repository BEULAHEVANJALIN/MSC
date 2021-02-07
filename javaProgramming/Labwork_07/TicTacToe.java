import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	static String [] board;
	static String player;

	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
	}
		
	static void printBoard() {
		System.out.println("---|---|---");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("---|---|---\n");
	}
	
	static String checkWinner() {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(player + "' turn\nEnter a slot number to place " + player + " in:");
		return null;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		board = new String [9];
		player = "X";
		String winner = null;
		populateEmptyBoard();

		System.out.println("Welcome to Tic Tac Toe.\n");
		printBoard();
		System.out.println("X's turn. Select the slot\n\n");

		while (winner == null) {
			int slotInput;
			
			try {
				slotInput = input.nextInt();
				
				if (!(slotInput > 0 && slotInput <= 9)) {
					System.out.println("Invalid input\nre-enter slot number:");
					continue;
				}
			} 
			catch (InputMismatchException e) {
				System.out.println("Invalid input\nre-enter slot number:");
				continue;
			}
			
			if (board[slotInput-1].equals(String.valueOf(slotInput))) {
				board[slotInput-1] = player;
				if (player.equals("X")) {
					player = "O";
				} else {
					player = "X";
				}
				printBoard();
				winner = checkWinner();
			} 
			else {
				System.out.println("Slot already taken\nre-enter slot number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("Game draw!\nThank you");
		} 
		else {
			System.out.println("Congratulations! " + winner + " won! Thank you");
		}
	}
}
