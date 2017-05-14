package com.k15t.pat.exception;

public enum ErrorCodes
{
    VALUE_OF_UNKNOWN(1, "unknown error code provided for valueOf(int)"),

    //email
    EMAIL_ALREADY_REGISTERED(2001, "Email already registered"),

    //password
    PASSWORD_TOO_SHORT(3001,"Password length is too short"),
    PASSWORD_TOO_LONG(3002,"Password length is too long");
    
    private int code;
    private String message;

    private ErrorCodes(int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public static ErrorCodes valueOf(int code)
    {
        ErrorCodes returnedErrorCode = null;

        for (ErrorCodes errorCode : ErrorCodes.values())
        {
            if (errorCode.getCode() == code)
            {
                returnedErrorCode = errorCode;
                break;
            }
        }

        // no ErrorCode found for given code
        if (returnedErrorCode == null)
        {
            returnedErrorCode = ErrorCodes.VALUE_OF_UNKNOWN;
        }

        return returnedErrorCode;
    }

}
