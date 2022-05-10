import pacote01.Dog;
import pacote02.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Dog d1 = new Dog();
        Person p1 = new Person();
        d1.bark();
        p1.hello();
    }
}
