package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class CrowMurder
 * @author woolsa01
 */
public class CrowMurder {
    private ArrayList<Crow> murder = new ArrayList<>();
    private int chief;
    
public CrowMurder(String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] parts = line.split(",");
            if("Crow".equals(parts[2])) {
                Crow tempCrow = new Crow(parts[0], Integer.parseInt(parts[1]));
                murder.add(tempCrow);
            }
        }
}

public int size() {
    return murder.size();
}

 public Crow getChief() {
        Crow chief = new Crow("", 0);
        Crow tempCrow = null;
        for (int i = 0; i < murder.size(); i++) {
            if (chief.getAge() < murder.get(i).getAge()) {
                chief = murder.get(i);
            }
        }
        return chief;
    }
}
