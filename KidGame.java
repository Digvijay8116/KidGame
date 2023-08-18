import java.lang.Math;
import java.util.*;

public class KidGame
{
public static void main(String[] args)
{

int num = (int)(Math.random()*10); 
System.out.println("Enter a numeber lets start the game");

Scanner  sc = new Scanner(System.in);

int n=-1;
int temp=0;
while(n!=num){
temp++;
n = sc.nextInt();
//System.out.println(num);
if (n>num){
System.out.println("Enter a smaller number");
} 
else if (n<num){
System.out.println("Enter a larger number ");
}
else {
System.out.println("Hurray!! You won the game. You take " + temp +" attempt. "+num+" is the right answer");
}
} 

}
}