package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks46;
import java.util.HashMap;
import java.util.Map;

public class BKS46Parser extends AbstractParser {

    @Override
    public TpBks46 parse(String line) {
        TpBks46 tpBks46 = new TpBks46();
        return tpBks46;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
