package by.academy.jc.klimakhovich_ht4;

import org.junit.jupiter.api.Test;

public class ParserTest {

    @Test
    public void test1() {

        Parser.stringTagFinder("<h1>Nayeem loves counseling </h1>");
        Parser.stringTagFinder("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        Parser.stringTagFinder("<Amee>safat codes like a ninja</amee>");
        Parser.stringTagFinder("<SA premium>Imtiaz has a secret crush</SA premium>");

    }

    @Test
    public void test2() {

        Parser.stringTagFinder("<h1>some</h1>");
        Parser.stringTagFinder("<h1>had<h1>public</h1></h1>");
        Parser.stringTagFinder("<h1>had<h1>public</h1515></h1>");
        Parser.stringTagFinder("<h1><h1></h1></h1>");
        Parser.stringTagFinder("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Parser.stringTagFinder(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Parser.stringTagFinder("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>");
        Parser.stringTagFinder("<>hello</>");
        Parser.stringTagFinder("<>hello</><h>dim</h>");
        Parser.stringTagFinder("<>hello</><h>dim</h>>>>>");
    }
}