package exercise6;

import java.util.Objects;

/**
 * Class Lemur
 * @author woolsa01
 */
public class Lemur {
    private final String name;
    private final int age;
    private final int tailLength = 20;

public Lemur(String name, int age) {
    this.name = name;
    this.age = age;
}

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public int getTailLength() {
    return tailLength;
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.tailLength);
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
        final Lemur other = (Lemur) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return this.tailLength == other.tailLength;
  }    
}
