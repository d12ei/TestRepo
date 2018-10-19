package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks39;
import java.util.HashMap;
import java.util.Map;

public class BKS39Parser extends AbstractParser {

    @Override
    public TpBks39 parse(String line) {
        TpBks39 tpBks39 = new TpBks39();
        return tpBks39;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
