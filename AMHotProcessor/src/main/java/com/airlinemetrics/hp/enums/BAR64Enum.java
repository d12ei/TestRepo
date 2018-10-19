package com.airlinemetrics.hp.enums;

public enum BAR64Enum {
    TicketHeadId("TicketHeadId") {
        @Override
        public String toString() {
            return "TicketHeadId";
        }
    },
    FARE("FARE") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TKMI("TKMI") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    EQFR("EQFR") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TAXA1("TAXA1") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TAXA2("TAXA2") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TAXA3("TAXA3") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TOTL("TOTL") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    NTSI("NTSI") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    SASI("SASI") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    FCMI("FCMI") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    BAID("BAID") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    BOON("BOON") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    BEOT("BEOT") {
        @Override
        public String toString() {
            return super.toString();
        }
    },
    FCPI("FCPI") {
        @Override
        public String toString() {
            return super.toString();
        }
    },;

    BAR64Enum(String field) {
        this.field = field;
    }

    private String field = "";

    public String getField() {
        return this.field;
    }
}
