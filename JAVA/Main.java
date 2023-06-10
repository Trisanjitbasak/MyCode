public class Main {

    private static void printRow(int length) {
        if (length == 0) {
            System.out.println();
        }
        else {
            System.out.print("* ");
            printRow(length - 1);
        }
    }

    private static void printRecursion(int row) {
        if (row <= 0) {
            return;
        }
        printRow(row);
        printRecursion(row - 1);
    }

    public static void main(String[] args) {
        printRecursion(3);
    }    
}
public class Main {
    private static int iteration = 0;

    public static void printRecursion(int row) {
        int i=1;
        printRecursion2(row,i);
    }

    private static void printRecursion2(int row,int i) {
        ++iteration;
        debug();
        if(row<=0)
        {
            return;
        }
        if(i<=row)
        {
            i++;
            printRecursion2(row,i);
            --iteration;
            debug();
        }
        System.out.println();
        i=1;
        printRecursion2(row-1,i);
        --iteration;
        debug();
    }

    private static void debug() {
        for (int i = 0; i < iteration; i++) {
            System.out.print(" ");
        }
        System.out.println("Iteration: " + iteration);
    }

    public static void main(String[] args) {
        printRecursion(3);
    }    
}


 Iteration: 1 <- called from 'printRecursion'
  Iteration: 2 <- prints first * in first row
   Iteration: 3 <- prints second * in first row
    Iteration: 4 <- prints third * in first row

     Iteration: 5 <- 'row' decremented ('row' == 2), 'i' reset to 1
      Iteration: 6 <- prints first * in second row
       Iteration: 7 <- prints second * in second row

        Iteration: 8 <- 'row' decremented ('row' == 1), 'i' reset to 1
         Iteration: 9 <- prints first * in third row

          Iteration: 10 <- 'row' decremented ('row' == 0 so no more recursive calls), 'i' reset to 1
         Iteration: 9 <- return from recursive call
        Iteration: 8 <- return from recursive call

         Iteration: 9 <- 'row' decremented, 'i' reset to 1
        Iteration: 8

         Iteration: 9
        Iteration: 8
       Iteration: 7
      Iteration: 6

       Iteration: 7
        Iteration: 8

         Iteration: 9
        Iteration: 8
       Iteration: 7

        Iteration: 8
       Iteration: 7
      Iteration: 6
     Iteration: 5

      Iteration: 6
       Iteration: 7

        Iteration: 8
       Iteration: 7
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5
    Iteration: 4
   Iteration: 3

    Iteration: 4
     Iteration: 5
      Iteration: 6

       Iteration: 7
        Iteration: 8

         Iteration: 9
        Iteration: 8
       Iteration: 7

        Iteration: 8
       Iteration: 7
      Iteration: 6
     Iteration: 5

      Iteration: 6
       Iteration: 7

        Iteration: 8
       Iteration: 7
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5
    Iteration: 4

     Iteration: 5
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5

      Iteration: 6
     Iteration: 5
    Iteration: 4
   Iteration: 3
  Iteration: 2

   Iteration: 3
    Iteration: 4
     Iteration: 5

      Iteration: 6
       Iteration: 7

        Iteration: 8
       Iteration: 7
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5
    Iteration: 4

     Iteration: 5
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5

      Iteration: 6
     Iteration: 5
    Iteration: 4
   Iteration: 3

    Iteration: 4
     Iteration: 5

      Iteration: 6
     Iteration: 5
    Iteration: 4

     Iteration: 5
    Iteration: 4
   Iteration: 3
  Iteration: 2
 Iteration: 1

  Iteration: 2
   Iteration: 3
    Iteration: 4

     Iteration: 5
      Iteration: 6

       Iteration: 7
      Iteration: 6
     Iteration: 5

      Iteration: 6
     Iteration: 5
    Iteration: 4
   Iteration: 3

    Iteration: 4
     Iteration: 5

      Iteration: 6
     Iteration: 5
    Iteration: 4

     Iteration: 5
    Iteration: 4
   Iteration: 3
  Iteration: 2

   Iteration: 3
    Iteration: 4

     Iteration: 5
    Iteration: 4
   Iteration: 3

    Iteration: 4
   Iteration: 3
  Iteration: 2
 Iteration: 1


