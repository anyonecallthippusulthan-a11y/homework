import java.util.Scanner;
class Spotify
{ 
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("*****\t SPOTIFY WELCOMES YOU*****");
	   System.out.println("1.A.R RAHMAN");
	   System.out.println("2. ANIRUDH");
	   System.out.println("3. HARISH JEYARAJ");
	   System.out.println("4.ILLAIYARAJA");
       System.out.println("5.U1");
	   System.out.print("SELECT YOUR PLAYLIST");
	   int song=s.nextInt();
	   if(song==1)
	   { 
          System.out.println("YOU HAVE SELECT THE <<<<A.R RAHMAN SONG PLAYLIST>>>");
		  System.out.println("1.Melody song");
		  System.out.println("2.kuthu song");
		  System.out.println("3.Motivational song");
		  System.out.println("4. Sad song");
		  System.out.print("SELECT YOUR EMOTION PLAYLIST");
	      int play=s.nextInt();
		  if(play==1)
		  {
                System.out.println("YOU HAVE SELECT ....THE MELODY SONG..."	);		  
                 System.out.println("1.NETRU ILLADHA MATRAM");
				 System.out.println("2.ENNA SOLLA POGIRAI");
				 System.out.println("3. ENNALE ADI ENNAVALE");
				 System.out.println("4. MALARGALE MALARGALE");
				 int one=s.nextInt();
				 if(one==1)
				 {
					 
					 System.out.println(" You have select ////NETRU ILLADHA MATRAM\\\\");
				 }
                 else if(one==2)
				 {
                    System.out. println("You have select ////ENNA SOLLA POGIRAI\\\\");
				 }					
		         else if(one==3)
				 {
                     System.out. println("You have select ////ENNALE ADI ENNAVALE////");
				 }
                 else 
				 {
					 System.out. println("You have select ////MALARGALE MALARGALE////"); 
				 }
		  }
             else if(play==2)
			 {
				 System.out.println("YOU HAVE SELECT ....THE KUTHU SONG..."	);		  
                 System.out.println("1.Thaiya Thaiya");
				 System.out.println("2.Mukkala Mukkabala");
				 System.out.println("3. Urvashi Urvashi");
				 System.out.println("4. Aathichudi");
				 int one=s.nextInt();
				 if(one==1)
				 {
					 
					 System.out.println(" You have select ////Thaiya Thaiya\\\\");
				 }
                 else if(one==2)
				 {
                    System.out. println("You have select ////Mukkala Mukkabala\\\\");
				 }					
		         else if(one==3)
				 {
                     System.out. println("You have select //// Urvashi Urvashi////");
				 }
                 else 
				 {
					 System.out. println("You have select //// Aathichudi////"); 
				 }
			 }
             else if(play==3)
			 {
				 System.out.println("YOU HAVE SELECT ....THE MOTIVATION SONG..."	);		  
                 System.out.println("1.Vande Mataram");
				 System.out.println("2. Oruvan Oruvan mudhalli");
				 System.out.println("3. Shakthi kodu");
				 System.out.println("4. Kappal Yeari Poyachu");
				 int one=s.nextInt();
				 if(one==1)
				 {
					 
					 System.out.println(" You have select ////Vande Mataram\\\\");
				 }
                 else if(one==2)
				 {
                    System.out. println("You have select //// Oruvan Oruvan mudhalli\\\\");
				 }					
		         else if(one==3)
				 {
                     System.out. println("You have select //// Shakthi kodu////");
				 }
                 else 
				 {
					 System.out. println("You have select //// Kappal Yeari Poyachu////"); 
				 }
             }
			 else if(play==4)
			 {
				 
                 System.out.println("YOU HAVE SELECT ....THE SAD SONG..."	);		  
                 System.out.println("1.Poongatrile");
				 System.out.println("2. Marudaani");
				 System.out.println("3. Minnalea En vazhvin");
				 System.out.println("4. Rasathi");
				 System.out.println("5.  Oru poiyavathu Sol");
				 int one=s.nextInt();
				 if(one==1)
				 {
					 
					 System.out.println(" You have select ////Poongatrile\\\\");
				 }
                 else if(one==2)
				 {
                    System.out. println("You have select //// Marudaani\\\\");
				 }					
		         else if(one==3)
				 {
                     System.out. println("You have select ////Minnalea En vazhvin ////");
				 }
                 else if(one==4) 
				 {
					 System.out. println("You have select ////Rasathi////"); 
				 }
				 else 
				 {
					 System.out.println("Oru poiyavathu Sol");
             }
			 }
		}
		 else if(song==2)
		 {
			 System.out.println("YOU HAVE SELECT THE <<<<ANIRUDH  SONG PLAYLIST>>>");
		  System.out.println("1.Melody song");
		  System.out.println("2.kuthu song");
		  System.out.println("3.Motivational song");
		  System.out.println("4. Sad song");
		  System.out.print("SELECT YOUR EMOTION PLAYLIST");
	      int play=s.nextInt();
		  if(play==1)
		  {
                System.out.println("YOU HAVE SELECT ....THE MELODY SONG..."	);		  
                 System.out.println("1.Neeyum Nanum Anbe");
				 System.out.println("2.Velicha Poove");
				 System.out.println("3. Po Indru Neeyaga");
				 System.out.println("4. Nee partha vizhiga");
		  }
		  else if(play==2)
		  {
			  System.out.println("YOU HAVE SELECT ....THE KUTHU SONG..."	);		  
                 System.out.println("VaathiRaid");
	             System.out.println("2.Naa Ready");
				 System.out.println("3.Badass ");
				 System.out.println("4.Vandha Edam ");
		  }
		  else if(play==3)
		  {
		         System.out.println("YOU HAVE SELECT ....THE MOTIVATION SONG..."	);		  
                 System.out.println("Velai Illa pattathari");
	             System.out.println("2.Boomi Enna Suthudhe");
				 System.out.println("3.EthirNeechal ");
				 System.out.println("4.Surviva");
		  }
		  
		  
			  else if(play==4)
		  {
			  /*Porkanda Singam
• Kanave Kanave
• KannaanaKanne
• JodiNilave*/	
                 System.out.println("YOU HAVE SELECT ....THE Sad SONG..."	);		  
                 System.out.println("Porkanda Singam");
	             System.out.println("2.Kanave Kanave");
				 System.out.println("3.KannaanaKanne ");
				 System.out.println("4.Jodi Nilave");
		  }
		  else 
		  {
			  System.out.println("next rest tu");
		  }
		 }
		 else if(song==3)
		{
			 System.out.println("YOU HAVE SELECT THE <<<<HARISH JEYARAJ  SONG PLAYLIST>>>");
		  System.out.println("1.Melody song");
		  System.out.println("2.kuthu song");
		  System.out.println("4. Sad song");
		  System.out.print("SELECT YOUR EMOTION PLAYLIST");
	      int play=s.nextInt();
		  if(play==1)
		  {
                System.out.println("YOU HAVE SELECT ....THE MELODY SONG..."	);		  
                 System.out.println("1.Unnale");
				 System.out.println("2.Annul Maele");
				 System.out.println("3. Yedho Ondru");
				 System.out.println("4. Vaseegara");
				 System.out.println("5.Paartha Mudhal");
		  }
		  else if(play==2)
		  {
			  System.out.println("YOU HAVE SELECT ....THE KUTHU SONG..."	);		  
                 System.out.println("1.Tirunelveli Halwa Da");
	             System.out.println("2.Aradikatre");
				 System.out.println("3.Soda Bottle ");
				 System.out.println("4. Aruva Meesai ");
		  }
		  else if(play==3)
		  {
		         System.out.println("YOU HAVE SELECT ....THE sad SONG..."	);		  
                 System.out.println("1.Venmathiye");
	             System.out.println("2.Ohmaname");
				 System.out.println("3.Yamma Yamma ");
				 System.out.println("4.Othayile");
		  }
		  
		  else 
		  {
			  System.out.println("next rest tu");
		  }
		 }
		 else if(song==4)
		{
			 System.out.println("YOU HAVE SELECT THE <<<<ILLAIYARAJA  SONG PLAYLIST>>>");
		  System.out.println("1.Melody song");
		  System.out.println("2.kuthu song");
		  System.out.println("4. Sad song");
		  System.out.print("SELECT YOUR EMOTION PLAYLIST");
	      int play=s.nextInt();
		  if(play==1)
		  {
                System.out.println("YOU HAVE SELECT ....THE MELODY SONG..."	);		  
                 System.out.println("1.Oru kili uruguthu");
				 System.out.println("2.Kuzhaloodhum kannanukku");
				 System.out.println("3.Ennai thottu");
				 System.out.println("4. Raja Raja cholan");
				 
				 }
		  else if(play==2)
		  {
			  System.out.println("YOU HAVE SELECT ....THE KUTHU SONG..."	);		  
                 System.out.println("1.Ooruvittu ooruvanthu");
	             System.out.println("2.Nooru varusham");
				 System.out.println("3.Aasai Nooruvagai ");
				 System.out.println("4. Aasai Athigam vachu ");
		  }
		  else if(play==3)
		  {
		         System.out.println("YOU HAVE SELECT ....THE sad SONG..."	);		  
                 System.out.println("1.Kanne Kalaimane");
	             System.out.println("2.Thene thenpaandi Neeye");
				 System.out.println("3.Paadi Parantha Killi");
				 System.out.println("4.Nilave Va");
		  }
		  
		  else 
		  {
			  System.out.println("next rest tu");
		  }
		 }
		 else if(song==5)
			 
