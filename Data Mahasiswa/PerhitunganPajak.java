import java.util.Scanner;

public class PerhitunganPajak {
    public static void main (String[] args) {
        System.out.println("Perhitunagn Pajak");
        System.out.println("--------------");
        
        long penghasilan, pajak;
        
        Scanner kbd = new Scanner(System.in);
        System.out.print("Penghasilan Kena Pajak = ");
        penghasilan = kbd.nextLong();
        
        if (penghasilan > 500000000) 
        pajak = 2500000 + 15000000 + 87500000 + (penghasilan - 500000000) * 30 / 100;
        
        else 
        
        if (penghasilan > 15000000)
        pajak = 2500000 + 15000000 + (penghasilan - 15000000) * 25 / 100;
        
        else 
        
        if (penghasilan > 500000000)
        pajak = 2500000 + (penghasilan - 500000000) * 15 / 100; 
        
        else
        pajak = penghasilan * 5 / 100;
        
    System.out.println("Pajak = " + pajak);
    }
}