package doc.meta;

public class DocStorageMap {
    private Integer id;

    private Integer storageId;

    private Integer apiId;

    private String paramNameList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public String getParamNameList() {
        return paramNameList;
    }

    public void setParamNameList(String paramNameList) {
        this.paramNameList = paramNameList == null ? null : paramNameList.trim();
    }
}