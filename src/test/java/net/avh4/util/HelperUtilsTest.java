package net.avh4.util;

import net.avh4.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class HelperUtilsTest
{

    private static class CallProxy
    {
        public static Class callHelperUtils()
        {
            return HelperUtils.getCallingClass();
        }
    }

    @Test
    public void testGetCallingClass()
    {
        Class expected = getClass();
        Class actual = CallProxy.callHelperUtils();

        assertEquals(expected, actual);
    }
}