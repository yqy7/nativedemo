package com.github.yqy7.nativejnr;

import java.nio.file.Paths;

import jnr.ffi.LibraryLoader;

/**
 * @author qiyun.yqy
 * @date 2019-04-27
 */
public class TestJnr {
    public interface LibC {
        void printf(String format, Object... args);
    }

    public interface LibHello {
        void sayhello(String s);
    }

    public static void main(String[] args) {
        LibC libc = LibraryLoader.create(LibC.class).load("c");
        libc.printf("aaa-%s\n", "~~~~");

        LibHello libHello = LibraryLoader.create(LibHello.class).search(Paths.get("native").toAbsolutePath().toString()).load("hello");
        libHello.sayhello("testjnr");
    }
}
