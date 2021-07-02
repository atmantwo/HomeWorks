public class hw2 {
    public static void main(String[] args) {
        boolean  flag = isSumBetween10And20( 8,8);
        printSignOf(2);
        isNegative(4);
        print("hellow world",8);

    }
    public static boolean isSumBetween10And20(int left, int right)
    {
        int sum = left + right;
        return 10 < sum && sum <= 20;
    }
    public static void printSignOf(int number)
    {
        if (number >= 0)
        {
            System.out.println("Число положительное!");
        }
        else
        {
            System.out.println("Число отрицательное!");
        }
    }
    public static boolean isNegative(int number)
    {
        return number < 0;
    }
    int counter = 0;

    public static void print(String message, int count)
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(message);
        }
    }


}
