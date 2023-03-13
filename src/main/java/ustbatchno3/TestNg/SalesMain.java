package ustbatchno3.TestNg;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SalesMain {
		public static void main(String[] args){
			Constructionsales p1=new Constructionsales("Hyderabad", 2000, 900);
			Constructionsales p2=new Constructionsales("Chennai", 1800, 1000);
			Constructionsales p3=new Constructionsales("Trivandrum", 1600, 800);
			Constructionsales p4=new Constructionsales("Cochin", 1800, 1200);
			Constructionsales p5=new Constructionsales("Mumbai", 2500, 900);
			
			
			Scanner sc=new Scanner(System.in);
			
			List<Constructionsales> details=Arrays.asList(p1,p2,p3,p4,p5);
			System.out.println("Enter square feet");
			//int sq=3,price=0;
			int sq=sc.nextInt();
			System.out.println("Enter city");
			String city=sc.next();
			city.toLowerCase();
			int choice=0;
			System.out.println("Enter choice\n1-Price without material\n2-Price with material");
			choice=sc.nextInt();
			sc.close();
			int price=construction(details, choice, city, sq);
			
			System.out.println("Total price : "+price);
			
		}
		public static int  construction(List<Constructionsales> details,int choice,String city,int sq) {
			List<Constructionsales> result=details.stream().filter(t->((t.getCity().toLowerCase()).equals(city))).toList();
			//if(result.isEmpty()) {
				//System.out.println("city not found!!!");
				
			
			int price=0;
			switch(choice) {
			case 1:for(Constructionsales p:result) 
						price=(p.getPricewithoutmaterial()*sq);
						break;
			case 2:for(Constructionsales p:result) 
						price=(p.getPricewithmaterial()*sq);
						break;}
			return price;
		
		}
}