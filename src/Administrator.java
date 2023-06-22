public class Administrator extends Employee {
    public Administrator(String firstName, String surName, String lastName, int age, String post, int salary, String phoneNumber) {
        super(firstName, surName, lastName, age, post, salary, phoneNumber);
    }

    @Override
    public void salaryUp(int addsalary, Employee employee, int age) {
        if (employee instanceof Administrator) {
            System.out.println(employee.getPost() + ": " + "I'm working for an idea!");
        } else {
            super.salaryUp(addsalary, employee, age);
        }
    }
}
