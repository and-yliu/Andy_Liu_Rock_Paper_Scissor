import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int win = 0;
        int lose = 0;
        boolean exit = false;
        System.out.println("Choose Rock, Paper, or Scissors. \"r\" for rock, \"p\" for paper, and \"s\" for scissors. To exit choose \"x\"");
        System.out.println("*************************************************");
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x = (int)(Math.random()*3);
            String computerMove = "B";
            String playerMove = "A";
            System.out.println("Wins:" + win + "  Losses: " + lose);

            //Computer Move
            if (x == 0){
                computerMove = "rock";
            }
            else if (x == 1){
                computerMove = "paper";
            }
            else if (x == 2) {
                computerMove = "scissors";
            }

            //Player Move
            System.out.println("Your move: ");
            String move = scanner.nextLine();
            while (!move.equals("r") && !move.equals("p") && !move.equals("s") && !move.equals("x")){
                System.out.println("Invalid Input! Try Again.");
                move = scanner.nextLine();
            }
            if (move.equals("r")){
                playerMove = "rock";
            }
            else if (move.equals("p")){
                playerMove = "paper";
            }
            else if (move.equals("s")) {
                playerMove = "scissors";
            }
            else if(move.equals("x")){
                System.exit(0);
            }

            if (playerMove.equals(computerMove)){
                System.out.println("Draw!");
            }
            else if (Wins(playerMove, computerMove)){
                System.out.println("You Win!");
                win++;
            }
            else{
                System.out.println("You Lose.");
                lose++;
            }

            System.out.println("Computer Choice: " + computerMove + "  Player Choice: " + playerMove);
        }
    }
    static boolean Wins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }
}