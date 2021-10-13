package racinggame.domain;

import java.util.Objects;

public class Name {

    public static final int LIMIT_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validationLength(name);
        validationNull(name);
        this.name = name.trim();
    }

    private void validationLength(String name) {
        if (name.length() > LIMIT_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void validationNull(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
