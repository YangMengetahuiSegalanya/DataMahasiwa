import java.io.FileReader;
import java.io.BufferedReader;

class TantanganDelapanBelas {
  public static void main(String[] args) {

    char[] array = new char[100000];

    try {
      FileReader file = new FileReader("survei.txt");
	  
      BufferedReader input = new BufferedReader(file);

      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);

      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}