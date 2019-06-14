package by.htp.aggregation.dao;

import by.htp.aggregation.entities.Treasure;
import java.util.ArrayList;

public interface ITreasureDao {

    ArrayList<Treasure> getAllTreasures();
    Treasure getTreasuresByValue(Integer value);
    Treasure getMostExpensiveTreasure();
}
