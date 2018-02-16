package com.me;

public class Main {

    public static void main(String[] args) {

    //Step 5 using constructors to build new instances
        //of a class, creating new objects
        House choice1 = new House ("blue", "ranch", 2600, 3, 2, 1993,
                "attached", "finished");
        House choice2 = new House ("white", "colonial", 2900, 4, 3.5, 2005,
                "detached", "finished");
        House choice3 = new House ("brick", "condo", 2300, 3, 1.5, 2015,
                "attached", "crawlspace");
        House choice4 = new House ("beige", "bungalow", 1700, 3, 2, 1957,
                "detached", "semi-finished");
        House choice5 = new House ("red", "townhouse", 2200, 3, 2, 2014,
                "attached", "finished");

    }

}
