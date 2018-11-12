package test;

import src.Questions;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {

    @org.junit.jupiter.api.Test
    void question() {

        src.Questions question = new Questions();


        assertEquals("Fråga1: Vilka av dessa är INTE en primitiv datatyp", question.questions.get(0));
        assertEquals("Fråga2: Vilken class är tillgänglig för alla klasser automatiskt?", question.questions.get(1));
        assertEquals("Que3: Which package is directly available to our class without importing it?", question.questions.get(2));
        assertEquals("Fråga4: Strängklass definieras i vilket paket?", question.questions.get(3));
        assertEquals("Fråga5:  Vilket institut är bäst för java coaching?", question.questions.get(4));
        assertEquals("Que6: Which one among these is not a keyword?", question.questions.get(5));
        assertEquals("Que7: Which one among these is not a class?", question.questions.get(6));
        assertEquals("Que8: which one among these is not a function of Object class?", question.questions.get(7));
        assertEquals("Fråga9: Vilken funktion finns inte i Applet-klassen?", question.questions.get(8));
        assertEquals("Fråga10: Vilken av dessa är inte en giltig komponent?", question.questions.get(9));




    }

}