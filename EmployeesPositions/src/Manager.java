public class Manager extends Employee{

    public Manager(long id, String name, int age, double salary, String gender) {
        super(id, name, age, salary, gender);
       // new Employee(id, name, age, salary, gender);
    }

    @Override
    public double calculateSalary() {
        double calculatesSalary = salary ;
        return calculatesSalary;
    }


    @Override
    public String toString() {
        return "Manager {" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
