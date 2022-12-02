package org.example;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ColourTest {

    @Test
    void ConstructorWithThreeFloatRGBValues() {
        float r = 0.8F;
        float g = 0.4F;
        float b = 0.2376548F;

        Colour colour = new Colour(r, g, b);

        assertEquals(r, colour.getR());
        assertEquals(g, colour.getG());
        assertEquals(b, colour.getB());
    }

    @Test
    void ConstructorWithIllegalFloatRGBValuesOutsideRange(){
        float r = 1.1F;
        float g = 0.5436F;
        float b = -0.01F;

        assertThrows(IllegalArgumentException.class, ()->{
            new Colour(r, g, b);
        });
    }

    @Test
    void ConstructorWithSingleRGBValue(){
        int rgb = 15895632;

        Colour colour = new Colour(rgb);

        assertEquals(colour.getR(), 0.94901960784F);
        assertEquals(colour.getG(), 0.54901960784F);
        assertEquals(colour.getB(), 0.31372549019F);
    }

    @Test
    void ConstructorWithSingleRGBValueWithInvalidValue(){
        int rgb = 293493282;

        assertThrows(IllegalArgumentException.class, ()->{
            new Colour(rgb);
        });
    }

    @Test
    void CompareAlikeColours(){
        Colour colourA = new Colour(0.5F, 1.0F, 0.236871F);
        Colour colourB = new Colour(0.5F, 1.0F, 0.236871F);

        assertTrue(colourA.isEqual(colourB));
        assertTrue(colourB.isEqual(colourA));
    }

    @Test
    void CompareDifferentColours(){
        Colour colourA = new Colour(0.23F, 0.0F, 0.84532871F);
        Colour colourB = new Colour(123563);

        assertFalse(colourA.isEqual(colourB));
        assertFalse(colourB.isEqual(colourA));
    }
}