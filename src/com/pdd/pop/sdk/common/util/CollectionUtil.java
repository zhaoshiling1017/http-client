package com.pdd.pop.sdk.common.util;

import java.util.Collection;
import java.util.Map;

public class CollectionUtil {

    public static boolean isEmpty(Map<?, ?> map) {
        return (map == null || map.isEmpty());
    }

    public static boolean isEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty());
    }
}
