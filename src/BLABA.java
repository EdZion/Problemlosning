import java.io.*;
import java.util.*;

public class BLABA {
    public static void main(String[] args) {
        Scanner in = null;
        try {
                in = new Scanner(new File("test.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int bransle = 0;
            int totalbransle = 0;
            int fuel =0 ;
            while (in.hasNext()){
                bransle = in.nextInt();
                bransle = (bransle/3) -2;
                fuel = (bransle + fuel);
            while (fuel > 0){
                fuel = (bransle/3)-2;
                totalbransle = (bransle+fuel+totalbransle);
                }
            }

            System.out.println(totalbransle);
        }
    }
