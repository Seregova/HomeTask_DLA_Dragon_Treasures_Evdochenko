package by.htp.aggregation.entities;


public class Treasure {
    private String title;
    private int value;

    public Treasure(String title, int value){
        this.title = title;
        this.value = value;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public String toString(){
        return "Treasure [title=" + this.title + ", value=" + this.value + "]";
    }

}

