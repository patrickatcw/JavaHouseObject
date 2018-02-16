package com.me;

public class House {

    //Step 1 create fields for House
    private String color;
    private String style;
    private String size;
    private int bedrooms;
    private int bathrooms;
    private int year;
    private String garage;
    private String basement;

    //Step 2 make my own constructor method with parameters
    public House(String color, String style, String size, int bedrooms, int year, String garage, String basement){

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


}
