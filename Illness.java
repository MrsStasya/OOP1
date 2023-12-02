/*
Инкапсуляция болезни и метода лечения
 */
public class Illness {
    public String illnessName;

    public Illness(String illnessName) {
        this.illnessName = illnessName;
    }
    public void heal() {
        System.out.println("Выпить 5 пачек парацетомола");
    }

    @Override
    public String toString() { //переопределяем метод toString в классе Object(стандартную реализацию метода, когда возвращается название класса@адрес в памяти компьютера
        return illnessName;
    }
}
