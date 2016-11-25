class Glyph {
    void draw() { System.out.println("Glyph.draw()"); }
        Glyph() {
            System.out.println("Glyph() before draw()");
            draw();
            System.out.println("Glyph() after draw()");
        }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int height = 1;
    private int width = 2;

    RectangularGlyph(int h, int w) {
        height = h;
        width = w;
        System.out.println("RectangularGlyph.RectangularGlyph(), height = " + height);
        System.out.println("RectangularGlyph.RectangularGlyph(), width = " + width);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw(), height = " + height);
        System.out.println("RectangularGlyph.draw(), width = " + width);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(5, 10);
    }
}
