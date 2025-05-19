import java.util.HashMap;
import java.util.Scanner;
public class Main
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<Targa, Proprietario> hashmap = new HashMap<Targa, Proprietario>();
        Targa t1 = new Targa("AS54FG");
        Targa t2 = new Targa("HK23UI");
        Targa t3 = new Targa("ER87EL");
        Proprietario p1 = new Proprietario("Luca","Rossi","RHCY4563");
        Proprietario p2 = new Proprietario("Mario", "Verdi","EUCI2342");
        Proprietario p3 = new Proprietario("Anna", "Bianchi","ZPGJ9274");
        hashmap.put(t1, p1);
        hashmap.put(t2, p2);
        hashmap.put(t3, p3);
        System.out.println();
    }
}
