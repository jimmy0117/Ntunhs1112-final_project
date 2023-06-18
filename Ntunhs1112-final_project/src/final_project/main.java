package final_project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Book b0 = new Book("現代統計學","林惠玲、陳正倉","978-957-9096-80-5",2020,7);
		Book b1 = new Book("基礎微積分","張三奇、伍志祥、王永成、張力友","978-986-5647-85-8",2017,3);
		Book b2 = new Book("管理學","方至民、曾志弘","978-986-98227-2-5",2020,5);
		Book b3 = new Book("Bootstrap5RWD","陳惠貞","978-986-312-659-1",2022,2);
		Book b4 = new Book("C++物件導向","高橋麻奈","978-986-201-699-2",2020,7);
		Book b5 = new Book("English Now! Listening and Speaking in Everyday Life 3","高橋麻奈","978-626-300-055-1",2020,7);
		Book b6 = new Book("資訊管理系統","董和昇","978-986-7696-39-7",2022,2);
		Book b7 = new Book("Java最強入門邁向頂尖高手之路:王者歸來","洪錦魁","978-986-5501-58-7",2021,10);
		Book b8 = new Book("Skills for Success","Colin S. Ward|Margot F. Gramer","978-0-19-490394-3",2021,10);
		Book[] books_array = {b0,b1,b2,b3,b4,b5,b6,b7,b8};
		Scanner in = new Scanner(System.in);
		while (true){
			String borrowing[][] = file.GetBorrowing();
			String cmd_string = in.nextLine();
			String cmd[] = cmd_string.split(" ");
			if(!books_array[Integer.parseInt(cmd[1])].ISBN.trim().equals(cmd[2])) {
				System.out.println("ISBN碼不正確，請重新輸入");
				continue;
			}
			switch (cmd[0]) {
				case "/borrow":
					if(ArrayTool.IndexOf(borrowing, cmd[2])==-1){
						file.newBorrow(cmd[0] , books_array[Integer.parseInt(cmd[1])]);
						System.out.println("完成租借");
					}else{
						System.out.println("此書已被借走");
					}
					break;
				case "/return":
					if(ArrayTool.IndexOf(borrowing, cmd[2])!=-1){
						file.newBorrow(cmd[0] , books_array[Integer.parseInt(cmd[1])]);
						file.BorrowingUpdate(borrowing, books_array[Integer.parseInt(cmd[1])]);
						System.out.println("完成歸還");
					}else{
						System.out.println("此書尚未租借");
					}
					break;
				case "/borrowing":
					for (String[] book_data : borrowing) {
						System.err.println(String.join(",", book_data));
					}
					break;
				default:
					System.out.println("未知指令請重新輸入");
					break;
			}
		}
	}

}
