package com.jiawa.wiki.domain;

public class Template_details {
    private int id;
    private int template_sn;
    private String template_name;
    private String template_content;
    private String template_create_account;
    private int is_delete;
    private int is_private;
    private String create_time;
    private String update_time;

    public int getId() {
        return id;
    }

    public int getTemplate_sn() {
        return template_sn;
    }

    public String getTemplate_content() {
        return template_content;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTemplate_content(String template_content) {
        this.template_content = template_content;
    }

    public void setTemplate_sn(int template_sn) {
        this.template_sn = template_sn;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

    public String getTemplate_create_account() {
        return template_create_account;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public int getIs_private() {
        return is_private;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setTemplate_create_account(String template_create_account) {
        this.template_create_account = template_create_account;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setIs_private(int is_private) {
        this.is_private = is_private;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

}
