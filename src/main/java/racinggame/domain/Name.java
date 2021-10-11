package racinggame.domain;

import racinggame.enums.ErrorMessage;

import java.util.Objects;

public class Name {

    private final String name;

    public Name(String name) {
        validationLength(name);
        this.name = name.trim();
    }

    private void validationLength(String name) {
        if(name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_CAR_LENGTH.getMessage());
        }
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
