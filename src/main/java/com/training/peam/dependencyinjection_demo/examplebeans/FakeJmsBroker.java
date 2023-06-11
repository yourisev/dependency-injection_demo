package com.training.peam.dependencyinjection_demo.examplebeans;

public class FakeJmsBroker {

    private String jmsUserName;
    private String jmsPassword;
    private String jms_Url;

    public String getJmsUserName() {
        return jmsUserName;
    }

    public void setJmsUserName(String jmsUserName) {
        this.jmsUserName = jmsUserName;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJms_Url() {
        return jms_Url;
    }

    public void setJms_Url(String jms_Url) {
        this.jms_Url = jms_Url;
    }
}
