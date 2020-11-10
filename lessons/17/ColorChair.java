
// Кресло, у которого можно задать цвет
//
// Наследуемся от обычного кресла
public class ColorChair extends Chair {
    int red;
    int green;
    int blue;

    public ColorChair(int r, int g, int b) {
        super(4);
        red = r;
        green = g;
        blue = b;
    }

    public void setColor(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public String getColor() {
        if (red == 255 && green == 0 && blue == 0)
            return "red";
        if (red == 0 && green == 255 && blue == 0)
            return "green";
        if (red == 0 && green == 0 && blue == 255)
            return "blue";
        if (red == 255 && green == 255 && blue == 255)
            return "white";
        return "unknown";
    }

    public String toString() {
        return super.toString() + "; color: " + getColor();
    }
}
