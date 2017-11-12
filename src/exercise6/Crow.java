package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author woolsa01
 */
public class Crow {
    private final String name;
    private final int age;
    private final int iq = 100;
 

public Crow(String name, int age) {
    this.name = name;
    this.age = age;
    
}

public String getName() {
    return name; 
}

public int getAge() {
    return age;
}

public int getIq() {
    return iq;
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.age;
        hash = 61 * hash + this.iq;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Crow other = (Crow) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.iq != other.iq) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
    return String.format("%s %d %d", name, age, iq);
}
}
