package part1_inheritance;

public class Driver {
    public static void main(String[] args) {

        SalariedEmployee employeeOne = new SalariedEmployee();
        employeeOne.setFirstName("Joe");
        employeeOne.setLastName("Jones");
        employeeOne.setSocialSecurityNumber("111-11-1111");
        employeeOne.setWeeklySalary(2500);
        System.out.println(employeeOne);

        HourlyEmployee employeeTwo = new HourlyEmployee();
        employeeTwo.setFirstName("Stephanie");
        employeeTwo.setLastName("Smith");
        employeeTwo.setSocialSecurityNumber("222-22-2222");
        employeeTwo.setWage(25);
        employeeTwo.setHoursWorked(32);
        System.out.println(employeeTwo);

        HourlyEmployee employeeThree = new HourlyEmployee();
        employeeThree.setFirstName("Mary");
        employeeThree.setLastName("Quinn");
        employeeThree.setSocialSecurityNumber("333-33-3333");
        employeeThree.setWage(19);
        employeeThree.setHoursWorked(47);
        System.out.println(employeeThree);

        CommisionEmployee employeeFour = new CommisionEmployee();
        employeeFour.setFirstName("Nicole");
        employeeFour.setLastName("Dior");
        employeeFour.setSocialSecurityNumber("444-44-4444");
        employeeFour.setCommissionRate(15);
        employeeFour.setGrossSales(50000);
        System.out.println(employeeFour);

        SalariedEmployee employeeFive = new SalariedEmployee();
        employeeFive.setFirstName("Renwa");
        employeeFive.setLastName("Chanel");
        employeeFive.setSocialSecurityNumber("555-55-5555");
        employeeFive.setWeeklySalary(1700);
        System.out.println(employeeFive);

        BaseEmployee employeeSix = new BaseEmployee();
        employeeSix.setFirstName("Mike");
        employeeSix.setLastName("Davenport");
        employeeSix.setSocialSecurityNumber("666-66-6666");
        employeeSix.setBaseSalary(95000);
        System.out.println(employeeSix);

        CommisionEmployee employeeSeven = new CommisionEmployee();
        employeeSeven.setFirstName("Mahnaz");
        employeeSeven.setLastName("Vaziri");
        employeeSeven.setSocialSecurityNumber("777-77-7777");
        employeeSeven.setCommissionRate(22);
        employeeSeven.setGrossSales(40000);
        System.out.println(employeeSeven);
    }
}