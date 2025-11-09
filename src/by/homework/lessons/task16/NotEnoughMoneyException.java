package by.homework.lessons.task16;

public class NotEnoughMoneyException extends RuntimeException {
    private String errorCode;

    public NotEnoughMoneyException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() { return errorCode; }
    public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
}