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


        myApp.current = 1;
        myApp.jb[2].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 2;
        myApp.jb[3].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 3;
        myApp.jb[0].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 4;
        myApp.jb[2].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 5;
        myApp.jb[2].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 6;
        myApp.jb[1].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 7;
        myApp.jb[3].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 8;
        myApp.jb[1].setSelected(true);
        Assertions.assertTrue(myApp.check());
        myApp.current = 9;
        myApp.jb[2].setSelected(true);
        Assertions.assertTrue(myApp.check());


    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}