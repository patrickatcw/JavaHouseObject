package com.me;

public class Main {

    public static void main(String[] args) {

    //Step 5 using constructors to build new instances
        //of a class, creating new objects
        House choice1 = new House ("blue", "ranch", 2600, 3, 2, 1993,
                "attached", "finished", 240_000);
        House choice2 = new House ("white", "colonial", 2900, 4, 3.5, 2005,
                "detached", "finished", 270_000);
        House choice3 = new House ("brick", "condo", 2300, 3, 1.5, 2015,
                "attached", "crawlspace", 200_000);
        House choice4 = new House ("beige", "bungalow", 1700, 3, 2, 1957,
                "detached", "semi-finished", 157_000);
        House choice5 = new House ("red", "townhouse", 2200, 3, 2, 2014,
                "attached", "finished", 230_000);

        //Step 6 Printout logic and statements
        System.out.println("We have narrowed our purchase options to the following houses...");
        System.out.println("Choice 1 is a " + choice1.getColor() + " " + choice1.getStyle() + " with " +
                choice1.getSize() + " square feet. It has " + choice1.getBedrooms() + " bedrooms with " +
                choice1.getBathrooms() + " bathrooms. Built in " + choice1.getYear() + ", it has an " +
                choice1.getGarage() + " garage, with a " + choice1.getBasement()
                + " basement. The asking price for this house" + " is $" + choice1.getCost() + ".");
        System.out.println("Choice 2 is a " + choice2.getColor() + " " + choice2.getStyle() + " with " +
                choice2.getSize() + " square feet. It has " + choice2.getBedrooms() + " bedrooms with " +
                choice2.getBathrooms() + " bathrooms. Built in " + choice2.getYear() + ", it has a " +
                choice2.getGarage() + " garage, with a " + choice2.getBasement() +
                " basement. The asking price for this house" + " is $" + choice2.getCost() + ".");
        System.out.println("Choice 3 is a " + choice3.getColor() + " " + choice3.getStyle() + " with " +
                choice3.getSize() + " square feet. It has " + choice3.getBedrooms() + " bedrooms with " +
                choice3.getBathrooms() + " bathrooms. Built in " + choice3.getYear() + ", it has an " +
                choice3.getGarage() + " garage, with a " + choice3.getBasement() +
                " . The asking price for this house" + " is $" + choice3.getCost() + ".");
        System.out.println("Choice 4 is a " + choice4.getColor() + " " + choice4.getStyle() + " with " +
                choice4.getSize() + " square feet. It has " + choice4.getBedrooms() + " bedrooms with " +
                choice4.getBathrooms() + " bathrooms. Built in " + choice4.getYear() + ", it has a " +
                choice4.getGarage() + " garage, with a " + choice4.getBasement() +
                " basement. The asking price for this house" +
                " is $" + choice4.getCost() + ".");
        System.out.println("Choice 5 is a " + choice5.getColor() + " " + choice5.getStyle() + " with " +
                choice5.getSize() + " square feet. It has " + choice5.getBedrooms() + " bedrooms with " +
                choice5.getBathrooms() + " bathrooms. Built in " + choice5.getYear() + ", it has an " +
                choice5.getGarage() + " garage, with a " + choice5.getBasement() +
                " basement. The asking price for this house" +
                " is $" + choice5.getCost() + ".");

    }

}

//Results
   /* We have narrowed our purchase options to the following houses...
        Choice 1 is a blue ranch with 2600 square feet. It has 3 bedrooms with 2.0 bathrooms. Built in 1993,
        it has an attached garage, with a finished basement. The asking price for this house is $240000.
        Choice 2 is a white colonial with 2900 square feet. It has 4 bedrooms with 3.5 bathrooms. Built in 2005,
        it has a detached garage, with a finished basement. The asking price for this house is $270000.
        Choice 3 is a brick condo with 2300 square feet. It has 3 bedrooms with 1.5 bathrooms. Built in 2015,
        it has an attached garage, with a crawlspace . The asking price for this house is $200000.
        Choice 4 is a beige bungalow with 1700 square feet. It has 3 bedrooms with 2.0 bathrooms. Built in 1957,
        it has a detached garage, with a semi-finished basement. The asking price for this house is $157000.
        Choice 5 is a red townhouse with 2200 square feet. It has 3 bedrooms with 2.0 bathrooms. Built in 2014,
        it has an attached garage, with a finished basement. The asking price for this house is $230000.
*/