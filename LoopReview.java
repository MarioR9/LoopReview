
public class LoopReview {
 public static void main(String[] args) {


     for (int i=0; i<100; i++) {
            i++;
            System.out.print(i + " ");

        }
        System.out.print("\n");



        int i= 0;
        do {
            i++;
            i++;
            System.out.print(i + " ");

        } while (i<100);
        System.out.print("\n");


                //Dimond shape stars ** 
        int y = 5;
        int n = 1;

        while (n < y + 1) {
            int spaces = 0;
            while (spaces < y - n) {
                spaces++;
                System.out.print(" ");
            }

            int j = n;
            while (j > 0) {
                j--;
                System.out.print("* ");
            }
            System.out.println();
            n++;
        }


        n = y - 1;
        while (n > 0) {
            int spaces = 0;
            while (spaces < y - n) {
                spaces++;
                System.out.print(" ");
            }
            int j = n;
            while (j > 0) {
                System.out.print("* ");
                j--;
            }
            System.out.println();
            n--;
        }

    }
}