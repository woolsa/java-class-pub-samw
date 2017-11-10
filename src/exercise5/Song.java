package exercise5;

import java.util.Objects;

/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: String title, String artist.
 * Implement method equals. Two objects of type Song are equal if their titles and artists are equal.
 * Implement method hashCode. Hash code of an object is calculated as follows: numeric value of each letter in the title of a song is multiplied by that letter's position in the title and added to the accumulator (integer). Numeric value of each letter in the artist of a song is multiplied by that letter's position in the artist and added to the accumulator.
 * @author woolsa01
 */
public class Song {
    private final String title;
    private final String artist;
    
public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
}

public String getTitle() {
    return title;
}

public String getArtist() {
    return artist;
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
        final Song other = (Song) obj;
        if (!this.artist.equals(other.artist)) {
            return false;
        }
        return this.title.equals(other.title);
    
}

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < this.title.length(); i++) {
            int ch = (int)(title.charAt(i));
            hash += (ch * i);
        }
        for (int i = 0; i < this.artist.length(); i++) {
            int ch = (int)(artist.charAt(i));
            hash += (ch * i);
        }
        return hash;
    }
    @Override
    public String toString() {
        return String.format("%s by %s", title, artist);
    }
    
}
