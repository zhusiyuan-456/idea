package com.siyuan.entity;

import com.siyuan.myinterface.myInterface;
import com.siyuan.myinterface.myiml.myImplement1;
import com.siyuan.myinterface.myiml.myImplement2;
import lombok.Data;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Data
@Component (value = "hello")
public class repository {
@Autowired
@Qualifier(value = "ds")
private DataSource dataSource;
@Autowired
@Qualifier(value = "myImplement2")
private myImplement2 myInterface1;
@Autowired
@Qualifier(value = "myImplement1")
private myImplement1 myInterface2;

}
