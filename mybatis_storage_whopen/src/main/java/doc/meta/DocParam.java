package doc.meta;

public class DocParam {
    private Integer id;

    private Integer docApiId;

    private String paramName;

    private String paramType;

    private String paramDemo;

    private String paramDescripe;

    private Integer parentId;

    private Byte hasChild;

    private Integer orderNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocApiId() {
        return docApiId;
    }

    public void setDocApiId(Integer docApiId) {
        this.docApiId = docApiId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    public String getParamDemo() {
        return paramDemo;
    }

    public void setParamDemo(String paramDemo) {
        this.paramDemo = paramDemo == null ? null : paramDemo.trim();
    }

    public String getParamDescripe() {
        return paramDescripe;
    }

    public void setParamDescripe(String paramDescripe) {
        this.paramDescripe = paramDescripe == null ? null : paramDescripe.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Byte getHasChild() {
        return hasChild;
    }

    public void setHasChild(Byte hasChild) {
        this.hasChild = hasChild;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}