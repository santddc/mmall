import java.util.ArrayList;
import java.util.List;

/**
 * Created by s on 2017/5/14.
 */
public class digui {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        digui(list);
    }

    public static List<String> digui(List<String> list){
        String[] arr = {"2","3","5","7","8"};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
