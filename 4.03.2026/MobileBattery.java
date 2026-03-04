class MobileBattery
{
public static void main(String[] args)
{
int charge=50;
if ((charge>=80)&&(charge<=100))
{
 System.out.println("your chargeis full");
 }
else if((charge>=30)&&(charge<=79))
{
  System.out.println("your charge  is Normal");
} 
else if((charge>=15)&&(charge<=29))
{
  System.out.println("your charge  is low battery ");
  
} 
else if((charge>=1)&&(charge<=14))
{
  System.out.println("your charge  is very low charge now ");
} 
else{
System.out.println("your mobile is dead ");
}
}
}

