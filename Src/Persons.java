public class Persons {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private int weight;
    private int bloodPressure;
    private int steps;
    private int age;


    public Persons(String name, String lastName, String email, String phone, int weight, int bloodPressure,
                   int steps, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.steps = steps;
        this.age = age;

        int currentYear = 2020;
        this.age = currentYear - age;
    }

    public void printAccountInfo(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имейл: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вес " + weight);
        System.out.println("Давлени: " + bloodPressure);
        System.out.println("Кол-во шагов в день: " + steps);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void setBloodPressure(int bloodPressure){
        this.bloodPressure = bloodPressure;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSteps(int steps){
        this.steps = steps;
    }

}
