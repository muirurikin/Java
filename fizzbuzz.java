public class FizzBuzz {                      // Class declaration
  public static void main(String[] args) {   // Declaring main method()
    for(int i = 1; i <= 100; i++) {                    // count from 1 to 100
      if (((i % 5) == 0) && ((i % 7) == 0))            // A multiple of both?
        System.out.print("fizzbuzz");    
      else if ((i % 5) == 0) System.out.print("fizz"); // else a multiple of 5?
      else if ((i % 7) == 0) System.out.print("buzz"); // else a multiple of 7?
      else System.out.print(i);                        // else just print it
      System.out.print(" "); 
    }
    System.out.println();
  }
}
