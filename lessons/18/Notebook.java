public class Notebook implements Pressable {
    public String press(int key) {
        return "Notebook key " + key + " pressed";
    }
    public int getKeyCount() {
        return 10;
    }
}
