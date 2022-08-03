package models;

import services.HockeyStickService;

public class App {
    private HockeyStickService stickService = new HockeyStickService();

    public static void main(String...args){
        App application = new App();
        application.init();
    }

    public void init(){

    }




}
