package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBot94;
import java.util.HashMap;
import java.util.Map;

public class BOT94Parser extends AbstractParser {

    @Override
    public TpBot94 parse(String line) {
        TpBot94 tpBot94 = new TpBot94();
        return tpBot94;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
