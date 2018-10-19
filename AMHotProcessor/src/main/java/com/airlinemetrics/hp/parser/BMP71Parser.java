package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBmp71;
import java.util.HashMap;
import java.util.Map;

public class BMP71Parser extends AbstractParser {

    @Override
    public TpBmp71 parse(String line) {
        TpBmp71 tpBmp71 = new TpBmp71();
        return tpBmp71;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
