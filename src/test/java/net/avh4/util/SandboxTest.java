package net.avh4.util;

import net.avh4.util.*;
import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class SandboxTest
{
    @Test
    public void testSandboxExists() throws IOException
    {
        Sandbox b = new Sandbox();

        assertTrue(b.getRoot().exists());
    }

    @Test
    public void testSandboxIsEmpty() throws IOException
    {
        Sandbox b = new Sandbox();

        assertEquals(0, b.getRoot().listFiles().length);
    }

    @Test
    public void testGetFile() throws IOException
    {
        Sandbox b = new Sandbox();

        File expected = new File(b.getAbsolutePath() + "/" + "a.txt");
        File actual = b.getFile("a.txt");

        assertEquals(expected, actual);
    }
}