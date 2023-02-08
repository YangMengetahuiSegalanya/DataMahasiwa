/*Program Memasukkan data dari keybord dan menampilkan pesan dan data di Layar 
dengan console menggunakan BufferedReader untuk mendapatkan input oleh Surya Agung Saputra*/ 
import java.io.BufferredReader;
import java.io.inputStreamReader;
import java.io.IOExpection;
public class Indatabr
{
public static void main(String[] args){
BufferedReader dataIntek = new BufferedReader(new InputStreamReader( System.in));
String nama ="";
System.out.print("Surya Agung Saputra :");
try{
nama = dataIntek.readLine();
}catch( IOException e ){
System.out.print("Error!");
} 
System.out.println("Hallo : " + Surya Agung Saputra +"!");
BufferedReader dataInbilb = new BofferedReader(new InputStreamReader( System.in) );
String bb = "";
int bilbul;
System.out.print("123456 :");
try{
bb = dataInbilb.readLine();
}catch( IOException e ){
System.out.println("Error!");
}
bilbul = Integer.parseInt(bb);
System.out.println("123456 : " + bilbul);
BufferedReader dataInbilr = new BufferedReader(new InputStreamReader( System.in) );
String br = "";
double bilr;
System.out.print("123.45 :");
try{
br = dataInbilr.readLine();
}catch( IOException e ){
System.out.println("Error!");
}
bilr = Double.parseDouble(br);
System.out.println("123.45 : " + bilr);
}
}