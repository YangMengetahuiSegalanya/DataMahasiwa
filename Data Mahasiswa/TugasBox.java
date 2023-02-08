import javax.swing.*;
 import javax.swing.JOptionPane;
 public class TugasBox 
{
 public static void main(String[] args) 
{
 String kalimat = JOptionPane.showInputDialog(null, "Masukkan Nama ", "Nama ", JOptionPane.QUESTION_MESSAGE);
 String bilbul = JOptionPane.showInputDialog(null,"Masukkan NIM ","NIM ", JOptionPane.QUESTION_MESSAGE);
 long bilb = Long.parseLong(bilbul);
 String phone = JOptionPane.showInputDialog(null, "Masukkan Nomor Telepon", "Nomor Telepon", JOptionPane.QUESTION_MESSAGE); 
 long pun = Long.parseLong(phone);
 String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat ", "Alamat ",JOptionPane.QUESTION_MESSAGE);
 JOptionPane.showMessageDialog(null, kalimat, "Nama ", JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, bilbul, "NIM ", JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, phone,"Nomor Telepon ", JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null, alamat, "Alamat ", JOptionPane.INFORMATION_MESSAGE);
 }
}