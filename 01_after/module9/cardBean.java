package module9;

import java.io.Serializable;

public class cardBean implements Serializable {
    String name;
    int numdigits;

    public cardBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumdigits() {
        return numdigits;
    }

    public void setNumdigits(int numdigits) {
        this.numdigits = numdigits;
    }
}
