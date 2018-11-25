package com.QEcode.OA.common.pojo;

public class Config {
    Long id;
    String configName;
    String configValue;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getConfigName() {
        return configName;
    }
    public void setConfigName(String configName) {
        this.configName = configName;
    }
    public String getConfigValue() {
        return configValue;
    }
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
    public Config(String configName, String configValue) {
	super();
	this.configName = configName;
	this.configValue = configValue;
    }
    
}
