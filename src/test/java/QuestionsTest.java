import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionsTest {

    @Test
    public void question() {

        Questions question = new Questions();

        assertEquals("Fråga1: Vilka av dessa är INTE en primitiv datatyp", question.questions.get(0));
        assertEquals("Fråga2: Vilken class är tillgänglig för alla klasser automatiskt?", question.questions.get(1));
        assertEquals("Fråga3: Vilket paket är tillgängligt för våran klass utan att importera den?", question.questions.get(2));
        assertEquals("Fråga4: Strängklass definieras i vilket paket?", question.questions.get(3));
        assertEquals("Fråga5: Vilket institut är bäst för java coaching?", question.questions.get(4));
        assertEquals("Fråga6: Vilka av dessa är inte ett nyckelord?", question.questions.get(5));
        assertEquals("Fråga7: Vilken av dessa är en klass?", question.questions.get(6));
        assertEquals("Fråga8: Vilken av dessa är inte en funktion av objekt klass", question.questions.get(7));
        assertEquals("Fråga9: Vilken funktion finns inte i Applet-klassen?", question.questions.get(8));
        assertEquals("Fråga10: Vilken av dessa är inte en giltig komponent?", question.questions.get(9));




    }

}