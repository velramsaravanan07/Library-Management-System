package libary;

public class LibraryClass {

private String title;
private String author;
private int id;
public LibraryClass(String title, String author, int id) {
	super();
	this.title = title;
	this.author = author;
	this.id = id;
}

public String getTitle() {
	return title;
}
public void getTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "LibaryClass [tilte=" + title + ", author=" + author + ", id=" + id + "]";
}

}
