public class Fitness {
    public static void main(String[] args) {
     Persons person1 = new Persons("Bob ","Lays ", "bobik54@gmail.com ","2324242",
             80,130,5500,1996);
     Persons person2 = new Persons("Mike ","Sam ","mikes56@g,ail.com ","94646465 ",
             90,125,7000,1991);
     Persons person3 = new Persons("Ban ","Simpson ","bansim59@gmail.com ","6452525",
             65,95,4300,2000);
     Persons person4 = new Persons("Luk ","Batman ","badbad32@gmail.com ","43970644",
             65,120,3000,1987);
     Persons person5 = new Persons("Jame ","Sos ","Sos90@gmail.com ","3455322",
             97,145,2700,1979);


    person1.printAccountInfo();
    person2.printAccountInfo();
    person3.printAccountInfo();
    person4.printAccountInfo();
    person5.printAccountInfo();

     person4.setLastName("Lourens ");
     person4.setWeight(93);
     person4.setBloodPressure(140);
     person4.setSteps(7000);

     person5.setLastName("Mood ");
     person5.setWeight(86);
     person5.setBloodPressure(115);
     person5.setSteps(5350);

     person4.printAccountInfo();
     person5.printAccountInfo();

    }
}
