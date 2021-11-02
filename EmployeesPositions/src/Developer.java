import java.util.Random;

public class Developer extends  Employee{

    int fixedBugs;

    int ratio = 25;

    public Developer(long id, String name, int age, double salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }

    @Override
    public double calculateSalary() { //(ставка + fixedBugs * коэффициент) * (randomBoolean ? 2 : 0)
        double calculatesSalary = 0 ;
        boolean randomBoolean = new Random().nextBoolean();
        calculatesSalary = (salary + fixedBugs * ratio) * (randomBoolean ? 2 : 0) ;
        return calculatesSalary;
    }

    @Override
    public String toString() {
        return "Developer {" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", fixedBugs=" + fixedBugs +
                '}';
    }
}
