public class Person {
    String fName;
    String lName;
    int age;
    String pNumber;
    public Person(String fName, String lName, int age, String pNumber) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.pNumber = pNumber;
    }

    public Person(String name, int age) {
        this.fName = name;
        this.age = age;
    }

    public String getpNumber() {
        return pNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return pNumber.equals(person.pNumber);
    }
}
