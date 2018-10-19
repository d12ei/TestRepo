package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBkp83;
import java.util.HashMap;
import java.util.Map;

public class BKP83Parser extends AbstractParser {

    @Override
    public TpBkp83 parse(String line) {
        TpBkp83 tpBkp83 = new TpBkp83();
        return tpBkp83;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
