package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks47;
import java.util.HashMap;
import java.util.Map;

public class BKS47Parser extends AbstractParser {

    @Override
    public TpBks47 parse(String line) {
        TpBks47 tpBks47 = new TpBks47();
        return tpBks47;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
