
// Название класса должно начинаться с заглавной буквы
// и совпадать с названием файла
public class Chair {
    // Поле для хранения количества ног
    int legsCount;

    // Конструктор
    //
    // Если без него - будет только конструктор по умолчанию
    // без параметров Chair()
    public Chair(int legs) {
        System.out.println("Created a chair with " + legs + " legs");
        legsCount = legs;
    }

    public void addLeg() {
        legsCount++;
    }

    public void addMoreLegs(int additionalLegs) {
        legsCount += additionalLegs;
    }

    public int getLegs() { return legsCount; }

    // Преобразование в строку (для System.out.println)
    public String toString() {
        return getName() + " with " + legsCount + " legs";
    }

    // Статический метод - в классе,
    // для всех объектов класса один и тот же
    public static String getName() {
        return "A chair";
    }
}
