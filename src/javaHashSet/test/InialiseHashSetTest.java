package javaHashSet.test;

import javaHashSet.InialiseHashSet;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class InialiseHashSetTest {
    @org.junit.Test

    public void inialiseHashSetTestOne()  throws Exception {
        List myList =  Arrays.asList("Hello","Guten tag","Akwaba");
        HashSet myhash = new HashSet(myList);
        MatcherAssert.assertThat(InialiseHashSet.appendElement(myList), is(myhash));
    }
}
