package com.airlinemetrics.hp.factory;

import com.airlinemetrics.hp.parser.AbstractParser;
import com.airlinemetrics.hp.parser.BKS24Parser;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class RecordParserFactory {

    @SuppressWarnings("rawtypes")
    private final Map<Class, Object> recordParserMap;

    private static final RecordParserFactory recordParserFactory;

    static {
        recordParserFactory = new RecordParserFactory();
    }

    public RecordParserFactory() {
        recordParserMap = new HashMap<>();
    }

    public static RecordParserFactory INSTANCE() {
        return recordParserFactory;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <T, X extends T> X getRecordParser(Class<T> c) {
        try {
            X record = (X) recordParserMap.get(c);
            if (record == null) {
                System.out.println("CREATE : " + c.getSimpleName());
                Class _clazz = Class.forName(PACKAGE_PATH + c.getSimpleName());
                Constructor<T> constructor = _clazz.getDeclaredConstructor();
                constructor.setAccessible(true);
                record = (X) constructor.newInstance();
                recordParserMap.put(c, record);
            } else {
                System.err.println(c.getSimpleName() + "\talready exists!...Re-using Record.");
            }
            return record;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        for (int x = 0; x < 2; x++) {
            AbstractParser r = RecordParserFactory.INSTANCE().getRecordParser(BKS24Parser.class);
            System.out.println("_______________________");
            System.out.println("RECORD PARSER NAME : " + r.getClass().getSimpleName());
        }
    }
    private static final String PACKAGE_PATH = "com.airlinemetrics.hp.parser.";
}
