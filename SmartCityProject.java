import java.util.Scanner;
class SmartCityProject 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("***Welcome to Vizg-City Of Destiny***");
		System.out.println("You all might have heard vizag is a beautiful city but dont have a proper travel plan to enjoy the city\n.No worries!! We will help you out in bringing out the best itinerary");
		System.out.println("Press 1 for Air Booking");
		System.out.println("Press 2 for Train booking");
		System.out.println("Press 3 for Budget Hotels");
		System.out.println("Press 4 for Tourist spots");
		System.out.println("Press 5 for Transportation facilities");
		System.out.println("Press 6 for Shopping malls");
		System.out.println("Press 7 for ATM locations");
		int choice=scan.nextInt();
		switch(choice)
			{
			case 1: System.out.println("***Thank you for your response***");
			System.out.println("press 'b' for Banglore departure");
			System.out.println("press 'c' for Chennai departure");
			System.out.println("press 'B' for Bhuwaneshwar departure");
			System.out.println("press 'd' for Delhi departure");
			System.out.println("press 'h' for Hyderabad departure");
			char choice1=scan.next().charAt(0);
			switch(choice1)
				{
				case 'b':System.out.println("We have:1)Air India\n2)Indigo\n3)Spicejet\n4)Jet Airways connectivity");
				break;
				case 'c':System.out.println("We have:1)Indigo\n2)Spicejet connectivity");
				break;
				case 'B':System.out.println("We have:1)Indigo\n2)Jet Airways connectivity");
				break;
				case 'd':System.out.println("We have:1)Air India\n2)Spicejet connectivity");
				break;
				case 'h':System.out.println("We have:1)Air India\n2)Indigo\n3)Spicejet connevtivity");
				break;
				}
				break;
				case 2:System.out.println("***Thank you for your response***");
				System.out.println("We have connectivity from:1)delhi\n2)bhuwaneshwar\n3)chennai\n4)hyderabad\n5)bhopal\nkolkata\n. For information about tickets availability, please visit:www.irctc.com");
				break;
				case 3:System.out.println("***Thank you for your response***");
				System.out.println("We have very good hotels in vizag with extra facilities\n.For more information, please visit:www.hotels_in_vizag.com");
				break;
				case 4:System.out.println("***Thank you for your response***");
				System.out.println("We have famous tourist spots in vizag\n.1)Rk beach\n2)Araku\n3)Vanjangi\n4)Lambasingi\n5)Zoo Park\n6)Kailashgiri\n.For more information, please visit:www.trawell_in_vizag.com");
				break;
				case 5:System.out.println("***Thank you for your response***");
				System.out.println("You can travel to these tourist spots on:1)bus\n2)cab\n3)auto.");
				System.out.println("Please visit www.apsrtc.com for bus travel");
				System.out.println("Please visit www.ola.com or www.uber.com or www.fasttrack.com for cab travel");
				System.out.println("You can get autos at any stop, no need of prior booking");
				break;
				case 6:System.out.println("***Thank you for your response***");
				System.out.println("Vizag is a good place for shopping.There are many where you can buy to your heart's content\n.But, I would like to recommend Best shopping malls:1)Vizag central\n2)CMR central\n3)Pantaloons\n4)Chitralaya\n5)Shoppers stop");
				System.out.println("Have fun!!");
				break;
				case 7:System.out.println("***Thank you for your response***");
				System.out.println("Press 'A' for Andhra Bank");
				System.out.println("Press 'S' for SBI");
				System.out.println("Press 'B' for Bank of Baroda");
				char choice2=scan.next().charAt(0);
				switch(choice2)
				{
					case 'A':System.out.println("Rushikonda;Vizag-530042");
					break;
					case 'S':System.out.println("Opposite CMR central;Vizag-530039");
					break;
					case 'B':System.out.println("Opposite Chitralaya;Vizag-530032");
					break;
				}
			}
			System.out.println("***Thank you for visiting our page. I hope you found lot of related information for itinerary!!\n.For any queries reach out to: travel_vlogger@gmail.com***");
			System.out.println();
			
	}
}