		 {
			 System.out.println("YOU HAVE SELECT THE <<<<U1  SONG PLAYLIST>>>");
		  System.out.println("1.Melody song");
		  System.out.println("2.kuthu song");
		  System.out.println("3.Motivational song");
		  System.out.println("4. Sad song");
		  System.out.print("SELECT YOUR EMOTION PLAYLIST");
	      int play=s.nextInt();
		  if(play==1)
		  {
                System.out.println("YOU HAVE SELECT ....THE MELODY SONG..."	);		  
                 System.out.println("1. AathadiManasudhan");
				 System.out.println("2. Chinna sirisu");
				 System.out.println("3.  Venmeggam");
				 System.out.println("4.  Iayyayyo");
		  }
		  else if(play==2)
		  {
			  System.out.println("YOU HAVE SELECT ....THE KUTHU SONG..."	);		  
                 System.out.println("1.Machi open the bottle");
	             System.out.println("2.Saroja saman nikalo");
				 System.out.println("3.No money no honey ");
				 System.out.println("4.Villaiyadu mankatha ");
		  }
		  else if(play==3)
		  {
		         System.out.println("YOU HAVE SELECT ....THE MOTIVATION SONG..."	);		  
                 System.out.println("1.Edhirthu Nill");
	             System.out.println("2.Boomi Enna Suthudhe");
				 System.out.println("3.Oru nalil ");
				 System.out.println("4.Nimirnthu NIL");
				 System.out.println("4.Ungakkule Mirugam");
		  }
		  
		  
			  else if(play==4)
		  {
			  
                 System.out.println("YOU HAVE SELECT ....THE Sad SONG..."	);		  
                 System.out.println("1.Kadhal valarthen");
	             System.out.println("2.Yedho ondru ennai");
				 System.out.println("3.Pogadhe ");
				 System.out.println("4.Ninaithu ninaithu");
		  }
		  else 
		  {
			  System.out.println("next rest tu");
		  }
		 }
	   }
   
}
		 
		 
		  