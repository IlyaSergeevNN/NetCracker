/**
 * Created by User on 08.03.2019.
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary; //I think double is better for salary, we don't want to lose part of number after dot

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary(){
        return salary * 12;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(int percent){
        double newSalary = (percent * 0.01 * salary) + salary;
        this.setSalary(newSalary);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != employee.getId()) return false;
        if (Double.compare(employee.getSalary(), getSalary()) != 0) return false;
        if (!getFirstName().equals(employee.getFirstName())) return false;
        return getLastName().equals(employee.getLastName());

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        result = 31 * result + getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        temp = Double.doubleToLongBits(getSalary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
