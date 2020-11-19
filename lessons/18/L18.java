public class L18 {
    public static void main(String[] args) {
        Pressable[] p = new Pressable[3];
        p[0] = new Piano();
        p[1] = new Notebook();
        p[2] = new Thinkpad();

        for (int i = 0; i < p.length; i++) {
            Pressable item = p[i];
            for (int j = 0; j < item.getKeyCount(); j++) {
                System.out.println(item.press(j));
            }
        }
    }
}