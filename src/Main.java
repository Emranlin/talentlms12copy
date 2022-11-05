public class Main {
    public static void main(String[] args) {
        University university=new University();
        university.setName("BGU");
        university.setOpeningYear(1975);
        university.setAmountOfStudent(12000);

        University university1=new University();
        university1.setName("OshSu");
        university1.setOpeningYear(1990);
        university1.setAmountOfStudent(20000000);

        University university2=new University();
        university2.setName("National University");
        university2.setOpeningYear(1957);
        university2.setAmountOfStudent(7000000);

        University[]universities={university,university1,university2};
        allUniversities(universities);

        School school=new School();
        school.setName("Gagarina");
        school.setAmountOfPupil(17500);
        school.setLanguage("Kyrgyz");

        School school1=new School();
        school1.setName("Karl Marks");
        school1.setAmountOfPupil(320450);
        school1.setLanguage("Russian");

        School school2=new School();
        school2.setName("lomonosova");
        school2.setAmountOfPupil(567500);
        school2.setLanguage("English");

        School[]schools={school,school1,school2};
        allScholls(schools);

        Car car=new Car();
        car.setName("Lexus");
        car.setSpeed(260);
        car.setFuelInTank(1000);

        Car car1=new Car();
        car1.setName("Windom");
        car1.setSpeed(240);
        car1.setFuelInTank(1200);

        Car car2=new Car();
        car2.setName("Camry");
        car2.setSpeed(280);
        car2.setFuelInTank(1500);

        Car[] cars={car,car1,car2};
        allCars(cars);

        Penson person=new Penson();
        person.setName("Jiidegul");
        person.setAge(29);
        person.setProfession("Interpreter");

        Penson person1=new Penson();
        person1.setName("Lira");
        person1.setAge(34);
        person1.setProfession("Doctor");

        Penson person2=new Penson();
        person2.setName("Meerim");
        person2.setAge(39);
        person2.setProfession("Teacher");

        Penson[]persons={person,person1,person2};
        allPerson(persons);
    }
    public static void allUniversities(University[] universities){
        for(University univercuty:universities){
            System.out.println("The name of university :\n"+univercuty.getName());
            System.out.println("The university opened:\n"+univercuty.getOpeningYear());
            System.out.println("There are:\n"+univercuty.getAmountOfStudent());
            System.out.println("======================================================");

        }

    }
    public static void allScholls(School[]schools){
        for (School school:schools){
            System.out.println("The name of school:\n" + school.getName());
            System.out.println("The total amount:\n"+school.getAmountOfpPupil());
            System.out.println("The language of school:\n"+school.getLanguage());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
    public static void allCars(Car[] cars){
        for (Car car:cars){
            System.out.println("Name of the car:\n"+car.getName());
            System.out.println("The speed\n"+car.getSpeed());
            System.out.println("Fuel of the tank\n"+car.getFuelInTank());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void allPerson(Penson[]persons){
        for (Penson person:persons){
            System.out.println("Name f person\n"+person.getName());
            System.out.println("The age:\n"+person.getAge());
            System.out.println("Profession\n"+person.getProfession());
            System.out.println("**************************************************");
        }
    }

}