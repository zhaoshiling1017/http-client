package com.pdd.pop.ext.fasterxml.jackson.core.util;

import java.io.Serializable;

/**
 * Value class used with some {@link com.pdd.pop.ext.fasterxml.jackson.core.PrettyPrinter}
 * implements
 *
 * @see com.pdd.pop.ext.fasterxml.jackson.core.util.DefaultPrettyPrinter
 * @see com.pdd.pop.ext.fasterxml.jackson.core.util.MinimalPrettyPrinter
 * 
 * @since 2.9
 */
public class Separators implements Serializable
{
    private static final long serialVersionUID = 1;

    private final char objectFieldValueSeparator;
    private final char objectEntrySeparator;
    private final char arrayValueSeparator;

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public Separators() {
        this(':', ',', ',');
    }

    public Separators(char objectFieldValueSeparator,
            char objectEntrySeparator, char arrayValueSeparator) {
        this.objectFieldValueSeparator = objectFieldValueSeparator;
        this.objectEntrySeparator = objectEntrySeparator;
        this.arrayValueSeparator = arrayValueSeparator;
    }
    
    public Separators withObjectFieldValueSeparator(char sep) {
        return (objectFieldValueSeparator == sep) ? this
                : new Separators(sep, objectEntrySeparator, arrayValueSeparator);
    }

    public Separators withObjectEntrySeparator(char sep) {
        return (objectEntrySeparator == sep) ? this
                : new Separators(objectFieldValueSeparator, sep, arrayValueSeparator);
    }

    public Separators withArrayValueSeparator(char sep) {
        return (arrayValueSeparator == sep) ? this
                : new Separators(objectFieldValueSeparator, objectEntrySeparator, sep);
    }

    public char getObjectFieldValueSeparator() {
        return objectFieldValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return objectEntrySeparator;
    }

    public char getArrayValueSeparator() {
        return arrayValueSeparator;
    }
}
