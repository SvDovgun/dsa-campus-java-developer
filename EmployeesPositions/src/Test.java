public class Test {
    public static void main(String[] args){
//        Employee employee = new Employee(5, "Natalia", 32, 2000, "female" , 62, 4);
//        //employee.defaultBugRate = 3;
//        //employee.fixedBugs =62;
//        System.out.println(employee);

        EmployeeFactory employeeFactory = new EmployeeFactory();
        EmployeeService employeeService = new EmployeeService(employeeFactory.generateEmployees(7));
        System.out.println(" --------------   The list of new employees  ------------ ");
        employeeService.printEmployees();

        System.out.println(" --------------   The required money for employees' salary and bonus ------------ ");
        int calculateSalaryAndBonus = (int) employeeService.calculateSalaryAndBonus();
        System.out.println("calculated Salary And Bonus = " + calculateSalaryAndBonus);


        System.out.println(" --------------   Return the employee info by ID  ------------ ");
        long idSearch = 3;
        System.out.println(" by ID =  " + idSearch);
        Employee employeeById = employeeService.getById(idSearch);
        System.out.println(employeeById);

        System.out.println(" --------------   Search for employee with name  ------------ ");
        String nameSearch = "Lorenzo Leon";
        System.out.println(" by name =  " + nameSearch);
        Employee employeeByName = employeeService.getByName(nameSearch);
        System.out.println(employeeByName);

        System.out.println("--------------    Sort by Name all list  --------------------");
        employeeService.sortByName();
        employeeService.printEmployees();


        System.out.println("--------------    Edit employee with specified ID  --------------------");
        long idEdit = 5;
        System.out.println(" by ID =  " + idEdit);
        Employee employeeByIdEdit = employeeService.getById(idEdit);
        System.out.println(employeeByIdEdit.toString());
        employeeService.edit(employeeByIdEdit);
        System.out.println("--------------    List after edit  --------------------");
        employeeService.printEmployees();

        System.out.println("--------------    Remove employee with specified ID  --------------------");
        long idRemove = 7;
        System.out.println(" by ID =  " + idRemove);
        Employee employeeByIdRemove = employeeService.getById(idRemove);
        System.out.println(employeeByIdRemove.toString());
        employeeService.remove(idRemove);
        System.out.println("--------------    List after remove  --------------------");
        employeeService.printEmployees();
        System.out.println("");
        System.out.println("--------------    TASK2  --------------------");

        employeeService.addEmployee(employeeFactory.generateEmployee());
        System.out.println("--------------    List after Add new Employee  --------------------");
        employeeService.printEmployees();

    }

}
