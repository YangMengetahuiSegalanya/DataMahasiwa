//Latihan 6e. Program switch case
import javax.swing.JOptionPane;
class SwitchBuah{
public static void main (String Args[]){
String Pilih;
int PILIH;
Pilih = JOptionPane.showInputDialog("----MENU BUAH----\n\n1. APEL \n2. MANGGA\n3. JERUK\n\nPilihan Anda [1-3] : ");
PILIH = Integer.parseInt(Pilih);
switch(PILIH){
case 1 : System.out.print("\n \nANDA PILIH APEL "); break;
case 2 : System.out.print("\n \nANDA PILIH MANGGA "); break;
case 3 : System.out.print("\n \nANDA PILIH JERUK "); break;
default : System.out.print("\n \nANDA SALAH INPUT... ");
}
}
}