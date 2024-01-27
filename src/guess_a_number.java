import java.util.Scanner;

public class guess_a_number {



        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int chances=8;
            int finals=0;
            boolean playgame=true;
            System.out.println("Welcome Buddy!");
            System.out.println("Hey Buddy you have about"+ chances+"to win a game");
            while(playgame){
                int rand=getrandN(1,100);
                boolean guess=false;
                for(int i=0;i<chances;i++){
                    System.out.println("chance"+" "+ (i+1) +"Enter your guess");
                    int user=sc.nextInt();
                    if(user==rand){
                        guess=true;
                        finals+=1;
                        System.out.println("you won it.");
                        break;
                    }
                    else if(user>rand){
                        System.out.println("too high");

                    }
                    else{
                        System.out.println("too low");
                    }
                }
                if(guess==false){
                    System.out.println("sorry buddy you lost chance. The number is"+rand);
                }
                System.out.println("play again(y/n)");
                String pA=sc.next();
                playgame=pA.equalsIgnoreCase("y");
            }
            System.out.println("This is it buddy hope you enjoy");
            System.out.println("here is your score"+"" +finals);
        }

        private static int getrandN(int min, int max) {
            return (int)(Math.random() *(max-min+1)+min);
        }
    }

