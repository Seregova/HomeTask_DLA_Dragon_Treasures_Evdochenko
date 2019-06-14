package by.htp.aggregation.controller;

import by.htp.aggregation.command.*;

public class TreasureController {
    public void doExecute(String request){

        String[] splittedRequest = request.split(",");
        String operation = splittedRequest[0].replaceAll("\\s+","");
        Command command = null;

        if (operation.equals("getAllTreasures")) {
            command = new GetAllTreasuresCommand();
        }else if (operation.equals("getTreasureByValue")) {
            command = new GetTreasureByValue();
        }else if (operation.equals("getMostExpensiveTreasure")) {
            command = new GetMostExpensiveTreasure();
        }else {
            command = new EmptyCommand();
        }

        Integer integer = null;

        try{
            integer = Integer.parseInt(splittedRequest[1].replaceAll("\\s+",""));
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
      
        command.execute(integer);
    }
}
