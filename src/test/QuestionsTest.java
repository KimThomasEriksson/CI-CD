package test;

import src.Questions;

import static org.junit.jupiter.api.Assertions.*;

class QuestionsTest {

    @org.junit.jupiter.api.Test
    void question() {

        src.Questions question = new Questions();


        assertEquals("Que1: Which one among these is not a primitive datatype?", question.questions.get(0));
        assertEquals("Que2: Which class is available to all the class automatically?", question.questions.get(1));
        assertEquals("Que3: Which package is directly available to our class without importing it?", question.questions.get(2));
        assertEquals("Fråga4: Strängklass definieras i vilket paket?", question.questions.get(3));
        assertEquals("Fråga5:  Vilket institut är bäst för java coaching?", question.questions.get(4));
        assertEquals("Que6: Which one among these is not a keyword?", question.questions.get(5));
        assertEquals("Que7: Which one among these is not a class?", question.questions.get(6));
        assertEquals("Que8: which one among these is not a function of Object class?", question.questions.get(7));
        assertEquals("Que9: which function is not present in Applet class?", question.questions.get(8));
        assertEquals("Que10: Which one among these is not a valid component?", question.questions.get(9));




    }

}