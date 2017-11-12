package exercise6;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class LemurConspiracy
 * @author woolsa01
 */
public class LemurConspiracy {
    private ArrayList<Lemur> conspiracy = new ArrayList();
    
public LemurConspiracy (String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        String[] parts = line.split(",");
        if("Lemur".equals(parts[2])) {
            Lemur tempLemur = new Lemur(parts[0], Integer.parseInt(parts[1]));
            conspiracy.add(tempLemur);
        }
    }
}

public int size() {
    return conspiracy.size();
}
    
public Lemur getChief() {
    Lemur chief = new Lemur("", 0);
    Lemur tempLemur = null;
    for (int i = 0; i < conspiracy.size(); i++) {
        if (chief.getAge() <= conspiracy.get(i).getAge()) {
            chief = conspiracy.get(i);
         }
    }
    return chief;
}    
}
