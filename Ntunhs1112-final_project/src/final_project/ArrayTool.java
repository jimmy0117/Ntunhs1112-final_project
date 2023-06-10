package final_project;

public class ArrayTool {
    public static int IndexOf(String[] arr,String index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(index)) {
                return i;
            }
        }return -1;
    }
}
