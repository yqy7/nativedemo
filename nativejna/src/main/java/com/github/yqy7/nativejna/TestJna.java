package com.github.yqy7.nativejna;

import java.nio.file.Paths;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

/**
 * @author qiyun.yqy
 * @date 2019-04-27
 */
public class TestJna {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = Native.load("c", CLibrary.class);

        void printf(String format, Object... args);
    }

    static {
        NativeLibrary.addSearchPath("hello", Paths.get("./native").toAbsolutePath().toString());
    }

    public interface HelloLibrary extends Library {
        HelloLibrary INSTANCE = Native.load("hello", HelloLibrary.class);

        void sayhello(String s);
    }

    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("abc-%s\n", "~~~~~~");

        HelloLibrary.INSTANCE.sayhello("test jna~~~~~");
    }
}
