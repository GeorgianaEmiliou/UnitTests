package com.sparta.ge;

public class FilmClassifications {

    public static String availableClassifications(int ageOfViewer){
        String result;
        //Check if the age of viewer is below 12
       if(ageOfViewer < 12){
            result = "U, PG & 12 films are available.";
        }
       //Check if the age of viewer is below 15
        else if(ageOfViewer < 15){
            result = "U, PG, 12 & 15 films are available.";
        }
        else{
            result = "All films are available.";
        }
        return result;
    }
}
