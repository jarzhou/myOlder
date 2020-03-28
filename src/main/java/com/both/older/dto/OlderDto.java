package com.both.older.dto;

import java.util.Date;

public class OlderDto {
    private String older_id;

    private String older_name;
    // 姓名
    private Date birthday;
    //出生日期：
    private String older_phone;
    //联系方式
    private String older_password;
    //密码
    private String family;
    //亲属
    private String family_phone;
    //char，亲属手机
    private String older_address;
    // char，家庭住址
    private String group_id;
    //int,分组：
    private Date checkin_date;
    //date,入住时间：
    private Date leave_date;
    //date,离开时间：

    public String getOlder_id() {
        return older_id;
    }

    public void setOlder_id(String older_id) {
        this.older_id = older_id;
    }

    public String getOlder_name() {
        return older_name;
    }

    public void setOlder_name(String older_name) {
        this.older_name = older_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOlder_phone() {
        return older_phone;
    }

    public void setOlder_phone(String older_phone) {
        this.older_phone = older_phone;
    }

    public String getOlder_password() {
        return older_password;
    }

    public void setOlder_password(String older_password) {
        this.older_password = older_password;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily_phone() {
        return family_phone;
    }

    public void setFamily_phone(String family_phone) {
        this.family_phone = family_phone;
    }

    public String getOlder_address() {
        return older_address;
    }

    public void setOlder_address(String older_address) {
        this.older_address = older_address;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public Date getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(Date checkin_date) {
        this.checkin_date = checkin_date;
    }

    public Date getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(Date leave_date) {
        this.leave_date = leave_date;
    }
}
