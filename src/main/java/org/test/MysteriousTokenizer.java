package org.test;

import java.util.Collection;

/**
 * This interface describes Tokenizer concept: it takes text in, and splits it into tokens - individual worlds.
 * And the best part of it - it magically works on any language and domain. Probably another ArtificialIntellligenceInstance sample works here.
 */
public interface MysteriousTokenizer {
    /**
     * This method splits given text into individual words
     * @param text
     * @return
     */
    Collection<String> tokenize(String text);
}
