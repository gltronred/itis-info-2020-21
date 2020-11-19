public class Notebook implements Pressable, Nameable {
    public String getName() { return "Notebook"; }
    public String press(int key) {
        return getName() + " key " + key + " pressed";
    }
    public int getKeyCount() {
        return 10;
    }
}
