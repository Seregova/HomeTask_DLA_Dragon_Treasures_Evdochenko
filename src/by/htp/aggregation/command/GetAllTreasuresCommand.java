package by.htp.aggregation.command;

import by.htp.aggregation.dao.TreasureDao;
import by.htp.aggregation.entities.Treasure;

import java.util.ArrayList;

    public class GetAllTreasuresCommand extends Command {
        @Override
        public void execute(Integer arg){
            ArrayList<Treasure> treasures = TreasureDao.getInstance().getAllTreasures();

            System.out.println("all treasures");
            System.out.println(treasures);
        }
    }

