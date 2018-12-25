package com.pdd.pop.ext.fasterxml.jackson.core.json;

import com.pdd.pop.ext.fasterxml.jackson.core.Version;
import com.pdd.pop.ext.fasterxml.jackson.core.Versioned;
import com.pdd.pop.ext.fasterxml.jackson.core.util.VersionUtil;

/**
 * Automatically generated from PackageVersion.java.in during
 * packageVersion-generate execution of maven-replacer-plugin in
 * pom.xml.
 */
public final class PackageVersion implements Versioned {
    public final static Version VERSION = VersionUtil.parseVersion(
        "2.9.6", "com.pdd.pop.ext.fasterxml.jackson.core", "jackson-core");

    @Override
    public Version version() {
        return VERSION;
    }
}
