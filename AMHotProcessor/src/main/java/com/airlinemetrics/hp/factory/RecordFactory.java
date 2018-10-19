package com.airlinemetrics.hp.factory;

import com.airlinemetrics.hp.record.AbstractRecord;
import com.airlinemetrics.hp.record.BCT95;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class RecordFactory {

    @SuppressWarnings("rawtypes")
    private final Map<Class, Object> recordMap;

    private static final RecordFactory recordFactory;

    static {
        recordFactory = new RecordFactory();
    }

    public RecordFactory() {
        recordMap = new HashMap<>();
    }

    public static RecordFactory INSTANCE() {
        return recordFactory;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <T, X extends T> X getRecord(Class<T> c) {
        try {
            X record = (X) recordMap.get(c);
            if (record == null) {
                System.out.println("CREATE : " + c.getSimpleName());
                Class _clazz = Class.forName(PACKAGE_PATH + c.getSimpleName());
                Constructor<T> constructor = _clazz.getDeclaredConstructor();
                constructor.setAccessible(true);
                record = (X) constructor.newInstance();
                recordMap.put(c, record);
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
            AbstractRecord r = RecordFactory.INSTANCE().getRecord(BCT95.class);
            System.out.println("_______________________");
            System.out.println("RECORD NAME : " + r.getClass().getSimpleName());
        }
    }
    private static final String PACKAGE_PATH = "com.airlinemetrics.hp.record.";
}
