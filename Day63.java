package ngoding;

public class Day63 {

    public static void main(String[] args) {
        double[][] data = {
            {73.29, 5.42, 8.21, 75.52, 89.42, 5174, 4.21, 39.84, 12.34, 56.78},
            {1.35, 7.43, 98, 57, 32, 47, 59.36, 34, 56, 40},
            {21, 8.53, 8.21, 954, 47.31, 6.25, 3.14, 1.77, 92.4, 36259.21}
        };

        //MIN
        double min = Double.MAX_VALUE;
        //MAX
        double max = Double.MIN_VALUE;
        //SUM
        double sum = 0;
        //n = banyaknya data
        int n = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print("[");
            for (int j = 0; j < data[i].length; j++) {
                if (j > 0) {
                    System.out.println("\t");
                }
                System.out.println(data[i][j]);
                //seleksi min
                if (data[i][j] < min) {
                    min = data[i][j];
                }
                //seleksi max
                if (data[i][j] > max) {
                    max = data[i][j];
                }
                //sum
                sum += data[i][j];

                //update banyaknya data
                n++;
            }
            System.out.println("]");
        }

        double average = sum / (double) n;

        System.out.println("Nilai Max = " + max);
        System.out.println("Nilai Min = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Nilai Average = " + average);
    }
}
