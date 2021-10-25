import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeFactory {
    int indexId =new Random().nextInt(5) + 1;
    List<String> nameList = Arrays.asList("Lorenzo Leon", "Riley Whitney", "Kate Lopez", "Clayton Whitaker", "Kaylah Chan", "Leroy Andrade", "Kenneth Bishop", "Leandro Pearson", "Kaylen Curry", "Cortez Watkins", "Mira Bradshaw", "Raul Pitts");
    List<String> femaleNameList = Arrays.asList("Sasha", "Alyssa", "Fiona", "Justice", "Elsa", "Breanna", "Cristina", "Kaitlyn", "Jazmine", "Karli", "Alice", "Simone");
    List<String> maleNameList = Arrays.asList("Sullivan", "Tristian", "Sterling", "Jovani", "Jaeden", "Jamal", "Marshall", "Efrain", "Irvin", "Finnegan", "Joshua", "Justin");


    String generateName(String gender) {
        Random random = new Random();
        int index = random.nextInt(femaleNameList.size());
        String name = "";
        if (gender.equals("female")) {
            name = femaleNameList.get(index);
        } else {
            name = maleNameList.get(index);
        }
        return name;
    }

    long generateId(){
          return indexId++; //new Random().nextInt(indexId) + 1;
    }

    int generateAge(){
        return new Random().nextInt(70) + 1;
    }

    int generateSalary(){
        return new Random().nextInt(3000) + 500;
    }

    String generateGender(){
        List<String> genderList = Arrays.asList("male","female");
        Random gender = new Random();
        return genderList.get(gender.nextInt(genderList.size()));
    }

    int generateFixedBugs(){
        return new Random().nextInt(20) + 5;
    }

    double generateRate() {
        return new Random().nextInt(50) + 1;
    }

    int  generateWorkedDays() {
        return new Random().nextInt(22) + 1;
    }

    Employee generateEmployee() {
        int random = (new Random()).nextInt(3);
        String gender = generateGender();
        System.out.println(" random " + random);
        switch (random) {
            case 0:
                return new Developer(generateId(), generateName(gender), generateAge(), generateSalary(), gender, generateFixedBugs());
            case 1:
                return new Manager(generateId(), generateName(gender), generateAge(), generateSalary(), gender);
            case 2:
                return new Designer(generateId(), generateName(gender), generateAge(), generateSalary(), gender, generateRate(), generateWorkedDays());
        }
        return null;

       // return  new Employee(generateId(),generateName(), generateAge(), generateSalary(), generateGender())  ;
    }

    Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

}
