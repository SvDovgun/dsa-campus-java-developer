import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EmployeeFactory {
    int indexId =new Random().nextInt(5) + 1;
    List<String> nameList = Arrays.asList("Lorenzo Leon", "Riley Whitney", "Kate Lopez", "Clayton Whitaker", "Kaylah Chan", "Leroy Andrade", "Kenneth Bishop", "Leandro Pearson", "Kaylen Curry", "Cortez Watkins", "Mira Bradshaw", "Raul Pitts");
    List<String> femaleNameList = Arrays.asList("Sasha", "Alyssa", "Fiona", "Justice", "Elsa", "Breanna", "Cristina", "Kaitlyn", "Jazmine", "Karli", "Alice", "Simone");
    List<String> maleNameList = Arrays.asList("Sullivan", "Tristian", "Sterling", "Jovani", "Jaeden", "Jamal", "Marshall", "Efrain", "Irvin", "Finnegan", "Joshua", "Justin");

    String generateName(){
        Random random = new Random();
        String name = nameList.get(random.nextInt(nameList.size()));
        int ind =  nameList.indexOf(name);
        //nameList.set(ind, null);
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

    int generateDefaultBugRate() {
        return new Random().nextInt(5) + 1;
    }

    Employee generateEmployee() {
        return  new Employee(generateId(),generateName(), generateAge(), generateSalary(), generateGender(), generateFixedBugs(),generateDefaultBugRate())  ;
    }

    Employee[] generateEmployees(int size) {
        Employee[] employees = new Employee[size];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

}
