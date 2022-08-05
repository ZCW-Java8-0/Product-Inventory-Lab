package io;

import services.HockeyStickService;

import java.util.Scanner;

public class App {
    private HockeyStickService stickService = new HockeyStickService();

    public static void main(String...args){
        App application = new App();
        application.init();
    }

    public void init(){
        Console.printWelcome();
    }

    public String userInput(){
        Integer opt1 = 0;
        String opt2 = "";
        String opt3 = "";
        Integer opt4 = 0;
        Integer opt5 = 0;
        Double opt6 = 0.0;


        while (addMore = true){
            System.out.println("What do you wish to add to inventory? Press 1 for Stick 2 for Skate");
            Scanner scanner = new Scanner(String.valueOf(input));
            System.out.println();
            System.out.println("Product Name?");
            opt2 = String.valueOf(scanner.hasNextInt());
            System.out.println("Product Brand?");
            opt3 = String.valueOf(scanner.hasNextInt());
            System.out.println("Product Size");
            opt4 = Integer.valueOf(String.valueOf(scanner.hasNextInt()));
            System.out.println("Product Price");
            opt6 = Double.valueOf(String.valueOf(scanner.hasNextInt()));
            System.out.println("How many would you like to add?");
            opt5 = Integer.valueOf(String.valueOf(scanner.hasNextInt()));
            System.out.println("Products I.D.?");
            if(input = 1){
                HockeyStickService.create(o)


            }


        }

    }




}

