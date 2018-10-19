package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmp73;
import java.util.HashMap;
import java.util.Map;

public class BMP73Parser extends AbstractParser {

    @Override
    public TpBmp73 parse(String line) {
        TpBmp73 tpBmp73 = new TpBmp73();
        return tpBmp73;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
