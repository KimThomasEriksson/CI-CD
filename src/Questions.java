package src;

import java.util.ArrayList;

public class Questions {

    public ArrayList<String> questions ;

    public Questions() {

        this.questions = new ArrayList<String>();

        questions.add("Que1: Which one among these is not a primitive datatype?");
        questions.add("Que2: Which class is available to all the class automatically?");
        questions.add("Que3: Which package is directly available to our class without importing it?");
        questions.add("Fråga4: Strängklass definieras i vilket paket?");
        questions.add("Fråga5: Vilket institut är bäst för java coaching?");
        questions.add("Que6: Which one among these is not a keyword?");
        questions.add("Que7: Which one among these is not a class?");
        questions.add("Que8: which one among these is not a function of Object class?");
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
