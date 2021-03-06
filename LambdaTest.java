import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Merkury","Wenus","Ziemia","Mars","Jowisz","Saturn","Uran","Neptun"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sortowanie alfabetyczne: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sortowanie wg długości: ");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000,event->
                System.out.println("Jest godzina"+ new Date()));
        t.start();

        //utrzymuje program w działaniu aż użytkownik kliknie ok
        JOptionPane.showMessageDialog(null,"Zamknąć program?");
        System.exit(0);
    }
}
