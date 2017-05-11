import com.mmall.util.MD5Util;

/**
 * Created by s on 2017/5/10.
 */
public class Md5test {
    public static void main(String[] args) {
        String password = "123456";
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        System.out.println(md5Password);

    }
}
