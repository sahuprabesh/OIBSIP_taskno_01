import java.util.Scanner;
 class number_guess
{
    public static void main(String args[]) 
    {
        char ch;
        do
        {
        int guess= 0,score=0;
        int limit=5;
        int secret_n= (int) (Math.random()*100);           
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nGuess A Number To play The Game\nBest of luck for your guessing");
            secret_n= (int) (Math.random()*100);
            System.out.print("Enter a guess number between 1 to 100\n");
            for(int i=1;i<=limit;i++)
            {
                guess=sc.nextInt();
                if (guess == secret_n)
                {   
                    System.out.println("Great!, Your Number is same. You Win the Game!");
                    break;
                }
                else if (guess < secret_n)
                {
                    System.out.println("Your Guess Number is Small");
                }
                else if (guess > secret_n)
                {
                    System.out.println("Your Guess Number is great");
                }
                    
                    else {
                        System.out.println("Enter a Valid Integer Number between 1 to 100");
                        break;
                    }
                if(i==limit)
                    System.out.println("oops you have missed last chance"+secret_n);
            }
            System.out.println("do u want to continue(Y/N)");
        ch=sc.next().charAt(0);
    }while(ch =='y'|| ch =='Y');
    }
}