public class EmployeeService {

    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }

    void printEmployees() {
        for (Employee employee: this.employees ) {
            System.out.println(employee.toString());

        }
    }

    double calculateSalaryAndBonus(){
        double calculatedSalaryAndBonus = 0 ;
        for (Employee employee : employees) {
            calculatedSalaryAndBonus += employee.salary + employee.getBonus();
        }
        return calculatedSalaryAndBonus;
    }

    Employee getById(long id) {
        for (Employee employee : this.employees){
            if(employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    Employee getByName(String name){
        Employee employee = null;
        for (Employee employer : this.employees){
            if(employer.getName().equals(name)){
                employee = employer;
                break;
            }
        }
        return employee;
    }

    Employee[] sortByName() {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < employees.length; i++) {
                if (employees[i].getName().compareTo(employees[i - 1].getName()) < 0) {
                    Employee temp = employees[i];
                    employees[i] = employees[i - 1];
                    employees[i - 1] = temp;
                    isSorted = false;
                }
            }

        }
        return employees;
    }



    Employee edit(Employee editEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == editEmployee.getId()) {
                Employee temp = employees[i];
                employees[i] = new Employee(5, "Natalia", 32, 2000, "female" );
                return temp;
            }
        }
        return null;
    }

    Employee remove(long id){
        int indexRemove = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.id == id) {
                indexRemove = i;
                break;
            }
        }
        if (indexRemove == -1) {
            return null;
        }

        Employee[] newEmployeesArray = new Employee[employees.length - 1];
        int newArrayCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i != indexRemove) {
                newEmployeesArray[newArrayCounter] = employees[i];
                newArrayCounter++;
            }
        }

        Employee removedEmployee = employees[indexRemove];
        employees = newEmployeesArray;
        return removedEmployee;
    }

    Employee addEmployee(Employee addEmployee) {
        Employee[] newEmployeesArray = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length -1; i++) {
            newEmployeesArray[i] = employees[i];
        }

        employees = newEmployeesArray;
        newEmployeesArray[newEmployeesArray.length-1] = addEmployee;
        return addEmployee;

    }


}
