public class TantanganDua {
    public static void main(String[] args) {
        int[] nilai = new int[10];
        int max,min;
        int i;
        for (i = 0; i<10; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: "+bilangan);
        }

        for (i=0; i<10; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);        
    }
}