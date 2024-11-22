import java.util.ArrayList;

public static void main(String[] args) {
    EmployeeDirectory directory = new EmployeeDirectory();

    directory.addEmployee(new Employee(1, "1234567890", "John Doe", 5));
    directory.addEmployee(new Employee(2, "9876543210", "Jane Smith", 3));
    directory.addEmployee(new Employee(3, "5678901234", "Alice Johnson", 7));

    System.out.println("Employees with 5 years of experience:");
    ArrayList<Employee> employeesWithFiveYearsExp = directory.findEmployeeByExperience(5);
    for (Employee employee : employeesWithFiveYearsExp) {
        System.out.println(STR."Employee ID: \{employee.getEmployeeId()}, Name: \{employee.getName()}");
    }

    System.out.println("\nPhone numbers for employee named Jane Smith:");
    ArrayList<String> phoneNumbersForJaneSmith = directory.findPhoneNumberByName("Jane Smith");
    for (String phoneNumber : phoneNumbersForJaneSmith) {
        System.out.println("Phone Number: " + phoneNumber);
    }

    int employeeId = 3;
    Employee foundEmployee = directory.findEmployeeByEmployeeId(employeeId);
    if (foundEmployee != null) {
        System.out.println("\nEmployee found with ID " + employeeId + ": " + foundEmployee.getName());
    } else {
        System.out.println("\nEmployee not found with ID " + employeeId);
    }
}
