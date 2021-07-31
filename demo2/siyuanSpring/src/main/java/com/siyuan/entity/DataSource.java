package com.siyuan.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "ds")
@Data
public class DataSource {
    private String user;
    private String password;
    private String url;
    private String driverName;
}
