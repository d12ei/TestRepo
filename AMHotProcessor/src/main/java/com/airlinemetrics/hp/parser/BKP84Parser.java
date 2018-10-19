package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBkp84;
import java.util.HashMap;
import java.util.Map;

public class BKP84Parser extends AbstractParser {

    @Override
    public TpBkp84 parse(String line) {
        TpBkp84 tpBkp84 = new TpBkp84();
        return tpBkp84;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
