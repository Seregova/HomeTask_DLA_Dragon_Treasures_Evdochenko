package by.htp.aggregation.command;

public class EmptyCommand extends Command {
    @Override
    public void execute(Integer arg){
        System.out.println("Wrong command.Please try again");
    }
}