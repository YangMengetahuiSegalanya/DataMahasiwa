import javax.swing.JOptionPane;
public class ContohJP {
 public static void main(String args[]) {
  /* Memasukkan data dari keyboard dengan kotak dialog
     Format method showInputDialog pada class JOptionPane   
     public static String showInputDialog(Component parentComponent, Object message, String title, int messageType)
     parentComponent : berupa komponen apa pun atau null
     message         : berupa objek tetapi string yang sering digunakan
     title           : string yang ditampilkan di bilah judul dialog dengan nilai default
                       "Input" untuk showInputDialog
                       "Message" untuk showMessageDialog
     messageType     : salah satu dari konstanta berikut :
     				 JOptionPane.ERROR_MESSAGE
     			default	 JOptionPane.INFORMATION_MESSAGE untuk showMessageDialog
     				 JOptionPane.PLAIN_MESSAGE
    				 JOptionPane.WARNING_MESSAGE
   			default	 JOptionPane.QUESTION_MESSAGE    untuk showInputDialog
  */

  String nama1 = JOptionPane.showInputDialog("Nama : ");
  int umur1    = Integer.parseInt(JOptionPane.showInputDialog("Umur : "));
  String nama2 = JOptionPane.showInputDialog(null, "Nama : ", "Masukkan Data", JOptionPane.QUESTION_MESSAGE);
  int umur2    = Integer.parseInt(JOptionPane.showInputDialog(null, "Umur : ", "Masukkan Data", JOptionPane.QUESTION_MESSAGE));

  /* Menampilkan data ke layar monitor dengan kotak dialog
     Format method showMessageDialog pada class JOptionPane   
     public static void showMessageDialog(Component parentComponent,  Object message,  String title, int messageType)
  */

  JOptionPane.showMessageDialog(null, "Nama : " + nama1);
  JOptionPane.showMessageDialog(null, "Umur : " + umur1);
  JOptionPane.showMessageDialog(null, "Nama : " + nama2,"Tampilkan Pesan", JOptionPane.INFORMATION_MESSAGE);
  JOptionPane.showMessageDialog(null, "Umur : " + umur2,"Tampilkan Pesan", JOptionPane.INFORMATION_MESSAGE);
 }
}
