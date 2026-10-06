package part1_inheritance;

public class BaseEmployee extends Employee {
    int baseSalary;

    public BaseEmployee() {
    }

    public BaseEmployee(String firstName, String lastName,
                        String socialSecurityNumber, int baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' + ", baseSalary=" + baseSalary + '}';
    }
}