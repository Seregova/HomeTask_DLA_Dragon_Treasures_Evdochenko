package by.htp.aggregation.command;

import by.htp.aggregation.dao.TreasureDao;
import by.htp.aggregation.entities.Treasure;

public class GetTreasureByValue extends Command {
    @Override
    public void execute(Integer arg){
        if (arg == null) {
            System.out.println("Value is null. Wrong value");
            return;
        }
        Treasure treasure = TreasureDao.getInstance().getTreasuresByValue(arg);

        System.out.println("treasure by value with value " + arg);
        System.out.println(treasure);
    }
}
