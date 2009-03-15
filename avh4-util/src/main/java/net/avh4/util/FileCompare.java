package net.avh4.util;

import java.io.File;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class FileCompare
{
    public static boolean match(File a, File b)
    {
        if (a.length() != b.length())
        {
            return false;
        }
        return true;
    }
}
