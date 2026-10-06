package part1_inheritance;

public class HourlyEmployee extends Employee {
    int wage;
    int hoursWorked;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber, int wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' + ", wage=" + wage + ", hoursWorked=" + hoursWorked + '}';
    }
}