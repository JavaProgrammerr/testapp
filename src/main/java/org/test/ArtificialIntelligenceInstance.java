package org.test;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * This interface describes wrapper of smart Artificial Intelligence sample, which is able to take images in, and return their categories out
 */
public interface ArtificialIntelligenceInstance {

    /**
     * This method returns all categories known to this A.I. sample
     * @return
     */
    String[] knownCategories();

    /**
     * This method returns which category A.I. think was on image
     * @param image - image object to be classified
     * @return
     */
    String defineCategory(Image image);


    /**
     * This method saves invaluable state if the A.I. to the specified file
     * @param file
     * @throws IOException
     */
    void brainDump(File file) throws IOException;
}
