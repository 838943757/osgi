package com.gl.software.server.impl;

import com.gl.software.server.Hello;

public class HelloImpl implements Hello {
    final String hello_str;

    public HelloImpl(String str) {
        this.hello_str = str;
    }

    @Override
    public void sayHello() {
        System.out.println(hello_str);
    }
}
