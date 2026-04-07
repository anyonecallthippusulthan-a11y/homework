class Armstorng
{
public static void main(String[] args)
{
int a=4560;
int b=a%10;
int c=a/10;
int d=b%10;
int e=b/10;
int f=e%10;
int g=e/10;
int h=((c*c*c*c)+(d*d*d*d)+
(f*f*f*f)+(g*g*g*g));
Boolean q = a==h;
System.out.println("the given number is :" +a+ "the answer is "+h+ "the resut is "+q);
}}