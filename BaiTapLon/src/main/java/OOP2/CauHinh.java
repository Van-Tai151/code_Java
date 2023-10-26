
package OOP2;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CauHinh {
    public static final Scanner sc = new Scanner(System.in);
    public static final SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public static void vietTiep(){
        sc.nextLine();
    } 
    public static String format(String id) {
        return id.replaceAll("[\\s+,;.+^%<>`]", "").trim().toUpperCase();
    }
}