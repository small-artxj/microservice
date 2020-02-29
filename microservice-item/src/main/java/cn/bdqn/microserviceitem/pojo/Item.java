package cn.bdqn.microserviceitem.pojo;

public class Item {
    //商品实体类
    private Long id;   //商品ID
    private String title;  //商品标题
    private String pic;   //商品图片地址
    private String desc;  //商品描述
    private double price;  //价格

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
