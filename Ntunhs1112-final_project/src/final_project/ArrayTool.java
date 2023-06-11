package final_project;

public class ArrayTool {
    public static int IndexOf(String[][]arr,String index) {
        for (int i = 0; i < arr.length; i++) {
            String get = arr[i][2].replace("-", "");
            if (arr[i][2].equals(index)) {
                return i;
            }
        }return -1;
    }
}
