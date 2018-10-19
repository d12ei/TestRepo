package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmp74;
import java.util.HashMap;
import java.util.Map;

public class BMP74Parser extends AbstractParser<TpBmp74> {

    @Override
    public TpBmp74 parse(String line) {
        TpBmp74 tpBmp74 = new TpBmp74();
        return tpBmp74;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
