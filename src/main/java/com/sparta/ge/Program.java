package com.sparta.ge; //lowercase, _between the words

//Program.java
//Access modifiers:
// 1. private - only accessible in the same class,
// 2. public - accessible everywhere in the program,
// 3. protected - accessible in this class and any class inheritance this class,
// 4. default - accessible by each child and within the package
//Method
public class Program { //Nouns - Capital letter, WeUseCamelCase
    public static void main(String[] args) { //lowercase, verbs
        //Statically typed language - checks if the data type and the value match
        //Strongly typed language - we have to define the type of the variable
        int timeOfDay = 21; //lowercase, nouns
        //primitive data types: boolean, float, double, char, bit, long, short
        System.out.println(Greeter.getGreeting(timeOfDay));

        int ageOfViewer = 10;
        System.out.println(FilmClassifications.availableClassifications(ageOfViewer));


    }

}
