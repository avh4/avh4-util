package net.avh4.util.a;

import net.avh4.util.*;
import java.io.File;
import java.net.URISyntaxException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This test class must be in a different package from TestUtils to ensure that
 * TestUtils.getFile() functions properly regardless of the package that the
 * calling class is in.
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class TestUtilsTest
{
    @Test
    public void testGetFileFromADifferentPackage() throws URISyntaxException
    {
        File actual = TestUtils.getFile("a.txt");
        File expected = new File(getClass().getResource("a.txt").toURI());

        assertEquals(expected, actual);
    }
}