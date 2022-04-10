package day30_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 234432, 'M',"Reception", 45000, true);
        employee2.setInfo("Ali", 54567, 'M',"Administration", 40000, true);
        employee3.setInfo("Yacub", 34534, 'M',"desktop Support", 29999, false);
        employee4.setInfo("Nadia", 45454, 'F',"Clerk", 59.955, true);
        employee5.setInfo("Sarah", 86767, 'F',"Manager", 19.955, false);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
        }else{
                countPartTime++;
            }

            if (employee.salary > max){
                max = employee.salary;
            }
            if (employee.salary < min){
                min = employee.salary;
            }

        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);









    }
}
