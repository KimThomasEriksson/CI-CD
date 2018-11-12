package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OnlineTestTest {

    src.OnlineTest myApp = new src.OnlineTest("Online Test Of Java");

    @org.junit.jupiter.api.Test
    void actionPerformed() {
    }

    @org.junit.jupiter.api.Test
    void set() {
    }

    @org.junit.jupiter.api.Test
    void check() {

        myApp.current = 0;
        myApp.jb[2].setSelected(false);
        assertFalse(myApp.check());




    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}