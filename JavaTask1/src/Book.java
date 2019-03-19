import java.util.Arrays;

/**
 * Created by User on 08.03.2019.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;

    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (Double.compare(book.getPrice(), getPrice()) != 0) return false;
        if (getQty() != book.getQty()) return false;
        if (!getName().equals(book.getName())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getAuthors(), book.getAuthors());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        result = 31 * result + Arrays.hashCode(getAuthors());
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getQty();
        return result;
    }

    public String getAuthorsNames(){
        String names = null;
        if(this.getAuthors().length > 0 && this.getAuthors()[0].getName() != null){
            names = this.getAuthors()[0].getName();
        } else {
            names = "Author's name unknown";
        }

        if(this.getAuthors().length > 1){
            for (int i = 1; i < this.getAuthors().length; i++) {
                if(this.getAuthors()[i].getName() != null){
                    names = names + ", " + this.getAuthors()[i].getName();
                }
            }
            names = names + ".";
        }

        return names;
    }
}
