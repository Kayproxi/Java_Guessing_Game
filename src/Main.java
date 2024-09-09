
        import java.util.*;
        public class Main {
            public static void main(String[] args) {

                System.out.println("Guess the number");

                final int Maxi = 10;
                int guess, answer;

                Scanner scan = new Scanner(System.in);
                Random generator = new Random();
                answer = generator.nextInt(Maxi) + 1;

                guess = scan.nextInt();

                if (guess == answer){
                    System.out.println(guess + "=" + answer + "!!! you guessed right" );
                }else{
                    System.out.println("You failed, try again");
                }
            }
        }