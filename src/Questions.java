package src;

import java.util.ArrayList;

public class Questions {

    public ArrayList<String> questions ;

    public Questions() {

        this.questions = new ArrayList<String>();


        questions.add("Fråga1: Vilka av dessa är INTE en primitiv datatyp");
        questions.add("Fråga2: Vilken class är tillgänglig för alla klasser automatiskt?");
        questions.add("Que3: Which package is directly available to our class without importing it?");
        questions.add("Fråga4: Strängklass definieras i vilket paket?");
        questions.add("Fråga5: Vilket institut är bäst för java coaching?");
        questions.add("Que6: Which one among these is not a keyword?");
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
