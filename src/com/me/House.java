package com.me;

public class House {

    //Step 1 create fields for House
    private String color;
    private String style;
    private int size;
    private int bedrooms;
    private double bathrooms;
    private int year;
    private String garage;
    private String basement;

    //Step 2 make my own constructor method with parameters
    public House(String color, String style, int size, int bedrooms, double bathrooms, int year, String garage, String basement){

        //Step 3 this. to reference fields above
        this.color = color;
        this.style = style;
        this.size = size;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.year = year;
        this.garage = garage;
        this.basement = basement;

    }

    //Step 4 create getter methods for this. fields
    public String getColor(){
        return this.color;
    }

    public String getStyle(){
        return this.style;
    }

    public int getSize(){
        return this.size;
    }

    public int getBedrooms(){
        return this.bedrooms;
    }

    public double getBathrooms(){
        return this.bathrooms;
    }

    public int grtYear(){
        return this.year;
    }

    public String getGarage(){
        return this.garage;
    }

    public String getBasement(){
        return this.basement;
    }

}
