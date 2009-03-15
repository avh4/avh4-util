package net.avh4.util;

import net.avh4.util.*;
import java.io.File;
import java.net.URISyntaxException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class FileCompareTest
{
    @Test
    public void testMatchIdentical() throws URISyntaxException
    {
        File a = TestUtils.getFile("a.txt");
        File b = TestUtils.getFile("copy of a.txt");

        assertTrue(FileCompare.match(a, b));
    }

    @Test
    public void testMatchDifferent() throws URISyntaxException
    {
        File a = TestUtils.getFile("a.txt");
        File b = TestUtils.getFile("b.txt");

        assertFalse(FileCompare.match(a, b));
    }
}