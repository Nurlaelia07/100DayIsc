package ngoding;

public class Day3 {
    public static void main(String[] args) {        
         
        String strNumber = "754.3";
        // Menampilkan Nilai String sebelum di konversi
        System.out.println("Nilai String : " +strNumber);
        try {
            System.out.println("======== Konversi String ke Tipe Data Primitif ========");
            // Konversi dari string ke double
            double doubleValue = Double.parseDouble(strNumber);
            System.out.println("Hasil konversi dari String ke double: " + doubleValue);

            // Konversi double ke int (menghilangkan desimal)
            int intNumber = (int) doubleValue;
            System.out.println("Hasil konversi dari double ke int: " + intNumber);
            
            // Konversi ke float (jika diperlukan)
            float floatValue = (float) doubleValue;
            System.out.println("Hasil konversi dari int ke float: " + floatValue);

            // Konversi ke long (jika diperlukan)
            long longValue = (long) doubleValue;
            System.out.println("Hasil konversi dari int ke long: " + longValue);

        } catch (NumberFormatException e) {
            System.out.println("Ada kesalahan dalam konversi String ke double.");
        }
        System.out.println("======== Konversi Tipe Data Primitif (int) ke String ========");
        // Konversi Tipe Data Primitif (int) ke String
        int intNumber = 754;
        String strIntNumber = String.valueOf(intNumber);
        System.out.println("Hasil konversi dari int ke String : " + strIntNumber);
    }
}
