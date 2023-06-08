package final_project;
import java.io.*;

    public class file {
        public static void main(String[] args) throws IOException {
            String s = "Input Text";
            InputStreamReader in = new InputStreamReader(new FileInputStream("input.txt"));//檔案讀取路徑
            BufferedReader bin = new BufferedReader(in);
            BufferedWriter bout = new BufferedWriter(new FileWriter("output.txt"));//檔案輸出路徑
            
        }
    }
    
