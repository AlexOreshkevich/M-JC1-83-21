package by.academy.jc.shorokhov.ht4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TagTest {
    Tag test = new Tag();
    @Test
    public void shouldExtractContent() {
        assertEquals("Nayeem loves counseling", test.TagOff("<h1>Nayeem loves counseling</h1>"));}
    @Test
    public void shouldExtractContent1() {
        assertEquals("Sanjay has no watch", test.TagOff("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>"));}
    @Test
    public void shouldExtractContent2() {
        assertEquals("None", test.TagOff("<Amee>safat codes like a ninja</amee>"));}
    @Test
    public void shouldExtractContent3() {
        assertEquals("Imtiaz has a secret crash", test.TagOff("<SA premium>Imtiaz has a secret crash</SA premium>"));}
    @Test
    public void shouldExtractContent4() {
        assertEquals("some", test.TagOff("<h1>some</h1>"));}
    @Test
    public void shouldExtractContent5() {
        assertEquals("public", test.TagOff("<h1>had<h1>public</h1></h1>"));}
    @Test
    public void shouldExtractContent6() {
        assertEquals("None", test.TagOff("<h1>had<h1>public</h1515></h1>"));}
    @Test
    public void shouldExtractContent7() {
        assertEquals("None", test.TagOff("<h1><h1></h1></h1>"));}
    @Test
    public void shouldExtractContent8() {
        assertEquals("None", test.TagOff("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"));}
    @Test
    public void shouldExtractContent9() {
        assertEquals("None", test.TagOff(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"));}
    @Test
    public void shouldExtractContent10() {
        assertEquals("None", test.TagOff("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>"));}
    @Test
    public void shouldExtractContent11() {
        assertEquals("None", test.TagOff("<>hello</>"));}
    @Test
    public void shouldExtractContent12() {
        assertEquals("dim", test.TagOff("<>hello</><h>dim</h>"));}
    @Test
    public void shouldExtractContent13() {
        assertEquals("dim", test.TagOff("<>hello</><h>dim</h>>>>>"));}
}