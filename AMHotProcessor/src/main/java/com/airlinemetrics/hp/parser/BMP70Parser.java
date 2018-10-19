package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmp70;
import java.util.HashMap;
import java.util.Map;

public class BMP70Parser extends AbstractParser {

    @Override
    public TpBmp70 parse(String line) {
        TpBmp70 tpBmp70 = new TpBmp70();
        return tpBmp70;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
