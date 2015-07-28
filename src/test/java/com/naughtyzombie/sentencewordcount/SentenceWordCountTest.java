package com.naughtyzombie.sentencewordcount;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by pram on 28/07/2015.
 */
public class SentenceWordCountTest {

    @Test
    public void testCount() throws Exception {
        SentenceWordCount swc = new SentenceWordCount();
        Map count = swc.count("This is a test");
        assertNotNull(count);
        assertEquals(count.keySet().size(), 4);
    }
}