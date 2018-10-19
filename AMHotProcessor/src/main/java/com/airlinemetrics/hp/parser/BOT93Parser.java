package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBot93;
import java.util.HashMap;
import java.util.Map;

public class BOT93Parser extends AbstractParser {

    @Override
    public TpBot93 parse(String line) {
        TpBot93 tpBot93 = new TpBot93();
        return tpBot93;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
