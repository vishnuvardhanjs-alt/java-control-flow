import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number to check POSITIVE or NEGATIVE : ");
        int num = obj.nextInt();
        if (num==0){
            System.out.println("ZERO");
        }else if(num>0){
            System.out.println("POSITIVE");
        }else{
            System.out.println("NEGATIVE");
        }

        System.out.print("Enter Number to get the week : ");
        num = obj.nextInt();

        switch (num) {
          case 1:
            System.out.println("Sunday");
            break;
          case 2:
            System.out.println("Monday");
            break;
          case 3:
            System.out.println("Tuesday");
            break;
          case 4:
            System.out.println("Wednesday");
            break;
          case 5:
            System.out.println("Thursday");
            break;
          case 6:
            System.out.println("Friday");
            break;
          case 7:
            System.out.println("Saturday");
            break;
          default:
            System.out.println("Not a valid number between 1-7!...");
            break; 
        }

        System.out.print("Enter Range: ");
        num = obj.nextInt();
        System.out.println("Increasing loop");
        for (int i = 1; i <=num; i++) {
          System.out.print(i+" ");
        }
        System.out.println("\nDecreasing loop");
        while (num>0) {
          System.out.print(num+" ");
          num--;
        }
        System.out.println("\n");

        int start = 1;

        do {
          System.out.println(start);
          start++;
          
        } while (start<=3);




    }
}
