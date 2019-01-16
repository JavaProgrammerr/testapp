package org.test;

import java.util.Iterator;

/**
 * This iterator interface describe usual iterator with some additional functionality:
 * 1) implementation can be reset and reused
 * 2) implementation can apply shuffle upon reset
 */
public interface ShufflingIterator<T> extends Iterator<T> {

    /**
     * This method checks, if shuffle is allowed for this iterator instance
     * @return TRUE if allowed, FALSE otherwise
     */
    boolean isShuffleAllowed();

    /**
     * This method allows user to enable/disable shuffle upon reset
     * @param reallyAllow
     */
    void allowShuffle(boolean reallyAllow);

    /**
     * This method returns random seed used within this iterator
     * @return long value
     */
    long getSeed();

    /**
     * This method allows to set random seed, which will be used within this iterator, to provide reproducibility.
     * @param seed
     */
    void setSeed(long seed);

    /**
     * This method "resets" current position within iterator to 0, and user can roll through iterator once again
     *
     * PLEASE NOTE: If shuffle mode is allowed, order of elements coming out of this iterator will be different
     */
    void reset();
}
