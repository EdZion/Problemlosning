import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AdventofCodeday2 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("test2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Boolean> tal = new ArrayList<>();
        tal.add(in.hasNextInt());
        System.out.println(tal);
    }
}
