package by.htp.aggregation.dao;

import by.htp.aggregation.entities.Treasure;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

    public class TreasureDao implements ITreasureDao {
    //Singleton
      private static TreasureDao treasureDao;
      private TreasureDao(){
      }
      public static TreasureDao getInstance(){
        if (treasureDao==null){
            treasureDao = new TreasureDao();
        }
        return treasureDao;
      }


    @Override
    public ArrayList<Treasure> getAllTreasures() {
        return readAllTreasures();
    }

    @Override
    public Treasure getTreasuresByValue(Integer value) {
        Treasure t = null;
        ArrayList<Treasure> list = readAllTreasures();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == value) {
                t = list.get(i);
                break;
            }
        }

        return t;
    }

    @Override
    public Treasure getMostExpensiveTreasure() {
        ArrayList<Treasure> list = readAllTreasures();
        Treasure t = null;
        int maxValue = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() >= maxValue) {
                t = list.get(i);
                maxValue = list.get(i).getValue();
            }
        }
        return t;
    }

    private ArrayList<Treasure> readAllTreasures(){
        ArrayList<Treasure> list = new ArrayList<Treasure>();
        InputStream inputStream = TreasureDao.class.getClassLoader().getResourceAsStream("treasures.txt");
        try{
            BufferedReader br = null;
            br = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = br.readLine()) != null) {
                //System.out.println("Line entered : " + line);
                String[] splittedLine = line.split(",");
                Treasure t = new Treasure(splittedLine[0], Integer.parseInt(splittedLine[1]));
                list.add(t);
            }
        } catch (Exception exception) {
            System.out.println("exception");
        }

        return list;
    }
}