class EmployeeController {
    private Employee employeeModel;
    private EmployeeDashboardView view;

    public EmployeeController(Employee employeeModel, EmployeeDashboardView view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }

    public void setEmployee(String name, String lastName) {
        employeeModel.setFirstName(name);
        employeeModel.setLastName(lastName);
    }

    public String getEmployeeName() {
        return employeeModel.getFirstName() + " " + employeeModel.getLastName();
    }

    public void setSSN(String ssn) {
        employeeModel.setSsNumber(ssn);
    }

    public String getSSN() {
        return employeeModel.getSsNumber();
    }

    //Update our view
    public void updateDashboardView() {
        view.printEmployeeInformation(employeeModel);
    }
}

class Employee {

    private String firstName;
    private String lastName;
    private String ssNumber;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }
}

class EmployeeDashboardView {

    public void printEmployeeInformation(Employee employee) {
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary: " + employee.getSalary());

    }
}

public class Main {

    public static void main(String[] args) {

        Employee employee = retrieveEmployeeFromServer();

        //Creating our view to which we'll write our employee information into
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Createing our controller
        EmployeeController controller = new EmployeeController(employee, view);



//        controller.setEmployee(employee.getFirstName(), employee.getLastName());

        controller.updateDashboardView();

    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("91827364");
        employee.setFirstName("Beuah");
        employee.setLastName("Evanjalin");
        employee.setSalary(135000);

        return employee;

    }
}
