package uz.gita.bot.runTest.comp;

public class CodeCompilerDto {
    private String errMsg;
    private Boolean isOk;

    public CodeCompilerDto() {
    }

    public CodeCompilerDto(Boolean isOk) {
        this.isOk = isOk;
    }

    public CodeCompilerDto(String errMsg, Boolean isOk) {
        this.errMsg = errMsg;
        this.isOk = isOk;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public Boolean getIsOk() {
        return isOk;
    }

    public void setIsOk(Boolean isOk) {
        this.isOk = isOk;
    }
}
