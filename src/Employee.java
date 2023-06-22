import java.util.ArrayList;
import java.util.Comparator;


public class Employee implements Comparable<Employee> {
    private String firstName;
    private String surName;
    private String lastName;
    private int age;
    private String post;
    private int salary;
    private String phoneNumber;

    public Employee(String firstName, String surName, String lastName, int age, String post, int salary, String phoneNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void salaryUp(int addsalary, Employee employee, int age) {
        if (employee.getAge() < age) {
            this.salary = this.salary + addsalary;
        }
    }

    public static void printListEmployees(ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return String.format("Ф.И.О = %s %s %s, Возраст = %d, Должность = %s, Зарплата = %d, Номер телефона = %s",
                lastName, firstName, surName, age, post, salary, phoneNumber);
//        return "Ф.И.О. = '" lastName + " " + firstName + '\'' +
//                ", Отчество = '" + surName + '\'' +
//                ", Фамилия ='" + lastName + '\'' +
//                ", age=" + age +
//                ", post='" + post + '\'' +
//                ", salary=" + salary +
//                ", phoneNumber='" + phoneNumber + '\'';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary == o.salary) {
            return 0;
        } else if (this.salary < o.salary) {
            return -1;
        } else {
            return 1;
        }
    }

}

