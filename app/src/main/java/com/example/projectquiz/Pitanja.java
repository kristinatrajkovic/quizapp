package com.example.projectquiz;

import java.util.ArrayList;
import java.util.List;

public class Pitanja {

    private static List<QuestionsList> javaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Koji tip podataka se koristi za kreiranje promenljive koja treba da čuva tekst?", "string", "myString", "String", "Txt", "String","");
        final QuestionsList question2 = new QuestionsList("Koji metod se može koristiti za pronalaženje dužine niza", "length()","getSize()", "getLength()", "len()", "length()","");
        final QuestionsList question3 = new QuestionsList("Koji od sledećih iskaza u vezi sa instanciranjem klase u Javi je netačan?", "Prilikom instanciranja klase konstruktor njene natklase mora da se izvrši", " Instanca klase se uvek čuva u dinamičkoj zoni memorije", "U telu konstruktora je moguće pozvati konstruktor natklase pomoću ključne reči super", " Svaka klasa ima podrazumevani konstruktor", " Svaka klasa ima podrazumevani konstruktor", "");
        final QuestionsList question4 = new QuestionsList("Ako je u Javi klasa B izvedena iz klase A onda je istinit sledeći iskaz:", " Na mestu gde se očekuje instanca klase A može se pojaviti instanca klase B", " Na mestu gde se očekuje instanca klase B može se pojaviti instanca klase A"," Klasa je obavezno apstraktna"," Svaka instanca klase B sadrži jednu istu zajedničku instancu klase A", " Na mestu gde se očekuje instanca klase A može se pojaviti instanca klase B", "" );
        final QuestionsList question5 = new QuestionsList("Kako započeti pisanje while petlje u Javi?", "while x > y:", "x > y while {", "while (x > y)", "while x > y {", "while (x > y)", "");
        final QuestionsList question6 = new QuestionsList(" Izuzetak u Javi može biti uhvaćen:", " Samo u metodi u kojoj je bačen", " U bilo kojoj metodi klase kojoj pripada i metoda iz koje je izuzetak bačen", " U bilo kojoj metodi u programu", " U bilo kojoj metodi na steku poziva"," U bilo kojoj metodi na steku poziva","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    private static List<QuestionsList> phpQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Kojim granicama su okružene PHP skripte?", "<script>...</script> ", "<&>...</&>", "<?php...?>", "<?php>...</?>", "<?php...?>", "");
        final QuestionsList question2 = new QuestionsList("Koji je ispravan način da se završi PHP iskaz?", "</php>", "New line", ";",".", ";","");
        final QuestionsList question3 = new QuestionsList("Koji je ispravana način za uključivanje dadoteke time.inc", "<?php include file=\"time.inc\"; ?>", "<?php include:\"time.inc\"; ?>", "<!-- include file=\"time.inc\" -->", "<?php include \"time.inc\"; ?>", "<?php include time.inc; ?>", "");
        final QuestionsList question4 = new QuestionsList("Kako dodati 1 promenljivoj count?", "$count++;", "count++;", "$count =+1", "++count", "$count++;", "");
        final QuestionsList question5 = new QuestionsList("Kako se u PHP-u dodaju komentari?", "<comment>...</comment>", "*\\...\\*", "/*...*/", "<!--...-->", "/*...*/", "");
        final QuestionsList question6 = new QuestionsList( "Koji operator se koristi za proveru da li su dve vrednosti jednake i istog tipa podataka?", "==", "=", "===", "!=", "===", "");



        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }


    private static List<QuestionsList> htmlQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question3 = new QuestionsList("Šta znači HTML?", "Hyperlinks and Text Markup Language", "Home Tool Markup Language", "Hyper Text Markup Language", "High Text Markup Language", "Hyper Text Markup Language","");
        final QuestionsList question1 = new QuestionsList("Izaberi tačan HTML element za najveći naslov:","<h1>", "<h6>", "heading", "head", "<h1>", "");
        final QuestionsList question2 = new QuestionsList("Koji je tačan HTML za pravljenje padajuće liste", "<list>", "<input type=list>", "<input type=dropdown>", "<select>", "<select>", "");
        final QuestionsList question4 = new QuestionsList("Kako napraviti numerisanu listu?", "<ol>", "<dl>", "<list>", "<ul>", "<ol>", "");
        final QuestionsList question5 = new QuestionsList("U HTML-u koji se atribut koristi da odredi da polje za unos mora biti popunjeno?", "validate", "required", "placeholder", "formvalidate", "required", "");
        final QuestionsList question6 = new QuestionsList("Koji od ovih elemenata su svi elementi <table>?", "<table><head><tfoot>", "<table><tr><tt>", "<table><tr><td>", "<thead><body><tr>", "<table><tr><td>", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }



    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("sajk", "a", "a", "h", "l", "l", "");
        final QuestionsList question2 = new QuestionsList("a", "b", "v", "g", "bb","g","");
        final QuestionsList question3 = new QuestionsList("a", "b", "v", "g", "bb","v","");
        final QuestionsList question4 = new QuestionsList("a", "b", "v", "g", "bb","a","");
        final QuestionsList question5 = new QuestionsList("a", "b", "v", "g", "bb","b","");
        final QuestionsList question6 = new QuestionsList("a", "b", "v", "g", "bb","bb","");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;


    }



    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}
