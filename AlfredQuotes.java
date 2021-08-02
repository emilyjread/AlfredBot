import java.util.Date;

public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello lovely, how are you?";
    }

    public String guestGreeting(String name, String dayPeriod){
        return String.format("Hello %s, I hope you are having a lovely %s", name, dayPeriod);
    }
    public String dateAnnouncement(){
        Date date = new Date();
        return String.format("Today is %s", date);
    }
    public String respondbeforeAlexis(String conversation){
        return conversation;
    }

    public String yell(String expression, String problem){
        return expression+problem;
    }
}