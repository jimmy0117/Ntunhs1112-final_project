package final_project;

public class Book {
	public String name;
	public String author;
	public int[] ISBN;
	public int date_Year;
	public int date_Month;
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
	public String getISBN() {
		String[] sa = new String[this.ISBN.length];
		for (int i = 0; i < sa.length; i++) {
			sa[i] = Integer.toString(this.ISBN[i]);
		}
		return String.join("-", sa);
	}
	@Override
	public String toString() {
		return String.format("%s , %s , %s , %d , %d", this.name,this.author,this.getISBN(),this.date_Year,this.date_Month);
	}
}
