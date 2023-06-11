package final_project;

public class ArrayTool {
    public static int IndexOf(String[][]borrowing_array,String index) {
        for (int i = 0; i < borrowing_array.length; i++) {
            String get = borrowing_array[i][2].replace("-", "");
            if (borrowing_array[i][2].equals(index)) {
                return i;
            }
        }return -1;
    }
}
