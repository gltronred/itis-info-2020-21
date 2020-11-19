public class Piano implements Pressable, Nameable {
    public String getName() { return "Piano"; }
    public String press(int key) {
        return getName() + " sound " + key;
    }
    public int getKeyCount() {
        return 5;
    }
}
