import java.util.Scanner;


public class PracticeSet4 {
    public static void main(String[] args) {

//        int a = 10;
//        if(a=11)
//        {
//            System.out.println("i am 11");
//        }
//        else
//        {
//            System.out.println("i am not 11");
//        }

//        Scanner sc = new Scanner(System.in);
//
//        byte s1 = sc.nextByte();
//        byte s2 = sc.nextByte();
//        byte s3 = sc.nextByte();
//
//        float percent = (s1+s2+s3)/3.0f;
//        if(percent>= 40 && s1 >=33 && s2 >= 33 && s3>=33)
//        {
//            System.out.println("Pass!!");
//        }
//        else
//        {
//            System.out.println("Fail!");
//        }


//        if (s1<33)
//        {
//            System.out.println("Fail!s1");
//        }
//        else if(s2<33)
//        {
//            System.out.println("Fail!s2");
//        }
//        else if (s3<33)
//        {
//            System.out.println("Fail!s3");
//        }
//        else if(percent<40)
//        {
//            System.out.println("Fail!40");
//        }
//        else {
//            System.out.println("Pass");
//        }

//        Scanner sc = new Scanner(System.in);
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax+0;
//        }
//        else if(income>2.5f && income<=5f)
//        {
//            tax = tax + (income - 2.5f)*0.05f;
//        }
//        else if(income>5f && income<=10f)
//        {
//            tax = tax + (2.5f)*0.05f;
//            tax = tax + (income - 5f)*0.2f;
//        }
//        else if (income>10f)
//        {
//            tax = tax + (2.5f)*0.05f;
//            tax = tax + (5f)*0.2f;
//            tax = tax + (income - 10f)*0.3f;
//        }
//        else {
//            tax = 0;
//        }
//        System.out.println(tax);



//        Scanner sc = new Scanner(System.in);
//
//        byte day = sc.nextByte();
//
//
//        switch(day){
//
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//        }


//        Scanner sc = new Scanner(System.in);
//
//        String web = sc.next();
//
//        if(web.contains(".com")){
//            System.out.println("Commercial Website");
//        }
//        else if(web.contains(".org")){
//            System.out.println("Organizational Website");
//        }
//        else if(web.contains(".in")){
//            System.out.println("Indian Website");
//        }

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4==0)
        {
            if(year%100 == 0)
            {
                if(year%400==0)
                {
                    System.out.println(year + "leap year");
                }
                else
                {
                    System.out.println(year + "not leap year");
                }
            }
            else
            {
                System.out.println(year + "leap year");
            }
        }
        else {
            System.out.println(year + "not leap year");
        }


    }
}
