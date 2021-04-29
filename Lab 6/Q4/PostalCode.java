public abstract class PostalCode{

    protected String code;
    public abstract boolean isValid();

    public String getCode() {
        return this.code;
    }

}