package javaHashSet.test;

import javaHashSet.IsEmptyHashSet;
import org.junit.Assert;

import java.util.Arrays;
import java.util.HashSet;

public class IsEmptyHashSetTest {
    @org.junit.Test
    public void isEmptyHashSetTestOne() throws Exception {

        HashSet hashSet = new HashSet<>(Arrays.asList(2,"Hello world",45));
        boolean emptyHash = false;
        boolean result = IsEmptyHashSet.isEmptyHashSet(hashSet);
        Assert.assertEquals(emptyHash, result);
    }

    @org.junit.Test
    public void isEmptyHashSetTestTwo() throws Exception {

        HashSet hashSet = new HashSet<>();
        boolean emptyHash = true;
        boolean result = IsEmptyHashSet.isEmptyHashSet(hashSet);
        Assert.assertEquals(emptyHash, result);
    }
}
