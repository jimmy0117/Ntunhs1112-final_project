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

class Book_Language extends Book {
	public String lan = "";
    public Book_Language(String name, String author, String ISBN, int year, int month, String lan) {
        super(name, author, ISBN, year, month);
        this.lan = lan;
    }

    @Override
    public String toString() {
        return String.format("%s , %s , %s , %s , %d , %d", this.name, this.author, this.ISBN, this.lan, this.date_Year, this.date_Month);
    }

}

class Book_Math extends Book {
	public String key = "";
	public String[] before;
    public Book_Math(String name, String author, String ISBN, int year, int month, String key,String before_string) {
        super(name, author, ISBN, year, month);
        this.key = key;
		this.before = before_string.split(" ");
    }

    @Override
    public String toString() {
        return String.format("%s , %s , %s , %s , %s , %d , %d", this.name, this.author, this.ISBN, this.key, this.date_Year, this.date_Month);
    }

	public String[] getBefore(boolean output){
		if(output){
			for (String string : before) {
				System.out.println(string);
			}
		}
		return before;
	}
	
	public boolean checkBefore(){
		if (ArrayTool.IndexOf(before, key) != -1) {
			return true;
		}
		return false;
	}
}

class Book_Technology extends Book {

    String type = "";
	String version = "";
    public Book_Technology(String name, String author, String ISBN, int year, int month, String type, String version) {
        super(name, author, ISBN, year, month);
        this.type = type;
		this.version = version;
    }

    @Override
    public String toString() {
        return String.format("%s , %s , %s , %s, %s, %d , %d", this.name, this.author, this.ISBN, this.type, this.version, this.date_Year, this.date_Month);
    }
	
}