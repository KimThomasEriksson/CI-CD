import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaAppTest {

    JavaApp myApp = new JavaApp("Online Test Of Java");

    @Test
    public void check() {

        // Testa #1 fråga
        myApp.current = 0;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 0;
        myApp.jb[1].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 0;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 0;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #2 fråga
        myApp.current = 1;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 1;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 1;
        myApp.jb[2].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 1;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #3 fråga
        myApp.current = 2;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 2;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 2;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 2;
        myApp.jb[3].setSelected(true);
        assertTrue(myApp.check());

        // Testa #4 fråga
        myApp.current = 3;
        myApp.jb[0].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 3;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 3;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 3;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #5 fråga
        myApp.current = 4;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 4;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 4;
        myApp.jb[2].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 4;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #6 fråga
        myApp.current = 5;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 5;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 5;
        myApp.jb[2].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 5;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #7 fråga
        myApp.current = 6;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 6;
        myApp.jb[1].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 6;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 6;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #8 fråga
        myApp.current = 7;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 7;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 7;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 7;
        myApp.jb[3].setSelected(true);
        assertTrue(myApp.check());

        // Testa #9 fråga
        myApp.current = 8;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 8;
        myApp.jb[1].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 8;
        myApp.jb[2].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 8;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());

        // Testa #10 fråga
        myApp.current = 9;
        myApp.jb[0].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 9;
        myApp.jb[1].setSelected(true);
        assertFalse(myApp.check());
        myApp.current = 9;
        myApp.jb[2].setSelected(true);
        assertTrue(myApp.check());
        myApp.current = 9;
        myApp.jb[3].setSelected(true);
        assertFalse(myApp.check());


    }

}