class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
}

class Main{
    public static void main(String[] args) {
            Person person1 = new Person("Amirotul Subaidah", 19, "Burneh, Bangkalan");
            person1.displayInfo();
    } 
}
