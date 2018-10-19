package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks31;
import java.util.HashMap;
import java.util.Map;

public class BKS31Parser extends AbstractParser {

    @Override
    public TpBks31 parse(String line) {
        TpBks31 tpBks31 = new TpBks31();
        return tpBks31;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
