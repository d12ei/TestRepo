package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks30;
import java.util.HashMap;
import java.util.Map;

public class BKS30Parser extends AbstractParser {

    @Override
    public TpBks30 parse(String line) {
        TpBks30 tpBks30 = new TpBks30();
        return tpBks30;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
