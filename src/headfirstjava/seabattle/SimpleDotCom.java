package headfirstjava.seabattle;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits;

    String checkYourself(String stringGuess) {

        int guess = Integer.parseInt(stringGuess);

        String result = "miss";

        for (int cell : locationCells) {
            if (cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);

        return result;
    }

    void setLocationCells(int[] loc) {
        locationCells = loc;
    }

}
