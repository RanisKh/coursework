import java.util.Objects;

public class Name {
    String firstName;
    String surName;
    String lastName;

    public Name(String firstName, String surName, String lastName) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(surName, name.surName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surName, lastName);
    }

    @Override
    public String toString() {
        return  firstName + surName  + lastName ;
    }
}


