package com.both.older.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OlderEntity {
    private String olderId;

    private String olderName;
    // 姓名
    private Date birthday;
    //出生日期：
    private String olderPhone;
    //联系方式
    private String olderPassword;
    //密码
    private String family;
    //亲属
    private String familyPhone;
    //char，亲属手机
    private String olderAddress;
    // char，家庭住址
    private String groupId;
    //int,分组：
    private Date checkinDate;
    //date,入住时间：
    private Date leaveDate;
    //date,离开时间：

    @Override
    public String toString() {
        return "OlderEntity{" +
                "olderId='" + olderId + '\'' +
                ", olderName='" + olderName + '\'' +
                ", birthday=" + birthday +
                ", olderPhone='" + olderPhone + '\'' +
                ", olderPassword='" + olderPassword + '\'' +
                ", family='" + family + '\'' +
                ", familyPhone='" + familyPhone + '\'' +
                ", olderAddress='" + olderAddress + '\'' +
                ", groupId='" + groupId + '\'' +
                ", checkinDate=" + checkinDate +
                ", leaveDate=" + leaveDate +
                '}';
    }

    public String getOlderId() {
        return olderId;
    }

    public void setOlderId(String olderId) {
        this.olderId = olderId;
    }

    public String getOlderName() {
        return olderName;
    }

    public void setOlderName(String olderName) {
        this.olderName = olderName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOlderPhone() {
        return olderPhone;
    }

    public void setOlderPhone(String olderPhone) {
        this.olderPhone = olderPhone;
    }

    public String getOlderPassword() {
        return olderPassword;
    }

    public void setOlderPassword(String olderPassword) {
        this.olderPassword = olderPassword;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }

    public String getOlderAddress() {
        return olderAddress;
    }

    public void setOlderAddress(String olderAddress) {
        this.olderAddress = olderAddress;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
}
