import java.util.Date;

public class MainClass {

    public static void main(String[] args) {
        Date d1 = new Date(1998,10,10);
        Date d2 = new Date(1993,12,07);
        User u1 = new User(001,"John","Doe","john123","!Jo12Do",d1);
        User u2 = new User(001,"Jane","Doe","jane323","123Jan12Do",d2);
        Message m1 = new Message();
        m1.setId(123);
        m1.setReceiver(u1);
        m1.setSender(u2);
        m1.setMessageDescription("Hi!! how are you!!");
        m1.setStatus("Sent");


        System.out.println("Message Details sent from '"+u1.firstName+ " "+ u1.lastName+ "' to '"+ u2.firstName+ " "+u2.lastName+ "' are given below:");
        System.out.println(m1.messageDescription);

    }
}
