
// Название класса должно начинаться с заглавной буквы
// и совпадать с названием файла
public class Chair {
    // Поле для хранения ног
    Leg[] legs = new Leg[5];
    boolean back;
    int armRests;

    // Конструктор
    //
    // Если без него - будет только конструктор по умолчанию
    // без параметров Chair()
    public Chair(int legs) {
        // this - конкретно этот объект, с которым работаем
        this.legs = new Leg[legs];
        for (int i = 0; i<legs; i++) {
            this.legs[i] = new Leg();
        }
        System.out.println("Created a chair with " + legs + " legs");
    }

    public void addLeg() {
        // legsCount++;
    }

    public void addMoreLegs(int additionalLegs) {
        // legsCount += additionalLegs;
    }

    public int getLegs() { return legs.length; }

    // Преобразование в строку (для System.out.println)
    public String toString() {
        String s = "";
        for (int i=0; i<getLegs(); i++) {
            s += (legs[i] + " ");
        }
        return getName() + " with " + getLegs() + " legs: " + s;
    }

    // Статический метод - в классе,
    // для всех объектов класса один и тот же
    public static String getName() {
        return "A chair";
    }
}
