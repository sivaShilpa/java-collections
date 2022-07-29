import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ex1();
//        ex2();
//        ex3();
//        ex4();
//        ex5();
        ex6();
    }
    static void ex1(){
        var p = new Person("Tom", "Thumb", 11, "123-45-1234");
        var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
        var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

        if (p.equals(p1)) {
            System.out.printf("Yes");
        }
        if (p1.equals(p2)) {
            System.out.println("Here");
        }
    }

    static void ex2(){
        var inputString = "The water main broke on water street on the day before my birthday";
        var wordCounter = new WordCounter(inputString);
        wordCounter.countWords();
        System.out.println(wordCounter.getWordCount());
    }

    static void ex3(){
        var p = new Person("Alice", "Jones", 11, "111-11-1111");
        var p1 = new Person("Alice", "Jones", 11, "111-11-1111");
        var p2 = new Person("Bob", "Smith", 22, "222-22-2222");
        var p3 = new Person("Bob", "Smith", 22, "222-22-2222");

        var personDeDuper = new PersonDeDuper();
        personDeDuper.addPerson(p);
        personDeDuper.addPerson(p1);
        personDeDuper.addPerson(p2);
        personDeDuper.addPerson(p3);

        System.out.println(personDeDuper.getUniquePeople());
    }

    static void ex4(){
        var wordReverser = new WordReverser("This is a test");
        wordReverser.reverseWords();
        System.out.println(wordReverser.getReversedWords());
        System.out.println(wordReverser.getWordCount());
    }

    static void ex5() throws InterruptedException {
        var p1 = new Person("Alice", 11);
        var p2 = new Person("Bob", 22);
        var p3 = new Person("Charlie", 33);
        var p4 = new Person("Dave", 44);
        var p5 = new Person("Egar", 55);
        var p6 = new Person("Fred", 66);

        Queue<Person> que = new LinkedList<>();
        que.add(p1);
        que.add(p2);
        que.add(p3);
        que.add(p4);
        que.add(p5);
        que.add(p6);

        while (true) {
            System.out.println(que.peek().fName + " " + que.peek().age+ "\n");
            que.remove();

            if(que.isEmpty()){
                break;
            }

            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("Finished");
    }

    static void ex6(){
        ArrayList<Car> cars = new ArrayList<Car>();

        Car c1 = new Car("Hyundai", "Elantra Hybrid", 28350, "Black", 53);
        Car c2 = new Car("Toyota", "Venza", 40380, "Grey", 40);
        Car c3 = new Car("Toyota", "RAV4 Hybrid", 37575, "White", 41);
        Car c4 = new Car("Ford", "Escape Hybrid", 39185, "Brown", 60);
        Car c5 = new Car("Lexus", "UX 250h", 40390, "Red", 41);

        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        Collections.sort(cars, (car1, car2) -> {
            if (car1.miles == car2.miles)
                return 0;
            else if (car1.miles > car2.miles)
                return 1;
            else
                return -1;
        });

        for (Car car : cars) {

            // Print the sorted ArrayList
            System.out.println(car.model + " " + car.make + " " + car.price + " " + car.color + " " + car.miles + "\n");
        }

    }
}
