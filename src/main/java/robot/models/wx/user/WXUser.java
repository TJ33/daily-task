package robot.models.wx.user;

import robot.models.wx.support.Medal;

import java.util.List;

public class WXUser {
    private long id;
    private long uid;  //uid
    private int sex;   //性别 1男 2女
    private String nickName;  //微信昵称
    private String birth;     //生日
    private String tel;       //电话号码
    private String headimg;  //头像
    private String address;  //地址
    private long createAt;  //创建时间
    private String areaCode; //86  可能是电话前缀
    private String headFrame; //徽章图片
    private int talkFrame; //0
    private Medal medal;      //里程牌
    private int officialVerify; //0
    private boolean isSetPassword; //true
    private List<String> multiAccount; //[]

    private String message;   //"SUCCESS"   消息成功与否
    private Integer status;   //状态码 2000

    public WXUser() {
    }

    public WXUser(long id, long uid, int sex, String nickName, String birth, String tel, String headimg, String address, long createAt, String areaCode, String headFrame, int talkFrame, Medal medal, int officialVerify, boolean isSetPassword, List<String> multiAccount, String message, Integer status) {
        this.id = id;
        this.uid = uid;
        this.sex = sex;
        this.nickName = nickName;
        this.birth = birth;
        this.tel = tel;
        this.headimg = headimg;
        this.address = address;
        this.createAt = createAt;
        this.areaCode = areaCode;
        this.headFrame = headFrame;
        this.talkFrame = talkFrame;
        this.medal = medal;
        this.officialVerify = officialVerify;
        this.isSetPassword = isSetPassword;
        this.multiAccount = multiAccount;
        this.message = message;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getHeadFrame() {
        return headFrame;
    }

    public void setHeadFrame(String headFrame) {
        this.headFrame = headFrame;
    }

    public int getTalkFrame() {
        return talkFrame;
    }

    public void setTalkFrame(int talkFrame) {
        this.talkFrame = talkFrame;
    }

    public Medal getMedal() {
        return medal;
    }

    public void setMedal(Medal medal) {
        this.medal = medal;
    }

    public int getOfficialVerify() {
        return officialVerify;
    }

    public void setOfficialVerify(int officialVerify) {
        this.officialVerify = officialVerify;
    }

    public boolean isSetPassword() {
        return isSetPassword;
    }

    public void setSetPassword(boolean setPassword) {
        isSetPassword = setPassword;
    }

    public List<String> getMultiAccount() {
        return multiAccount;
    }

    public void setMultiAccount(List<String> multiAccount) {
        this.multiAccount = multiAccount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WXUser{" +
                "id=" + id +
                ", uid=" + uid +
                ", sex=" + sex +
                ", nickName='" + nickName + '\'' +
                ", birth='" + birth + '\'' +
                ", tel='" + tel + '\'' +
                ", headimg='" + headimg + '\'' +
                ", address='" + address + '\'' +
                ", createAt=" + createAt +
                ", areaCode='" + areaCode + '\'' +
                ", headFrame='" + headFrame + '\'' +
                ", talkFrame=" + talkFrame +
                ", medal=" + medal +
                ", officialVerify=" + officialVerify +
                ", isSetPassword=" + isSetPassword +
                ", multiAccount=" + multiAccount +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
