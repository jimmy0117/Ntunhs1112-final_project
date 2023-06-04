package final_project;

public class Book {
	public static String name;
	public static String author;
	public static int[] ISBN;
	public static int date_Year;
	public static int date_Month;
	Book(String name,String author,int[] ISBN,int year,int month){
		this.name = name;
		this.author = author;
		this.ISBN = ISBN;
		this.date_Year = year;
		this.date_Month = month;
	}
	Book(String name,String author,String ISBN,int year,int month){
		this.name = name;
		this.author = author;
		String id[] = ISBN.split("-");
		this.ISBN = new int[5];
		for(int i=0;i<4;i++) {this.ISBN[i] = Integer.parseInt(id[i]);}
		this.date_Year = year;
		this.date_Month = month;
	}
}
