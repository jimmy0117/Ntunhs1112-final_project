package final_project;
import java.io.*;
import java.util.ArrayList;

    public class file {
        public static void newBorrow(Book b) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Ntunhs1112-final_project/src/final_project/output.csv"));//檔案輸出路徑
                String line = b.toString();
                bw.write(line + "\n");
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
                        input_list.add(row);
                }
                input = new String[input_list.size()][];
                for (int i = 0; i < input_list.size(); i++) {
                    input[i] = input_list.get(i);
                }
            } catch (IOException e) {
                e.printStackTrace(); 
            }
            return input;
        }

    }
    
