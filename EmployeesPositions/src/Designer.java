public class Designer extends  Employee{

    double rate;
    int workedDays;

    public Designer(long id, String name, int age, double salary, String gender, double rate, int workedDays) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }


    @Override
    public double calculateSalary() {
        double calculatesSalary = 0 ;
        calculatesSalary= this.salary + this.rate * this.workedDays;
        return calculatesSalary;
    }

    @Override
    public String toString() {
        return "Designer {" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender  + '\'' +
                ", rate=" + rate  +
                ", workedDays=" + workedDays  +
                '}';
    }
}
