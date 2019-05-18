package lanny.com.so;

/**
 * Created by lannyxu on 2019/5/18.
 */
public class JniUtils {

    static {
        System.loadLibrary("Hello");
    }

    public native String getString(); //java调C中的方法都需要用native声明且方法名必须和c的方法名一样

}
