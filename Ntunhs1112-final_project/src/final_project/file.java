package final_project;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

    public class file {
        public static void newBorrow(String s,Book b) {
            try {
                FileWriter filewrite1 = new FileWriter("Ntunhs1112-final_project/src/final_project/history.csv",true);
                BufferedWriter bufferWrite1 = new BufferedWriter(filewrite1);//檔案輸出路徑
                FileWriter filewrite2 = new FileWriter("Ntunhs1112-final_project/src/final_project/borrowing.csv",true);
                BufferedWriter bufferWrite2 = new BufferedWriter(filewrite2);//檔案輸出路徑
                String line = b.toString();
                bufferWrite1.write(s+" , "+line + "\n");
                bufferWrite1.close();
                bufferWrite2.write(line + "\n");
                bufferWrite2.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }
        public static void BorrowingUpdate(String[][] s,Book b) {
            try {
                FileWriter filewrite = new FileWriter("Ntunhs1112-final_project/src/final_project/borrowing.csv",false);
                BufferedWriter bufferWrite = new BufferedWriter(filewrite);//檔案輸出路徑
                for (String[] strings : s) {
                    if (!strings[2].trim().equals(b.ISBN.trim())) {
                        System.out.printf("%s %s\n",strings[2],b.ISBN);
                        bufferWrite.write(String.join(",",strings) + "\n");
                    }
                }
                bufferWrite.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }

        public static String[][] GetBorrowing() {
            String[][] input={{}};
            try {
                ArrayList<String[]> input_list = new ArrayList<String[]>();
                InputStreamReader isr = new InputStreamReader(new FileInputStream("Ntunhs1112-final_project/src/final_project/borrowing.csv"));
                BufferedReader reader = new BufferedReader(isr);
                String line = null;
                while((line=reader.readLine())!=null){
                        String row[] = line.split(",");
                        //System.out.println(String.join(" ",row));
                        input_list.add(row);
                }
                input = new String[input_list.size()][];
                for (int i = 0; i < input_list.size(); i++) {
                    input[i] = input_list.get(i);
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return input;
        }

    }
    
