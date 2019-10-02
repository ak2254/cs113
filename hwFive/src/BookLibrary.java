import java.util.Scanner;
public class BookLibrary {

public static  int Max=10; 
private static  int currentk =0; 
public static void main(String[] args) {
	Book[] bookList=new Book[Max]; 
	Scanner scan=new Scanner(System.in); 
}

private static void addBook(Book[] bookList) {
	if(currentk==Max){ 
		System.out.println("It full");
}

	else{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter book title : "); 
		String title=scan.nextLine();
		for(int i=0;i<currentk;i++){ 
			if(bookList[i].getk().equalsIgnoreCase(title)){ 
				System.out.println("This title already exist");
				return;
}
}
		System.out.print("Enter number of pages : ");
		int pages=scan.nextInt();
		bookList[currentk]=new Book(title, pages); 
currentk++; 
displayBook(bookList); 
}
}
private static void deleteBook(Book[] bookList) {
	if(currentk==0){ 
		System.out.println("It empty");

}
	else{

Scanner scan=new Scanner(System.in);

System.out.print("Enter book title : "); 

String title=scan.nextLine();

for(int i=0;i<currentIndex;i++){ 

if(bookList[i].getk().equalsIgnoreCase(title)){

for(int j=i;j<(currentIndex-1);j++){

bookList[j]=bookList[j+1];

}

currentIndex-=1; 

displayBook(bookList); 

return;

}

}



System.out.println("Book with this title is not available.");

}

}

private static void changeBook(Book[] bookList) {

if(currentIndex==0){

System.out.println("Library is empty");

}else{

Scanner scan=new Scanner(System.in);

System.out.print("Enter book title : "); 

String title=scan.nextLine();

for(int i=0;i<currentIndex;i++){

if(bookList[i].getk().equalsIgnoreCase(title)){ 

System.out.print("Enter new book title : "); 

title=scan.nextLine();

System.out.print("Enter number of pages : ");

int pages=scan.nextInt();

bookList[i].setk(); 

bookList[i].setnum(); 

displayBook(bookList); 

return;

}

}



System.out.println("Book with this title is not available.");

}

}

private static void displayBook(Book[] bookList) {



for(int i=0;i<currentIndex;i++){

for(int j=i+1;j<currentIndex;j++){

if(bookList[i].getk().compareToIgnoreCase(bookList[j].getk())<1){

Book temp=bookList[i];

bookList[i]=bookList[j];

bookList[j]=temp;

}

}

}



System.out.println();

System.out.printf("%-13s %-10s %n","Title","Pages");

for(int i=0;i<currentIndex;i++){

System.out.printf("%-13s %-10s %n",bookList[i].getk(),bookList[i].getnum());

}

}

}