package org.example;

public class Colour {
    private float r;
    private float g;
    private float b;

    /**
     * Constructor for colour with three float values
     * @param r float to represent red value
     * @param g float to represent green value
     * @param b float to represent blue value
     */
    public Colour(float r, float g, float b){
        if( (r < 0.0F || r > 1.0F) || (g < 0.0F || g > 1.0F) || (b < 0.0F || b > 1.0F) ){
            throw new IllegalArgumentException("rgb values must be between 0.0 and 1.0");
        }

        this.r = r;
        this.g = g;
        this.b = b;
    }

    /**
     * Getter for red value
     * @return r red value as a float
     */
    public float getR(){
        return r;
    }

    /**
     * Getter for green value
     * @return g green value as a float
     */
    public float getG(){
        return g;
    }

    /**
     * Getter for blue value
     * @return b blue value as a float
     */
    public float getB(){
        return b;
    }
}