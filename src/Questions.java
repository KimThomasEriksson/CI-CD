package src;

import java.util.ArrayList;

public class Questions {

    public ArrayList<String> questions ;

    public Questions() {

        this.questions = new ArrayList<String>();


        questions.add("Fråga1: Vilka av dessa är INTE en primitiv datatyp");
        questions.add("Fråga2: Vilken class är tillgänglig för alla klasser automatiskt?");
        questions.add("Fråga3: Vilket paket är tillgängligt för våran klass utan att importera den?");
        questions.add("Fråga4: Strängklass definieras i vilket paket?");
        questions.add("Fråga5: Vilket institut är bäst för java coaching?");
        questions.add("Fråga6: Vilka av dessa är inte ett nyckelord?");
        questions.add("Fråga 7: Vilken av dessa är en klass?");
        questions.add("Fråga 8: Vilken av dessa är inte en funktion av objekt klass");
        questions.add("Fråga9: Vilken funktion finns inte i Applet-klassen?");
        questions.add("Fråga10: Vilken av dessa är inte en giltig komponent?");

    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }
}
