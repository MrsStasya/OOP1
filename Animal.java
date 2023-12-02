//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.PrintStream;
import java.time.LocalDate;

public class Animal {
    private String name;
    private Illness illness;
    private String ownerName;
    private LocalDate birthday;

    public Animal() {
    }

    public Animal(String name, Illness illness, String ownerName, LocalDate birthday) {
        this.name = name;
        this.illness = illness;
        this.ownerName = ownerName;
        this.birthday = birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Illness getIllness() {
        return this.illness;
    }

    public void toWakeUp() {
        System.out.println(this.getClass().getSimpleName() + " проснулось");
    }

    private void toWakeUp(String time) {
        PrintStream var10000 = System.out;
        String var10001 = this.getClass().getSimpleName();
        var10000.println(var10001 + " проснулось в " + time);
    }

    private void eat() {
        System.out.println(this.getClass().getSimpleName() + " кушает");
    }

    private void play() {
        System.out.println(this.getClass().getSimpleName() + " ест");
    }

    private void sleep() {
        System.out.println(this.getClass().getSimpleName() + " спит");
    }

    public void lifeCycle() {
        this.toWakeUp();
        this.eat();
        this.play();
        this.sleep();
    }

    public void toGo() {
        System.out.println(this.getClass().getSimpleName() + " двигается");
    }

    public void toFly() {
        System.out.println(this.getClass().getSimpleName() + " полетела");
    }

    public void toSwim() {
        System.out.println(this.getClass().getSimpleName() + " плавает");
    }

}
