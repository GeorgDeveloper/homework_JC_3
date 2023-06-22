public class Employee {
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

   public void addSalary (int addsalary){
      this.salary = this.salary + addsalary;
   }

   @Override
   public String toString() {
      return "Employee{" +
              "firstName='" + firstName + '\'' +
              ", surName='" + surName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age=" + age +
              ", post='" + post + '\'' +
              ", salary=" + salary +
              ", phoneNumber='" + phoneNumber + '\'' +
              '}';
   }
}
