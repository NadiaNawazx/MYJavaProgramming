package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Nadia");
        Employee employee2 = new Employee("Manha");
        Employee employee3 = new Employee("Muzzy", 'M'  );

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
