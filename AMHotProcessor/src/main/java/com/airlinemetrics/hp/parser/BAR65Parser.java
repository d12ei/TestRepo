package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBar65;
import java.util.HashMap;
import java.util.Map;

public class BAR65Parser extends AbstractParser {

    @Override
    public TpBar65 parse(String line) {
        TpBar65 tpBar65 = new TpBar65();
        return tpBar65;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
