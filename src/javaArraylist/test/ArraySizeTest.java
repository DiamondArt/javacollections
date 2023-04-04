package javaArraylist.test;

import javaArraylist.ArraySize;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySizeTest {
    @org.junit.Test
    public void arraySizeTestOne() throws Exception{

        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello","Hi","Blabla","Love","Nice"));

        Assert.assertEquals(ArraySize.arraySize(stringArray),5 );
    }

}
