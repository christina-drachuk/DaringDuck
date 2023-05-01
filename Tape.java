import java.util.ArrayList;

public class Tape {
    ArrayList<String> pos = new ArrayList<>();
    ArrayList<String> neg = new ArrayList<>();
    int index = 0;

    public Tape (String input) {
        // add everything in input into right arraylist
        for (int i = 0; i < input.length(); i++) {
            pos.add(input.substring(i, i + 1));
        }
    }
}