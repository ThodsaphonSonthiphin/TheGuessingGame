public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();

    }
}

class GuessGame {
    private Player p1;
    private Player p2;
    private Player p3;

    void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guess1;
        int guess2;
        int guess3;


        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;


        int targetNumber = (int) (Math.random() * 10);

        System.out.println("I am thinking number between 0...9");


        while (true) {
            System.out.println("Number guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.number;
            System.out.println("Player 1 guess is " + guess1);

            guess2 = p2.number;
            System.out.println("Player 2 guess is " + guess2);

            guess3 = p3.number;
            System.out.println("Player 3 guess is " + guess3);

            if (guess1 == targetNumber) {
                p1isRight = true;
            }

            if (guess2 == targetNumber) {
                p2isRight = true;
            }

            if (guess3 == targetNumber) {
                p3isRight = true;
            }


            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have the winner!");

                System.out.println("Player1 is right ? " + p1isRight);
                System.out.println("Player2 is right ? " + p2isRight);
                System.out.println("Player3 is right ? " + p3isRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("Player has to try again");
            }
        }


    }
}

class Player {
    int number;

    void guess() {
        number = (int) (Math.random() * 10);

    }

}

