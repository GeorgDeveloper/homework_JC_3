import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> arrEmployee = new ArrayList<>();

        Employee employee = new Employee("Oleg", "Alekseevich",
                "Petrov", 32, "mechanikal" , 30000,"89809805466");

        Employee employee1 = new Employee("Alex", "Alekseevich",
                "Loto", 36, "mechanikal" , 30000,"89809866467");

        Employee employee2 = new Employee("Max", "Alekseevich",
                "Ric", 45, "mechanikal" , 32000,"89807705467");

        arrEmployee.add(employee);
        arrEmployee.add(employee1);
        arrEmployee.add(employee2);

        for (int i = 0; i < arrEmployee.size(); i++) {
            System.out.println(arrEmployee.get(i).toString());
        }

        for (int i = 0; i < arrEmployee.size(); i++) {
            if (arrEmployee.get(i).getAge() < 40){
                arrEmployee.get(i).addSalary(5000);
            }
        }

        for (int i = 0; i < arrEmployee.size(); i++) {
            System.out.println(arrEmployee.get(i).toString());
        }

    }
}