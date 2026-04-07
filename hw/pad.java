class Pradrome
{
public static void main(String[] args)
{

 int a =909;
 int b= a%10;
 int c= a/10;
int d=c%10;
int e=c/10;

int f=b*100+d*10+e*1;
Boolean  result= a==f;
System.out.println("the given number is :" +a+ "the answer is "+f+ "the resut is "+result);


}




}