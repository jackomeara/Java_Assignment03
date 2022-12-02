package org.example;

import static java.lang.Integer.parseInt;

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
     * Constructor accepting a single int to represent RGB values. Bits 0-7 represent
     * the blue component, 8-15 represent the green component and 16-23 represent the
     * red component
     * @param rgb representation of rgb as an int between 0 and 16,777,215 (24 bits)
     */
    public Colour(int rgb){
        // convert rgb int to binary string
        String binaryRGB = Integer.toBinaryString(rgb);

        // get each section that represents a value, converting back to decimal
        int rawR = parseInt((binaryRGB.substring(0,8)), 2);
        int rawG = parseInt((binaryRGB.substring(8,16)), 2);
        int rawB = parseInt((binaryRGB.substring(16,24)), 2);

        // normalise each value by dividing by 255 (as binary num can be between 0 and 255,
        // but is internally represented as float between 0.0 and 1.0)
        this.r = (float) rawR / 255;
        this.g = (float) rawG / 255;
        this.b = (float) rawB / 255;
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