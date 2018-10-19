package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBar66;
import java.util.HashMap;
import java.util.Map;

public class BAR66Parser extends AbstractParser {

    @Override
    public TpBar66 parse(String line) {
        TpBar66 tpBar66 = new TpBar66();
        return tpBar66;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
