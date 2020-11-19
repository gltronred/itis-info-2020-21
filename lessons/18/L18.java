public class L18 {
    public static void main(String[] args) {
        Pressable[] p = new Pressable[2];
        p[0] = new Piano();
        //p[1] = new Notebook();
        p[1] = new Thinkpad();

        // проход по всем элементам
        for (Pressable item : p) {
            for (int j = 0; j < item.getKeyCount(); j++) {
                System.out.println(item.press(j));
            }
        }
    }
}
