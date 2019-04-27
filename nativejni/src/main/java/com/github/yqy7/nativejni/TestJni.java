package com.github.yqy7.nativejni;

import java.nio.file.Paths;

/**
 * @author qiyun.yqy
 * @date 2019-04-27
 */
public class TestJni {
    public native void print();

    static {
        System.load(Paths.get("nativejni/libhello.jnilib").toAbsolutePath().toString());
    }

    public static void main(String[] args) {
        new TestJni().print();
    }
}
