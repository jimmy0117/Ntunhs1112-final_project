package final_project;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Book_Math b0 = new Book_Math("現代統計學","林惠玲、陳正倉","978-957-9096-80-5",2020,7,"statistics","Arithmetic,calculus");
		Book_Math b1 = new Book_Math("基礎微積分","張三奇、伍志祥、王永成、張力友","978-986-5647-85-8",2017,3,"calculus","algebra,geometry,trigonometry");
		Book_Math b2 = new Book_Math("管理學","方至民、曾志弘","978-986-98227-2-5",2020,5,"management","analytical thinking skills");
		Book_Technology b3 = new Book_Technology("Bootstrap5RWD","陳惠貞","978-986-312-659-1",2022,2,"css","5");
		Book_Technology b4 = new Book_Technology("C++物件導向","高橋麻奈","978-986-201-699-2",2020,7,"cpp","20");
		Book_Language b5 = new Book_Language("English Now! Listening and Speaking in Everyday Life 3","高橋麻奈","978-626-300-055-1",2020,7,"eng");
		Book_Technology b6 = new Book_Technology("資訊管理系統","董和昇","978-986-7696-39-7",2022,2,"none","none");
		Book_Technology b7 = new Book_Technology("Java最強入門邁向頂尖高手之路:王者歸來","洪錦魁","978-986-5501-58-7",2021,10,"java","20");
		Book_Language b8 = new Book_Language("Skills for Success","Colin S. Ward|Margot F. Gramer","978-0-19-490394-3",2021,10,"eng");
		Book_Language b9 = new Book_Language("Project Success 5","Susan Gaer / Sarah Lynn","978-0-13-298513-0",2014,2,"eng");
		Book_Math b10 = new Book_Math("會計學概要","吳嘉勳","978-626-95135-7-4",2022,5,"Accounting","Arithmetic");
		Book_Technology b11 = new Book_Technology("醫療資訊管理學","李友專、張顯洋、張慧朗、徐建業","978-986-194-503-3",2018,9,"none","none");
	
		Book[] books_array = {b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11};
		Scanner in = new Scanner(System.in);
		while (true){
			String borrowing[][] = file.GetBorrowing();
			String cmd_string = in.nextLine();
			String cmd[] = cmd_string.split(" ");
			if(cmd[0].equals("/exit")){
				System.exit(0);
			}
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
				case "/info":
					if(ArrayTool.IndexOf(borrowing, cmd[2])!=-1){
						System.out.println("書本資訊\n"+books_array[Integer.parseInt(cmd[1])].toString_info());
					}else{
						System.out.println("此書尚未登陸");
					}
					break;
				default:
					System.out.println("未知指令請重新輸入");
					break;
			}
		}
	}

}
