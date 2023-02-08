import java.util.Scanner;
public class UASPemrograman
{
 public static void main(String args[]) 
 {
  System.out.println("Matrix Calculator");
  Scanner new = new Scanner(System.in);
  System.out.printf("Masukkan jumlah baris: ");
  int baris = inp.nextInt();
  System.out.printf("Masukkan jumlah kolom: ");
  int kolom = inp.nextInt();
  int[][] matriksPertama = new int[baris][kolom];
  int[][] matriksKedua = new int[baris][kolom];
  System.out.println("Matrix 1");
  for (int i = 0; i < baris; i++) {
  for (int j = 0; j < kolom; j++) {
  System.out.printf("Masukkan nilai baris %d kolom %d: ",
  i + 1, j + 1);
  matriksPertama[i][j] = inp.nextInt();
  }
}
  System.out.println("Matrix 2");
  for (int i = 0; i < baris; i++) {
  for (int j = 0; j < kolom; j++) {
  System.out.printf("Masukkan nilai baris %d kolom %d: ",
  i + 1, j + 1);
  matriksPertama[i][j] = inp.nextInt();
  }
}
  System.out.println("Matrix 2");
  for (int i = 0; i < baris; i++) {
  for (int j = 0; j < kolom; j++) {
  System.out.printf("Masukkan nilai baris %d kolom %d: ",
  i + 1, j + 1);
  matriksKedua[i][j] = inp.nextInt();
  }
}
  System.out.println("Operasi yang dapat dilakukan");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.printf("Masukkan operasi yang ingin dilakukan: ");
  switch (inp.nextInt()) 
 {
  case 1:
  System.out.println("Hasil Penjumlahan");
  UASPemrograman.penambahanMatrix(matriksPertama, matriksKedua);
  break;

  case 2:
  System.out.println("Hasil Pengurangan");
  UASPemrograman.penguranganMatrix(matriksPertama, matriksKedua);
  break;

  case 3:
  System.out.println("Hasil Perkalian");
  UASPemrograman.perkalianMatrix(matriksPertama, matriksKedua);
  break;
  default:
  break;
  }
  System.out.println("Program Telah Selesai \n");
 }
  public static void printMatrix(int[][] matrix) {
  for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[0].length; j++) {
  System.out.printf("%d\t", matrix[i][j]);
 }
  System.out.printf("\n");
  }
}
  public static void perkalianMatrix(int[][] f, int[][] s) {
  int result[][] = new int[f.length][s[0].length];
  for (int i = 0; i < f.length; i++) {
  for (int j = 0; j < s[0].length; j++) {
  for (int k = 0; k < f[0].length; k++) {
  result[i][j] += f[i][k] * s[k][j];
  }
  }
  }
  printMatrix(result);
 }
  public static void penambahanMatrix(int[][] f, int[][] s) {
  int result[][] = new int[f.length][s[0].length];
  for (int i = 0; i < f.length; i++) {
  for (int j = 0; j < s[0].length; j++) {
  result[i][j] = f[i][j] + s[i][j];
  }
}
  printMatrix(result);
}
  public static void penguranganMatrix(int[][] f, int[][] s) {
  int result[][] = new int[f.length][s[0].length];
  for (int i = 0; i < f.length; i++) {
  for (int j = 0; j < s[0].length; j++) {
  result[i][j] = f[i][j] - s[i][j];
  }
}
  printMatrix(result);
  }
}
