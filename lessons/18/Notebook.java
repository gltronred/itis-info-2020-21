
public abstract class Notebook implements Pressable, Nameable {
    public String press(int key) {
        return getName() + " key " + key + " pressed";
    }
    public int getKeyCount() {
        return 10;
    }
}
