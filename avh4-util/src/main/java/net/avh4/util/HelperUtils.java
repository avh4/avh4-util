package net.avh4.util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
class HelperUtils
{
    public static Class getCallingClass()
    {
        StackTraceElement es[] = Thread.currentThread().getStackTrace();
        StackTraceElement e = es[4];
        try
        {
            Class clazz = Class.forName(e.getClassName());
            return clazz;
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(HelperUtils.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
