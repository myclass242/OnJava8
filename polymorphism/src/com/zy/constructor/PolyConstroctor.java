package com.zy.constructor;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() Before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlypg extends Glyph {
    private int radius = 1;
    RoundGlypg(int r) {
        radius = r;
        System.out.println("RoundGlypg(),radius=" + radius);
    }
    @Override
    void draw() {
        System.out.println("RoundGlypg.draw(),radius=" + radius);
    }
}

public class PolyConstroctor {
    public static void main(String[] args) {
        new RoundGlypg(5);
    }
}
