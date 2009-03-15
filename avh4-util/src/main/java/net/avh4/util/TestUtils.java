package net.avh4.util;

import java.io.File;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class TestUtils
{
    /**
     * Gets a File from the package of the calling class.
     */
    public static File getFile(String filename)
    {
        Class callingClass = HelperUtils.getCallingClass();
        try
        {
            return new File(callingClass.getResource(filename).toURI());
        } catch (URISyntaxException ex)
        {
            Logger.getLogger(TestUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
