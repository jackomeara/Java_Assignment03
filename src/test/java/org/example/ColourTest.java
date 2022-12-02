package org.example;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    void ConstructorWithThreeFloatValues() {
        float r = 0.8F;
        float g = 0.4F;
        float b = 0.2376548F;

        Colour colour = new Colour(r, g, b);

        assertEquals(r, colour.getR());
        assertEquals(g, colour.getG());
        assertEquals(b, colour.getB());
    }
}