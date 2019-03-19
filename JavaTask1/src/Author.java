/**
 * Created by User on 08.03.2019.
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(){

    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (getGender() != author.getGender()) return false;
        if (!getName().equals(author.getName())) return false;
        return getEmail().equals(author.getEmail());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + (int) getGender();
        return result;
    }
}
