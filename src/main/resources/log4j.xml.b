<?xml version="1.0" encoding="UTF-8"?>
<!--

    Copyright (c) 2012-2013, Yunnan Yuan Xin technology Co., Ltd.

    All rights reserved.

-->

<!--
    Description: 日志配置。
    Version: 1.0.0.0, Sep 6, 2013
    Author: Liang Ding
-->
<!DOCTYPE log4j:configuration PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "log4j.dtd">
<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">

    <!-- Appenders -->
    <appender name="console" class="org.apache.log4j.ConsoleAppender">
        <param name="Target" value="System.out" />
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="[%-5p]-[%d{yyyy-MM-dd HH:mm:ss}]-[%c:%L] %m%n" />
        </layout>
    </appender>
	
    <!-- Application Loggers -->
    <logger name="com.yuanxin.app.apptrssearch">
        <level value="info" />
    </logger>
    
    <logger name="com.trs">
        <level value="info" />
    </logger>
	
    <!-- 3rdparty Loggers -->
    <logger name="org.springframework">
        <level value="info" />
    </logger>

    <!-- Root Logger -->
    <root>
        <priority value="info" />
        <appender-ref ref="console" />
    </root>
	
</log4j:configuration>
