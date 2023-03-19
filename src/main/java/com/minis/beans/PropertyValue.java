package com.minis.beans;

public class PropertyValue {
    private final String type;
    private final String name;
    private final Object value;

    public PropertyValue(String type, String name, Object value) {
        this.type = type;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {

        return value;
    }

    public String getType() {
        return type;
    }
}
