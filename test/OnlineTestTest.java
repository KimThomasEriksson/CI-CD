package test;


import org.junit.jupiter.api.Assertions;
import src.OnlineTest;

class OnlineTestTest {

    OnlineTest myApp = new OnlineTest("Online Test Of Java");

    @org.junit.jupiter.api.Test
    void actionPerformed() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void check() {

        myApp.current = 0;
        Assertions.assertTrue(myApp.check());

    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}