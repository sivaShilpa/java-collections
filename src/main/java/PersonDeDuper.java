import java.util.HashSet;

public class PersonDeDuper {

    HashSet<Person> people = new HashSet<Person>();
    public void addPerson(Person p) {
        people.add(p);
    }

    public String getUniquePeople() {
        String output = "";

        for(Person person : people){
            output += person.fName + " " + person.lName + ", " + person.age + ", " + person.pNumber + "\n";
        }

        return output;
    }


}

