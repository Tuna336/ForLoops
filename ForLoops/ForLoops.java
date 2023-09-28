public class ForLoops
{

    public void run() {
        int i = 0;
        int j = 10;
        int k = 10;
        for (i = 0; i >=15; i++) {
            System.out.println("i is equal to"+i);
        }
        for (j = 10; j >= 0; j -= 2) {
            System.out.println("j is equal to"+j);
        }
        for (k = 10; k != 0; k -= 3)  {
            System.out.println("k is equal to"+k);
        }
    }

        public static void main(String[] args)
        {
        ForLoops hw = new ForLoops();
        hw.run();
    }
}