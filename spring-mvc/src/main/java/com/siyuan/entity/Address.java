package com.siyuan.entity;

public class Address {
    private String value;
    private Integer code;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                ", code=" + code +
                '}';
    }
}
