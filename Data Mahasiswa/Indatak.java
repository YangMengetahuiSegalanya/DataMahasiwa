/*Program Memasukkan pesan data dari keyboard 
dan menampilkan pesan dan data di layar 
dengan jendela kotak oleh Surya Agung Saputra*/
import javax.swing.JOptionPane;
public class Indatak{
public static void main(String[] args)
{
//Memasukkan data
String kalimat = JOptionPane.showInputDialog(null,"Mobidick","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
String bilbul = JOptionPane.showInputDialog(null,"12345","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
int bilb = Integer.parseInt(bilbul); 
String bilreal = JOptionPane.showInputDialog(null,"123.456","Memasukkan Data",JOptionPane.QUESTION_MESSAGE);
double bilr = Double.parseDouble(bilreal);
//Menampilkan pesan dan data
JOption.showMessageDialog(null, kalimat,"Mobidick",JOptionPane.INFORMATION_MESSAGE);
JOption.showMessageDialog(null, bilb,"12345",JOptionPane.INFORMATION_MESSAGE);
JOption.showMessageDialog(null, bilr,"123.456",JOptionPane.INFORMATION_MESSAGE); 
}
}