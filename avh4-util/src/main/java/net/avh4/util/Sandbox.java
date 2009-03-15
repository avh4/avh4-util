package net.avh4.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Aaron VonderHaar < gruen0aermel@gmail.com >
 */
public class Sandbox
{
    private final File file;

    public Sandbox() throws IOException
    {
        file = new File("./tmp");
        FileUtils.deleteDirectory(file);
        assert !file.exists();
        file.mkdir();
    }

    public File getRoot()
    {
        return file;
    }

    public String getAbsolutePath()
    {
        return file.getAbsolutePath();
    }

    public File getFile(String path)
    {
        final String absolutePath = file.getAbsolutePath() + "/" + path;
        final File folder = new File(absolutePath);
        return folder;
    }
}
