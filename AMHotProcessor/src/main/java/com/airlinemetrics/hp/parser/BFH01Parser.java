package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBfh01;
import java.util.HashMap;
import java.util.Map;

public class BFH01Parser extends AbstractParser {

    @Override
    public TpBfh01 parse(String line) {
        TpBfh01 tpBfh01 = new TpBfh01();
        return tpBfh01;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
