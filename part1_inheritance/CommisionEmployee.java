package part1_inheritance;

public class CommisionEmployee extends Employee {
    int commissionRate;
    int grossSales;

    public CommisionEmployee() {
    }

    public CommisionEmployee(String firstName, String lastName,
                             String socialSecurityNumber,
                             int commissionRate, int grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return "CommisionEmployee{" + "firstName='" + getFirstName() + '\'' + ", lastName='" + getLastName() + '\'' + ", socialSecurityNumber='" + getSocialSecurityNumber() + '\'' + ", commissionRate=" + commissionRate + ", grossSales=" + grossSales + '}';
    }
}