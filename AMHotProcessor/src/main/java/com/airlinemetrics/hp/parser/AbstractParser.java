package com.airlinemetrics.hp.parser;

import java.util.Map;

public abstract class AbstractParser<T> {

    public abstract <T> T parse(String line);

    public abstract Map<String, String> getFields();
}
