import java.util.Scanner;
class WorldBook
{
	public static void main(String[] args)
	{
		Scanner w=new Scanner(System.in);                         
		System.out.println("/t****THE WORLD OF KNOWLEDGE****");
		System.out.println("/tWE WELCOMES YOU");
		System.out.println("/t 1.FICTION");
		System.out.println("/t 2. FANTASY");
		System.out.println("/t 3. BUSINESS");
		System.out.println("/t 4.PSYCHOLOGY");
		System.out.println("/t SELECT YOUR OPTIONS");
		int option=w.nextInt();
		System.out.println("-------------------------------------------------------------------------------");
		if(option==1)
		{
			System.out.println("/tThe Options are:");
            System.out.println(" /t 1. RISE OF THE FALLEN: The Manwaan Series Book 1.");
            System.out.println("/t  2. Shadows Rising");
            System.out.println("/t  3. Kunex, It Ends with Us");
			System.out.print("/t SELECT YOUR BOOK");
			int book=w.nextInt(); 
		if(book==1)
			{
				System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1");
				
				System.out.println("Description: A cultural fusion. A modern twist. An ancient battle of good and evil. \n Amidst an eternalfamily feud, a purposeless and hyper-anxious Rinad discovers that he is part human and part celestial - aManwaan! As he navigates through his strange new reality, along withsavage Asuras and Rakshasas infiltrating Mumbai.");
                System.out.println("Author: Abhishek Krishnan \tLanguage: English Rate: \tRs.300");
			    System.out.println("----------------------------------------------------------------");
			}
			
             else if(book==2)
			 {
                  System.out.println("/t2. Shadows Rising");
			 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");	  
                  System.out.println("Description: Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha,spends his days in the city of Mumbai, drinking cheap rum and pretending to be human./n\nWhen a young girl is abducted, Akran finds himself reluctantly dragged into the investigation. But, as hesoon discovers, this is not a simple case of kidnapping—villainous thugs, gods and demons are allinvolved. And an ancient evil is returning to the world.");
                  System.out.println("/tAuthor: Rohan Monteiro /tLanguage: English /tRate: Rs.250.");
				System.out.println("----------------------------------------------------------------");
			 }
			 else if(book==3)
			 {
				 System.out.println("3. Kunex, It Ends with Us");
				 System.out.println("Description: The newest, highly anticipated novel from beloved #1 New York Times bestselling author,Colleen Hoover. Sometimes it is the one who loves you who hurts you the most. Lily hasn?t always had it easy, but that's neve stopped her from working hard for the life she wants. She?s come a long way fromthe small town in Maine where she grew up?she graduated from college, moved to Boston and started herown business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everythingin Lily?s life suddenly seems almost too good to be true");
			     System.out.println("/t Author: Rohan Monteiro /tLanguage: English /t Rate: Rs.350");
			 }
			 else 
			 {
				 System.out.println("thats enough");
			 }
		}
		
		else if(option==2)
		{
			
			System.out.println("1.Compass and Blade");
			System.out.println("2.Blood Metal Bone");
			System.out.println("3.The Shadows Between US");
			System.out.println("/tThe Options are:");
			int book= w.nextInt();
			if(book==1)
			{
               System.out.println("Compass and Blade");
			   System.out.println("Description: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked shipsbeyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeperwaters. But Rosevear needs her, and she could never abandon her home. Until one evening whenlightning splits the sky and the Watch descend, taking Mira’s father away.");
			   System.out.println("Author: Rachel Greenlaw /t Language: English /tRate: Rs.37");
			}
			else if(book==2)
			{
				System.out.println("Blood Metal Bone");
				System.out.println("Description: Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced toexecution by her own mother. Punished and left for dead, the shadows have cursed her with a second lifeas a Shadow-blood, cast out and hunted by society for her demon-like powers.");
				System.out.println("Author: Lindsay Cummings /tLanguage: English /tRate: Rs.275");
			}
			else if(book==3)
			{
				System.out.println("The Shadows Between us");
				System.out.println("Description: No one knows the extent of the freshly crowned Shadow King's power. Some say he cancommand the shadows that swirl around him to do his bidding. Others say they speak to him, whisperingthe thoughts of his enemies. Regardless, Alessandra, tired of being overlooked, has a plan to gain power:woo the Shadow King, marry him, then kill him and take his kingdom for herself.");
				System.out.println("Author: Tricia Leven-seller /tLanguage: English /tRate: Rs.304");
			}
			else
			{
				System.out.println(" thats enough");
			}
		}
		else if(option==3)
		{
			System.out.println("1.The Psychology of Money");
			System.out.println("2. Do It Today");
			System.out.println("3. Atomic Habits ");
			System.out.print("/tThe Options are:");
			int book=w.nextInt();
			if(book==1)
			{
				System.out.println("The Psychology of Money");
				System.out.println("Description: Timeless lessons on wealth, greed, and happiness doing well with money isn?t necessarilyabout what you know. It?s about how you behave. And behavior is hard to teach, even to really smartpeople.");
				System.out.println("Author: Morgan Housel \tLanguage: English \tRate: Rs.300");
			}
			else if(book==2)
			{
				System.out.println("Do It Today");
				System.out.println("Are you also tired of putting off your dreams until Guess what! Tomorrownever comes. Am I right?I've procrastinated and putt off my desire to write a book for a decade. I always came up with excuseslike, it's not the right time. Or, I need to do more research.");
				System.out.println("Author: Darius Foroux \tLanguage: English \tRate: Rs.100");
				
			}
			else if (book==3)
			{
				System.out.println(" Atomic Habits");
				System.out.println("");
				System.out.println("Author: James Clear \tLanguage: English \tRate: Rs.350");
			}
			else 
			{
				System.out.println("thankyou for used this website");
			}
		}
		else if(option==4)
		{
			System.out.println("1. Dark Psychology Secrets & Manipulation");
			System.out.println("2. The Power of Your Subconscious Mind Do It Today");
			System.out.println("3. The Courage to Be Disliked");
			System.out.print("/tThe Options are:");
			int book=w.nextInt();
			
			
			if(book==1)
			{
				System.out.println("Dark Psychology Secrets & Manipulation");
				System.out.println("Description: In relation to the psychological essence of the various kinds of people who prey on others,dark psychology can be seen as studying the human condition. The truth is that there is the potential forany single human being to victimize other people or other living creatures. Most people prefer to suppresstheir dark impulses and prevent themselves from acting on any desire they have because of social norms,a human conscience, and other factors");
				System.out.println("Author: Amy Brown /tLanguage: English /tRate: Rs.30");
			}
			else if(book==2)
			{
				System.out.println("The Power of Your Subconscious Mind Do It Today");
				System.out.println("Description: This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmativethinking, will unlock for you the truly staggering powers of your subconscious mind. beliefs.");
				System.out.println("Author: Joseph Murphy /tLanguage: English /tRate: Rs.100");
			}
			else if(book==3)
			{
				System.out.println(" The Courage to Be Disliked");
				System.out.println("Description: The Courage to be Disliked shows you how to unlock the power within yourself to becomeyour best and truest self, change your future and find lasting happiness. ");
				System.out.println("Author: Ichiro Kishimi and Fumitake Koga /tLanguage: English /tRate: Rs.350");
			}
			else 
			{
				System.out.println("thats enough");
			}
			
		}
		else 
			{
				System.out.println("thankyou for used this website");
			}
	}
}

			 