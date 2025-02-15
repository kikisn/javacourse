package chapter9;

public class InheritanceTester {

    public static void main(String[] args){

        Person person = new Person();
        Employee employee = new Employee();
        employee.setName("Shaniqua");

        System.out.println(employee.getName());
    }
}
