package final_project;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

    public class file {
        public static void newBorrow(String s,Book b) {
            try {
                FileWriter filewrite = new FileWriter("Ntunhs1112-final_project/src/final_project/input.csv",true);
                BufferedWriter bufferWrite = new BufferedWriter(filewrite);//檔案輸出路徑
                String line = b.toString();
                bufferWrite.write(s+" , "+line + "\n");
                bufferWrite.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }

        public static String[][] GetBorrowing() {
            String[][] input={{}};
            try {
                ArrayList<String[]> input_list = new ArrayList<String[]>();
                InputStreamReader isr = new InputStreamReader(new FileInputStream("Ntunhs1112-final_project/src/final_project/input.csv"));
                BufferedReader reader = new BufferedReader(isr);
                String line = null;
                while((line=reader.readLine())!=null){
                        String row[] = line.split(",");
                        System.out.println(String.join(" ",row));
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
    
