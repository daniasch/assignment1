package edu.harrisburgu.cisc525.app;

import java.net.UnknownHostException;

public class Main {
    public static void main(String... args) throws UnknownHostException {
        if (args.length < 1) {
            System.out.println("**** java edu.harrisburgu.cisc525.app.Main <text> ****");
            return;
        }
        Greetings greetings = new Greetings();
        System.out.println(greetings.hello(args[0]));

    }
}