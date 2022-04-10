package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Manha", 342343, "LEAD SDET", 1800000);
        Tester tester2 = new Tester("Zanib", 342341, "SDET", 1230000);
        Tester tester3 = new Tester("Muzzy", 345422, "QA", 1345000);
        Tester tester4 = new Tester("Mittu", 343525, "QA", 1150000);

        Tester[] testers = {tester2,tester3,tester4};

        //5 developers objects
        Developer developer1 = new Developer("Saif", 87678, "Senior Software Engineer", 1100000);
        Developer developer2 = new Developer("Aadam", 8765, "Software Engineer", 123000);
        Developer developer3 = new Developer("Sami", 87656, "Software Engineer", 125500);
        Developer developer4 = new Developer("Raees", 9876, "Junior Software Engineer", 130000);

        Developer[] developers = {developer2,developer3, developer4};

        //1 ScrumTeam Objects
        ScrumTeam scrum = new ScrumTeam("Nigara", "Hussain", "Nelli", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------------------------------------------------------------------------");

        for ( Tester eachTester : scrum.testersList ){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        System.out.println("------------------------------------------------------------------------------");

        for ( Developer eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }

        System.out.println("------------------------------------------------------------------------------");

        scrum.removeTester( 345422 );
        scrum.removeDeveloper(87656);

        System.out.println(scrum);









    }
}
/*
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */