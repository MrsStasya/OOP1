import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //cat - экземпляр класса.
        cat.setName("Barsic");
        //System.out.println(cat.getName());
        Dog dog = new Dog("Max", new Chumka("chumka"), "Petr", LocalDate.of(3, 12, 1));

//        System.out.println(dog.getName());
//        System.out.println(dog.getIllness());
        //dog.getIllness().heal(); //выбираем вылечить болезнь нашей собаки. В классе Chumka нет болезни и метода лечения, но есть в классе родителя, поэтому повидение передается в класс наследник. При желании метод можно переопределить
//        dog.toWakeUp("13.22"); //перегрузка метода
//        dog.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        //dog.lifeCycle();

        Bird bird = new Bird();
        bird.setName("Bird");
        Fish fish = new Fish();
        fish.setName("Fish");

        bird.toSwim();
        bird.toFly();
        bird.toGo();

        fish.toSwim();
        fish.toFly();
        bird.toGo();






    }
}