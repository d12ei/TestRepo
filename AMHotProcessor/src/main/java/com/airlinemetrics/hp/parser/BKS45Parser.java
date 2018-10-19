package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBks45;
import java.util.HashMap;
import java.util.Map;

public class BKS45Parser extends AbstractParser {

    @Override
    public TpBks45 parse(String line) {
        TpBks45 tpBks45 = new TpBks45();
        return tpBks45;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
