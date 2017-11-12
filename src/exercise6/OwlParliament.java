package exercise6;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class OwlParliament
 * @author woolsa01
 */
public class OwlParliament {
    private ArrayList<Owl> parliament = new ArrayList();
    
public OwlParliament (String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        String[] parts = line.split(",");
        if("Owl".equals(parts[2])) {
            Owl tempOwl = new Owl(parts[0], Integer.parseInt(parts[1]));
            parliament.add(tempOwl);
        }
    }
}

public int size() {
    return parliament.size();
}
    
public Owl getChief() {
    Owl chief = new Owl("", 0);
    Owl tempOwl = null;
    for (int i = 0; i < parliament.size(); i++) {
        if (chief.getAge() <= parliament.get(i).getAge()) {
            chief = parliament.get(i);
        }
    }
    return chief;
}
}
