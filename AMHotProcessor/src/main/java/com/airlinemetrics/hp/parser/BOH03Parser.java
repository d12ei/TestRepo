package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBoh03;
import java.util.HashMap;
import java.util.Map;

public class BOH03Parser extends AbstractParser {

    @Override
    public TpBoh03 parse(String line) {
        TpBoh03 tpBoh03 = new TpBoh03();
        return tpBoh03;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
