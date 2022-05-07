package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName="testTestov";// camelCase  class adları isə ClassName PascalCase 
		// if if                           if else                                 if else if
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("eded daxil edin");// ASCII table
		int number=sc.nextInt();
		
		if(number%5==0) 
		    System.out.println(number+" ədədi 5-ə qalıqsız bölünür və " + (number/5)+" alınır");
		else {
			System.out.println(number + " ədədi 5-ə bölünmür");
			System.out.println(number%5+" qalığı qalır");
		}
		 
		 
		 int b=11;
		 		 
		 for(int a=1;a<=10;a++){// a=1 2 3 4 5
			 if(a==5) {
				 continue;
			 }
			 if(a==6) {
				 continue;
			 }
			 if(a==3) {
				 continue;
			 }
			 System.out.println(a);
		 }

		 
		 while(b<=10) {// şərti yoxlayır sonra kodu icra edir
			 if(b==6) {
			 break;
		        }
			 System.out.println(b);
			 b++;
		 }
		 
		 
		 do { // kodu icra edir sonra yoxlay
			 System.out.println(b);
			 b++;
		 }while(b<=10);
		 
	}

}
