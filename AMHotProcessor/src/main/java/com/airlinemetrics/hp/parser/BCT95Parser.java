package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBct95;
import java.util.HashMap;
import java.util.Map;

public class BCT95Parser extends AbstractParser {

    @Override
    public TpBct95 parse(String line) {
        TpBct95 tpBct95 = new TpBct95();
        return tpBct95;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
