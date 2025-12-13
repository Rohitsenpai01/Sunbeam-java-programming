package assignment02;

@SuppressWarnings("serial")
public class ExceptionLineTooLong extends Exception {

    public ExceptionLineTooLong() {
        super("The string is too long");
    }

	public String getMessage() {
		
		return "The string is too long";
	}
}
