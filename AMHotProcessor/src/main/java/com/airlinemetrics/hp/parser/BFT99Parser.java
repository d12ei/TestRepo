package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBft99;
import java.util.HashMap;
import java.util.Map;

public class BFT99Parser extends AbstractParser {

    @Override
    public TpBft99 parse(String line) {
        TpBft99 tpBft99 = new TpBft99();
        return tpBft99;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
