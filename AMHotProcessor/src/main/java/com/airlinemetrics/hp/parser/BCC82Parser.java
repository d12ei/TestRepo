package com.airlinemetrics.hp.parser;

import com.airlinemetrics.record.model.TpBcc82;
import java.util.HashMap;
import java.util.Map;

public class BCC82Parser extends AbstractParser {

    @Override
    public TpBcc82 parse(String line) {
        TpBcc82 tpBcc82 = new TpBcc82();
        return tpBcc82;
    }

    @Override
    public Map getFields() {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
