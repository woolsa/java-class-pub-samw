package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class KangarooMob
 * @author woolsa01
 */
public class KangarooMob {
    private ArrayList<Kangaroo> mob = new ArrayList();
    
public KangarooMob (String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        String[] parts = line.split(",");
        if("Kangaroo".equals(parts[2])) {;
            Kangaroo tempKangaroo = new Kangaroo(parts[0], Integer.parseInt(parts[1]));
            mob.add(tempKangaroo);
        }
    } 
}
public int size() {
    return mob.size();
}
    
public Kangaroo getChief() {
    Kangaroo chief = new Kangaroo("", 0);
    Kangaroo tempKangaroo = null;
    for (int i = 0; i < mob.size(); i++) {
        if (chief.getAge() < mob.get(i).getAge()) {
            chief = mob.get(i);
        }
    } 
    return chief;
}   
}