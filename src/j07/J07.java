
package j07;
import java.util.Scanner;
public class J07 {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    public static void main(String[] args) {
        String identitas = "Saddam Raihan Ramadhan / XR2 / 30";
        
        tampilJudul(identitas);
    }
    
}
