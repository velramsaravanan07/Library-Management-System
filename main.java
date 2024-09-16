package libary;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 LibraryImpl library = new LibraryImpl();
	 while (true) {
         System.out.println("1. Save \n2. GetAllData \n3. Borrow a Book \n4. Return a Book \n5. Exit");
         System.out.println("Enter the choice");
         int choice = sc.nextInt();
         switch (choice) {
         case 1: {
        	    System.out.println("Enter the Title:");
                sc.nextLine(); 
                String title = sc.nextLine();
                System.out.println("Enter the Author:");
                String author = sc.nextLine();
                System.out.println("Enter the Id:");
                int id = sc.nextInt();
                LibraryClass p = new LibraryClass(title, author, id);
                library.add(p);
                break;
         }
        
         case 2:{
        	 library.getData();
        	   break;
         }
         case 3:{
        	 System.out.println("Enter the book Id to be Borrowed");
        	 int id=sc.nextInt();
        	 library.borrowed(id);
        	   break;
         }
         case 4:{
        	 System.out.println("Enter the book Id to be Returned");
        	 int id=sc.nextInt();
        	 library.returned(id);
        	   break;
         }
         case 5:{
        	   sc.close();
               System.exit(0);
               break;
         }
         default:
             System.out.println("Invalid choice. Please try again.");
         }
	 }
}
}
