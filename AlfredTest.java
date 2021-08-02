public class AlfredTest{
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();
        // String testGreeting = alfredBot.basicGreeting();
        // String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        // String testDateAnnouncement = alfredBot.dateAnnouncement();
        //  String alexisTest = alfredBot.respondbeforeAlexis(
        //     "Alexis! Play some lo-fi beats");
        String alfredtest = alfredBot.respondbeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is."
        );

        System.out.println(alfredtest);
    }
}