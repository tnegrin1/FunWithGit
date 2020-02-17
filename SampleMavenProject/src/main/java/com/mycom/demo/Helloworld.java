package com.mycom.demo;

import sun.applet.AppletSecurity;

import org.apache.log4j.Logger;

public class Helloworld {

    private static Logger LOG = Logger.getLogger("Helloworld");

    public static void main(String[] args) {
        LOG.info("this is an info message");

        System.out.println("Hello World!  I am here to destroy.  There is no hope.");
    }
}
