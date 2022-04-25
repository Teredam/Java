package Nivel1.S0103Ex2;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(getName(), month.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
