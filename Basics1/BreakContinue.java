public class BreakContinue {
    public static void main(String[] args) {


        for(int i = 0; i<5; i++)
        {

            if (i==2)
            {
                System.out.println("Continue loop");
                continue;
            }
            System.out.println(i);
            System.out.println("loop is running");
        }
    }
}
