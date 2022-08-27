package headfirstjava.seabattle;

public class SimpleDotComGame {

    public static void main(String[] args) {

        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom dot = new SimpleDotCom();

        int randomNumber = (int) (Math.random() * 5);

        int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("Enter number: ");

            String result = dot.checkYourself(guess);

            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

    }

}
