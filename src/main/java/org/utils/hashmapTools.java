package org.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class hashmapTools {
    public static <K, V> HashMap<K, V> reverse(HashMap<K, V> inputMap){
        return (HashMap<K, V>) inputMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getValue,
                        Map.Entry::getKey,
                        (existing, replacement) -> existing
                ));
    }
}
