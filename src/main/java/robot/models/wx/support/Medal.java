package robot.models.wx.support;

public class Medal {
    private long id;  //奖章id
    private String name; //奖章名字
    private String desc; //奖章介绍
    private String expire; //"-1"
    private String icon;   //徽章图标
    private String type; //"6"
    private String show; //"1"
    private String img;  //徽章图标
    private String msg; //""
    private String img2; //null
    private String ext; //"\"\""

    public Medal() {
    }

    public Medal(long id, String name, String desc, String expire, String icon, String type, String show, String img, String msg, String img2, String ext) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.expire = expire;
        this.icon = icon;
        this.type = type;
        this.show = show;
        this.img = img;
        this.msg = msg;
        this.img2 = img2;
        this.ext = ext;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExpire() {
        return expire;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "Medal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", expire='" + expire + '\'' +
                ", icon='" + icon + '\'' +
                ", type='" + type + '\'' +
                ", show='" + show + '\'' +
                ", img='" + img + '\'' +
                ", msg='" + msg + '\'' +
                ", img2='" + img2 + '\'' +
                ", ext='" + ext + '\'' +
                '}';
    }
}
