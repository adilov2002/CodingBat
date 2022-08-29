package headfirstjava.seabattle;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;
//    int numOfHits;

    public String checkYourself(String userInput) {

        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
