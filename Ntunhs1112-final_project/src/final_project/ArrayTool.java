package final_project;

public class ArrayTool {
    public static int IndexOf(String[][]borrowing_array,String index) {
        for (int i = 0; i < borrowing_array.length; i++) {
            System.out.printf("%s %s\n",borrowing_array[i][3],index);
            if (borrowing_array[i][3].trim().equals(index.trim())) {
                return i;
            }
        }return -1;
    }
}
