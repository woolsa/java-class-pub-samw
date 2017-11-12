package exercise6;

import java.util.Objects;

/**
 * Class Frog
 * @author woolsa01
 */
public class Frog {
    private final String name;
    private final int age;
    private final String Color = "Green";

public Frog(String name, int age) {
    this.name = name;
    this.age = age;
    }

public String getName() {
    return name;
}

public int getAge() {
    return age;
}

public String getColor() {
    return Color;
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.Color);
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
        final Frog other = (Frog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.Color, other.Color);
    }    
}