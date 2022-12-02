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