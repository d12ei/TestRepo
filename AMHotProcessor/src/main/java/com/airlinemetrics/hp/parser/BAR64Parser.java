package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBar64;
import java.util.HashMap;
import java.util.Map;

public class BAR64Parser extends AbstractParser {

    @Override
    public TpBar64 parse(String line) {
        TpBar64 tpBar64 = new TpBar64();
        return tpBar64;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
