package doc.meta;

public class DocApi {
    private Integer id;

    private Integer notifyType;

    private Integer pushCallbackType;

    private String name;

    private Integer docFunctionId;

    private String applicationScemarios;

    private String interationFlow;

    private String returnResult;

    private String returnExplain;

    private String specification;

    private String example;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Integer notifyType) {
        this.notifyType = notifyType;
    }

    public Integer getPushCallbackType() {
        return pushCallbackType;
    }

    public void setPushCallbackType(Integer pushCallbackType) {
        this.pushCallbackType = pushCallbackType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDocFunctionId() {
        return docFunctionId;
    }

    public void setDocFunctionId(Integer docFunctionId) {
        this.docFunctionId = docFunctionId;
    }

    public String getApplicationScemarios() {
        return applicationScemarios;
    }

    public void setApplicationScemarios(String applicationScemarios) {
        this.applicationScemarios = applicationScemarios == null ? null : applicationScemarios.trim();
    }

    public String getInterationFlow() {
        return interationFlow;
    }

    public void setInterationFlow(String interationFlow) {
        this.interationFlow = interationFlow == null ? null : interationFlow.trim();
    }

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult == null ? null : returnResult.trim();
    }

    public String getReturnExplain() {
        return returnExplain;
    }

    public void setReturnExplain(String returnExplain) {
        this.returnExplain = returnExplain == null ? null : returnExplain.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example == null ? null : example.trim();
    }
}