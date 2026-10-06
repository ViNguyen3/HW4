package part1_inheritance;

public class SalariedEmployee extends Employee {
    int weeklySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, int weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' + ", weeklySalary=" + weeklySalary + '}';
    }
}