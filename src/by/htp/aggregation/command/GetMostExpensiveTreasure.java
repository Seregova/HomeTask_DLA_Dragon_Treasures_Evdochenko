package by.htp.aggregation.command;

import by.htp.aggregation.dao.TreasureDao;
import by.htp.aggregation.entities.Treasure;

public class GetMostExpensiveTreasure extends Command {

    @Override
    public void execute(Integer arg){
        Treasure treasure = TreasureDao.getInstance().getMostExpensiveTreasure();
        System.out.println("the most expensive treasure");
        System.out.println(treasure);
    }
}
