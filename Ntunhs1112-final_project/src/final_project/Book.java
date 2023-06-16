package final_project;

public class Book {
	public String name;
	public String author;
	public String ISBN;
	public int date_Year;
	public int date_Month;
	Book(String name,String author,String ISBN,int year,int month){
		this.name = name;
		this.author = author;
		this.ISBN = ISBN;
		this.date_Year = year;
		this.date_Month = month;
	}
	Book(String name,String author,int[] ISBN,int year,int month){
		this.name = name;
		this.author = author;
		this.ISBN = "";
		for(int i=0;i<4;i++) {this.ISBN += String.valueOf(ISBN[i]);}
		this.date_Year = year;
		this.date_Month = month;
	}
	@Override
	public String toString() {
		return String.format("%s , %s , %s , %d , %d", this.name,this.author,this.ISBN,this.date_Year,this.date_Month);
	}
}
