/**
 * Created by User on 08.03.2019.
 */
public class Main {
    public static void main(String[] args) {

        //Circle class
        Circle circle = new Circle(3.0, "green");
        System.out.println(circle + ", area = " + circle.getArea());

        //Rectangle class
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle + ", area = " + rectangle.getArea()
                                     + ", perimeter = " + rectangle.getPerimeter());

        //Employee class
        Employee employee = new Employee(1, "Ivan", "Kozlov", 80);
        employee.raiseSalary(18);
        System.out.println(employee.getName() + " " + employee.getAnnualSalary());
        System.out.println(employee);

        //BOOK CLASS
        Author author = new Author("Igor Tolstoy", "1@1.ru", 'm');
        Author author1 = new Author("Irina Rinina", "2@2.ru", 'f');
        Author author2 = new Author("Antuane Messi", "3@3.ru", 'm');

        Author[] authors = new Author[3];
        authors[0] = author;
        authors[1] = author1;
        authors[2] = author2;

        Book book = new Book("Smile", authors, 34.99, 1);
        System.out.println(book.toString());
        System.out.println(book.getAuthorsNames());

        //MyPoint class
        MyPoint myPoint = new MyPoint(2,2);
        MyPoint myPoint1 = new MyPoint(6, 5);
        System.out.println("MyPOINT dist1 " + myPoint1.distance(2,2));
        System.out.println("MyPOINT dist2 " + myPoint.distance(myPoint1));
        System.out.println("MyPOINT dist3 " + myPoint.distance(myPoint, myPoint1));
        System.out.println("MyPOINT dist 0.0 " + myPoint1.distance());

        //Triangle class
        MyTriangle triangle = new MyTriangle(2,2,6,2,6,5);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter() + " " + triangle.getType());

    }
}
