import java.util.Scanner;

public class PracticeSet5 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
////
//        for (int i = 0;i<n;i++)
//        {
//            for (int j = 0;j<n-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int i = 0;
//        int sum = 0;
//        while(i < n)
//        {
//            sum = sum + 2*i;
//            i++;
//        }
//        System.out.println(sum);

//        int n = 5;
//        int result = 1;
////        for (int i = n;i>=1;i--)
////        {
////            result = result*i;
////        }
//        while (n!=1)
//        {
//            result = result*n;
//            n--;
//        }
//        System.out.println(result);


        //int n = 8;
//        int sum = 0;
//        for(int i = 1;i<=10;i++)
//        {
//            sum += i*8;
//        }
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i = 0;i<n;i++)
        {
            sum +=2*i;
//            System.out.println(2*i);
        }

        System.out.println(sum);
    }
}
