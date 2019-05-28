package com.wei.bo;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 *
 * @author
 */

public class User implements Serializable {
    /**
     * [主键]
     */
    private Integer userId;

    /**
     * [昵称]
     */
    private String nickname;

    /**
     * [性别]
     */
    private Short sex;

    /**
     * [手机]
     */
    private String account;

    /**
     * [密码]
     */
    private String password;

    /**
     * [住址]
     */
    private String address;

    /**
     * [地区编码]
     */
    private String areaCode;

    /**
     * [头像]
     */
    private String headImage;

    /**
     * [默认收货地址ID]
     */
    private Long locationId;

    /**
     * [认证状态]10：未认证，20：待审核，30：认证失败，40：认证通过
     */
    private Short authentication;

    /**
     * [设备TOKEN]消息推送
     */
    private String mobileToken;

    /**
     * [出生日期]
     */
    private Date birthDay;

    /**
     * [账户余额]单位：分
     */
    private Integer amount;

    /**
     * [支付密码]
     */
    private String payPassword;

    /**
     * [账号类型]10：顾客，20：网点配送员
     */
    private Short userType;

    /**
     * [禁用状态]10：正常，20：禁用
     */
    private Short valid;

    /**
     * [邮箱]
     */
    private String email;

    /**
     * [认证说明]
     */
    private String authenticationRemark;

    /**
     * [微信openId]
     */
    private String weixinOpenId;

    /**
     * [真实姓名]
     */
    private String realName;

    /**
     * [社区ID]
     */
    private Integer communityId;

    /**
     * [手机号]
     */
    private String mobile;

    /**
     * ID号
     */
    private String idNum;

    /**
     * 微信号
     */
    private String weixinNum;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public Short getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Short authentication) {
        this.authentication = authentication;
    }

    public String getMobileToken() {
        return mobileToken;
    }

    public void setMobileToken(String mobileToken) {
        this.mobileToken = mobileToken;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public Short getUserType() {
        return userType;
    }

    public void setUserType(Short userType) {
        this.userType = userType;
    }

    public Short getValid() {
        return valid;
    }

    public void setValid(Short valid) {
        this.valid = valid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthenticationRemark() {
        return authenticationRemark;
    }

    public void setAuthenticationRemark(String authenticationRemark) {
        this.authenticationRemark = authenticationRemark;
    }

    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getWeixinNum() {
        return weixinNum;
    }

    public void setWeixinNum(String weixinNum) {
        this.weixinNum = weixinNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
                && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
                && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
                && (this.getHeadImage() == null ? other.getHeadImage() == null : this.getHeadImage().equals(other.getHeadImage()))
                && (this.getLocationId() == null ? other.getLocationId() == null : this.getLocationId().equals(other.getLocationId()))
                && (this.getAuthentication() == null ? other.getAuthentication() == null : this.getAuthentication().equals(other.getAuthentication()))
                && (this.getMobileToken() == null ? other.getMobileToken() == null : this.getMobileToken().equals(other.getMobileToken()))
                && (this.getBirthDay() == null ? other.getBirthDay() == null : this.getBirthDay().equals(other.getBirthDay()))
                && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
                && (this.getPayPassword() == null ? other.getPayPassword() == null : this.getPayPassword().equals(other.getPayPassword()))
                && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
                && (this.getValid() == null ? other.getValid() == null : this.getValid().equals(other.getValid()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getAuthenticationRemark() == null ? other.getAuthenticationRemark() == null : this.getAuthenticationRemark().equals(other.getAuthenticationRemark()))
                && (this.getWeixinOpenId() == null ? other.getWeixinOpenId() == null : this.getWeixinOpenId().equals(other.getWeixinOpenId()))
                && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
                && (this.getCommunityId() == null ? other.getCommunityId() == null : this.getCommunityId().equals(other.getCommunityId()))
                && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
                && (this.getIdNum() == null ? other.getIdNum() == null : this.getIdNum().equals(other.getIdNum()))
                && (this.getWeixinNum() == null ? other.getWeixinNum() == null : this.getWeixinNum().equals(other.getWeixinNum()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getHeadImage() == null) ? 0 : getHeadImage().hashCode());
        result = prime * result + ((getLocationId() == null) ? 0 : getLocationId().hashCode());
        result = prime * result + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        result = prime * result + ((getMobileToken() == null) ? 0 : getMobileToken().hashCode());
        result = prime * result + ((getBirthDay() == null) ? 0 : getBirthDay().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPayPassword() == null) ? 0 : getPayPassword().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getValid() == null) ? 0 : getValid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAuthenticationRemark() == null) ? 0 : getAuthenticationRemark().hashCode());
        result = prime * result + ((getWeixinOpenId() == null) ? 0 : getWeixinOpenId().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getCommunityId() == null) ? 0 : getCommunityId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getIdNum() == null) ? 0 : getIdNum().hashCode());
        result = prime * result + ((getWeixinNum() == null) ? 0 : getWeixinNum().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", nickname=").append(nickname);
        sb.append(", sex=").append(sex);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", address=").append(address);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", headImage=").append(headImage);
        sb.append(", locationId=").append(locationId);
        sb.append(", authentication=").append(authentication);
        sb.append(", mobileToken=").append(mobileToken);
        sb.append(", birthDay=").append(birthDay);
        sb.append(", amount=").append(amount);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", userType=").append(userType);
        sb.append(", valid=").append(valid);
        sb.append(", email=").append(email);
        sb.append(", authenticationRemark=").append(authenticationRemark);
        sb.append(", weixinOpenId=").append(weixinOpenId);
        sb.append(", realName=").append(realName);
        sb.append(", communityId=").append(communityId);
        sb.append(", mobile=").append(mobile);
        sb.append(", idNum=").append(idNum);
        sb.append(", weixinNum=").append(weixinNum);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}