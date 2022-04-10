package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage, secretCode;

    static{
        schoolName = "Cydeo";
        programmingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }

    public static void printProgrammingLanguage(String programmingLanguage){
        System.out.println("Language is "+programmingLanguage);
    }

    public static void printSchoolName(String schoolName){
        System.out.println("School name is "+schoolName);
    }

    public static void printSecretCode(String schoolName){
        System.out.println("code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+" is attending class.");
    }

    public void study(){
        System.out.println(name+" is studying.");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
            Add a constructor to initialize all the fields
            Add a static block to initialize all the statics
            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */