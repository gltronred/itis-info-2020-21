public class Piano implements Pressable {
    public String press(int key) {
        return "Piano sound " + key;
    }
    public int getKeyCount() {
        return 5;
    }
}
