import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> arrEmployee = new ArrayList<>();

        Employee employee = new Employee("Oleg", "Alekseevich",
                "Petrov", 50, "mechanikal", 29000, "89809805466");

        Employee employee1 = new Employee("Alex", "Alekseevich",
                "Loto", 36, "mechanikal", 30000, "89809866467");

        Employee employee2 = new Employee("Max", "Alekseevich",
                "Ric", 45, "mechanikal", 32000, "89807705467");

        Administrator director = new Administrator("Max", "Maksomovich",
                "Maksimov", 30, "director", 130000, "89807705499");

        arrEmployee.add(employee);
        arrEmployee.add(employee1);
        arrEmployee.add(employee2);
        arrEmployee.add(director);

        //Список сотрудников
        System.out.println("Список сотрудников");
        Employee.printListEmployees(arrEmployee);


        // Индексация зарплат
        System.out.println("\nСписок сотрудников с индексированной зарплатой на 5000 в возрасте до 46");
        for (int i = 0; i < arrEmployee.size(); i++) {
            arrEmployee.get(i).salaryUp(5000, arrEmployee.get(i), 46);
        }

        // Список сотрудников с новой зарплатой
        Employee.printListEmployees(arrEmployee);

        // Отсортированый список сотрудников по зарплате
        System.out.println("\nОтсортированый список сотрудников по зарплате");
        arrEmployee.sort(Employee::compareTo);
        Employee.printListEmployees(arrEmployee);

        // Отсортированый список сотрудников по возрасту
        System.out.println("\nОтсортированый список сотрудников по возрасту");
        Collections.sort(arrEmployee, new MyComparator());
        Employee.printListEmployees(arrEmployee);
    }
}