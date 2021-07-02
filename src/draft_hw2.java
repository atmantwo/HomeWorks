public class draft_hw2 {
    public static void main(String[] args) {
        int P = countP(  4,  4, 5, 5);
        System.out.println(P);
        int x = 1;
        int y = 2;
        boolean flag = compareNumbers( x, y);
        System.out.println(flag);
        printMassage(5, "Hello World");
        System.out.println( "Hello World");
        printNumber(0);
    }
    public static int countP(int a, int b, int c, int d) {


        return (a + b + c + d);
    }
    public static boolean compareNumbers(int a, int b) {

        return (a < b);

    }
    public static void printMassage(int count, String message) {
        // тут будет цикл
        // неопр. цикл
        // while (условие) {
        // тело_цикла_из_набора_операторов;
        //}
       int counter = 0;
        // while (counter < count) {
          //  System.out.println(message);
            // counter++;
       // }
        //опред.цикл
        // for (инициализация; условие/проверока; изменение) {
        // тело_цикла_из_набора_операторов;
        // }
       // for ( int i = 0; i < count; i++){
         //   System.out.println(message);
      //  }
        counter = 0;
        do {
            System.out.println(message);
            counter++;
            if (counter == 3);
            break;
        }
        while (counter < count);


    }
   public static void printNumber(int number) {
      // if ( number == 0) {
       //     System.out.println("Это ноль!");
       //
       // }
       //else if ( number == 1) {
       //  System.out.println("Это еденица");
       //}
       //else if ( number == 2) {
       //  System.out.println("Это двойка!");
       // }
       //else {
       //  System.out.println("Это какое то другое число");
       //}
        switch (number){
            case 0:
                System.out.println("Это ноль!");
                break;
            case 1:
                System.out.println("Это единица!");
                break;
            case 2:
                System.out.println("Это двойка!");
                break;
            default:
                System.out.println("Это какое то другое число");
        }

    }


}
