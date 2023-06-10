package final_project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Book b1 = new Book("現代統計學","林惠玲、陳正倉","978-957-9096-80-5",2020,7);
		Book b2 = new Book("基礎微積分","張三奇、伍志祥、王永成、張力友","978-986-5647-85-8",2017,3);
		Book b3 = new Book("管理學","方至民、曾志弘","978-986-98227-2-5",2020,5);
		Book b4 = new Book("Bootstrap5RWD","陳惠貞","978-986-312-659-1",2022,2);
		Book b5 = new Book("C++物件導向","高橋麻奈","978-986-201-699-2",2020,7);
		Book b6 = new Book("English Now! Listening and Speaking in Everyday Life 3","高橋麻奈","978-626-300-055-1",2020,7);
		Book b7 = new Book("資訊管理系統","董和昇","978-986-7696-39-7",2022,2);
		Book b8 = new Book("Java最強入門邁向頂尖高手之路:王者歸來","洪錦魁","978-986-5501-58-7",2021,10);
		Book b9 = new Book("Skills for Success","Colin S. Ward|Margot F. Gramer","978-0-19-490394-3",2021,10);
		Scanner in = new Scanner(System.in);
		while (true){
			String borrowing[] = file.GetBorrowing();
			String s = in.nextLine();
			String cmd[] = s.split(" ");
			switch (cmd[0]) {
				case "/borrow":
					if(ArrayTool.IndexOf(borrowing, cmd[1])==-1){
						//寫檔案
					}else{
						System.out.println("此書已被借走");
					}
				case "/return":
					if(ArrayTool.IndexOf(borrowing, cmd[1])!=-1){
						//寫檔案
					}else{
						System.out.println("此書尚未租借");
					}
				default:
					System.out.println("未知指令請重新輸入");
			}
		}
	}

}
