package com.pdd.pop.sdk.common.constant;

import java.nio.charset.Charset;

/**
 * @author xuanli
 * @Description: PddCharset
 * @date 2018/12/2 16:13
 */
public interface PddCharset {
    /**
     * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the
     * Unicode character set
     */
    Charset US_ASCII = Charset.forName("US-ASCII");
    /**
     * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1
     */
    Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    /**
     * Eight-bit UCS Transformation Format
     */
    Charset UTF_8 = Charset.forName(Constants.CHARSET_UTF8);
}
