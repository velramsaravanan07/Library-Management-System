package libary;

import java.util.ArrayList;

public class LibraryImpl implements LibraryInterface {
    private ArrayList<LibraryClass> library = new ArrayList<>();
    private ArrayList<LibraryClass> borrowedBooks = new ArrayList<>();

    @Override
    public void add(LibraryClass libraryItem) {
        if (libraryItem == null) {
            System.out.println("Cannot add a null value");
        } else {
            library.add(libraryItem);
            System.out.println("Book is added");
        }
    }

	@Override
	public void getData() {
	for(LibraryClass  items: library) {
		System.out.println(items);
	}
		
	}

	@Override
	public void borrowed(int id) {
		System.out.println("Available books:");
	    for (LibraryClass item : library) {
	        System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle());
	    }

	    for (LibraryClass item : library) {
	        if (item.getId() == id) {
	            library.remove(item);
	            borrowedBooks.add(item); 
	            System.out.println("Book " + item.getTitle() + " is borrowed");
	            return;
	        }
	    }
	    System.out.println("Book with id " + id + " not found");
	}

	@Override
	public void returned(int id) {
		  System.out.println("Borrowed books:");
		    for (LibraryClass item : borrowedBooks) {
		        System.out.println("ID: " + item.getId() + ", Title: " + item.getTitle());
		    }
		  for (LibraryClass item : borrowedBooks) {
	            if (item.getId() == id) {
	                borrowedBooks.remove(item);
	                library.add(item);
	                System.out.println("Book " + item.getTitle() + " is returned");
	                return;
	            }
	        }
	        System.out.println("Book with id " + id + " was not borrowed or not found");
	    }
	}