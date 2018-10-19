package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks24;
import java.util.HashMap;
import java.util.Map;

public class BKS24Parser extends AbstractParser {

    @Override
    public TpBks24 parse(String line) {
        TpBks24 tpBks24 = new TpBks24();
        return tpBks24;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