private static void debug(int row, int i) {
    for (int j = 0; j < iteration; j++) {
        System.out.print(" ");
    }
    System.out.printf("Iteration %d: row = %d , i = %d%n", iteration, row, i);
}


 Iteration 1: row = 3 , i = 1
  Iteration 2: row = 3 , i = 2
   Iteration 3: row = 3 , i = 3
    Iteration 4: row = 3 , i = 4

     Iteration 5: row = 2 , i = 1
      Iteration 6: row = 2 , i = 2
       Iteration 7: row = 2 , i = 3

        Iteration 8: row = 1 , i = 1
         Iteration 9: row = 1 , i = 2

          Iteration 10: row = 0 , i = 1
         Iteration 9: row = 1 , i = 1
        Iteration 8: row = 1 , i = 2

         Iteration 9: row = 0 , i = 1
        Iteration 8: row = 1 , i = 1
       Iteration 7: row = 2 , i = 1
      Iteration 6: row = 2 , i = 3

       Iteration 7: row = 1 , i = 1
        Iteration 8: row = 1 , i = 2

         Iteration 9: row = 0 , i = 1
        Iteration 8: row = 1 , i = 1
       Iteration 7: row = 1 , i = 2

        Iteration 8: row = 0 , i = 1
       Iteration 7: row = 1 , i = 1
      Iteration 6: row = 2 , i = 1
     Iteration 5: row = 2 , i = 2

      Iteration 6: row = 1 , i = 1
       Iteration 7: row = 1 , i = 2

        Iteration 8: row = 0 , i = 1
       Iteration 7: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 2 , i = 1
    Iteration 4: row = 3 , i = 1
   Iteration 3: row = 3 , i = 4

    Iteration 4: row = 2 , i = 1
     Iteration 5: row = 2 , i = 2
      Iteration 6: row = 2 , i = 3

       Iteration 7: row = 1 , i = 1
        Iteration 8: row = 1 , i = 2

         Iteration 9: row = 0 , i = 1
        Iteration 8: row = 1 , i = 1
       Iteration 7: row = 1 , i = 2

        Iteration 8: row = 0 , i = 1
       Iteration 7: row = 1 , i = 1
      Iteration 6: row = 2 , i = 1
     Iteration 5: row = 2 , i = 3

      Iteration 6: row = 1 , i = 1
       Iteration 7: row = 1 , i = 2

        Iteration 8: row = 0 , i = 1
       Iteration 7: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 2 , i = 1
    Iteration 4: row = 2 , i = 2

     Iteration 5: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 1 , i = 2

      Iteration 6: row = 0 , i = 1
     Iteration 5: row = 1 , i = 1
    Iteration 4: row = 2 , i = 1
   Iteration 3: row = 3 , i = 1
  Iteration 2: row = 3 , i = 3

   Iteration 3: row = 2 , i = 1
    Iteration 4: row = 2 , i = 2
     Iteration 5: row = 2 , i = 3

      Iteration 6: row = 1 , i = 1
       Iteration 7: row = 1 , i = 2

        Iteration 8: row = 0 , i = 1
       Iteration 7: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 2 , i = 1
    Iteration 4: row = 2 , i = 3

     Iteration 5: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 1 , i = 2

      Iteration 6: row = 0 , i = 1
     Iteration 5: row = 1 , i = 1
    Iteration 4: row = 2 , i = 1
   Iteration 3: row = 2 , i = 2

    Iteration 4: row = 1 , i = 1
     Iteration 5: row = 1 , i = 2

      Iteration 6: row = 0 , i = 1
     Iteration 5: row = 1 , i = 1
    Iteration 4: row = 1 , i = 2

     Iteration 5: row = 0 , i = 1
    Iteration 4: row = 1 , i = 1
   Iteration 3: row = 2 , i = 1
  Iteration 2: row = 3 , i = 1
 Iteration 1: row = 3 , i = 2

  Iteration 2: row = 2 , i = 1
   Iteration 3: row = 2 , i = 2
    Iteration 4: row = 2 , i = 3

     Iteration 5: row = 1 , i = 1
      Iteration 6: row = 1 , i = 2

       Iteration 7: row = 0 , i = 1
      Iteration 6: row = 1 , i = 1
     Iteration 5: row = 1 , i = 2

      Iteration 6: row = 0 , i = 1
     Iteration 5: row = 1 , i = 1
    Iteration 4: row = 2 , i = 1
   Iteration 3: row = 2 , i = 3

    Iteration 4: row = 1 , i = 1
     Iteration 5: row = 1 , i = 2

      Iteration 6: row = 0 , i = 1
     Iteration 5: row = 1 , i = 1
    Iteration 4: row = 1 , i = 2

     Iteration 5: row = 0 , i = 1
    Iteration 4: row = 1 , i = 1
   Iteration 3: row = 2 , i = 1
  Iteration 2: row = 2 , i = 2

   Iteration 3: row = 1 , i = 1
    Iteration 4: row = 1 , i = 2

     Iteration 5: row = 0 , i = 1
    Iteration 4: row = 1 , i = 1
   Iteration 3: row = 1 , i = 2

    Iteration 4: row = 0 , i = 1
   Iteration 3: row = 1 , i = 1
  Iteration 2: row = 2 , i = 1
 Iteration 1: row = 3 , i = 1


