package src;

import java.util.ArrayList;

public class Questions {

    public ArrayList<String> questions ;

    public Questions() {

        this.questions = new ArrayList<String>();

        questions.add("Que1: Which one among these is not a primitive datatype?");
        questions.add("Que2: Which class is available to all the class automatically?");
        questions.add("Que3: Which package is directly available to our class without importing it?");
        questions.add("Que4: String class is defined in which package?");
        questions.add("Que5: Which institute is best for java coaching?");
        questions.add("Que6: Which one among these is not a keyword?");
        questions.add("Fråga 7: Vilken av dessa är en klass?");
        questions.add("Que8: Vilken av dessa är inte en funktion av objekt klass");
        questions.add("Que9: which function is not present in Applet class?");
        questions.add("Que10: Which one among these is not a valid component?");

    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }
}
