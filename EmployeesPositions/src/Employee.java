public class Employee {
    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;
    double bonus;

//    Employee() {
//        System.out.println("WARNING!! New Employee creation is in progress!");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }
    public double calculateSalary() {
        double calculatesSalary = salary ;
        return calculatesSalary;
    }

    public double getBonus() {
        return bonus = this.getFixedBugs() * this.getDefaultBugRate();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    Employee(long id, String name, int age, double salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Employee {" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
             //   ", fixedBugs=" + fixedBugs +
             //   ", defaultBugRate=" + defaultBugRate +
              //  ", Bonus=" + getBonus() +
                " }";
    }
}
