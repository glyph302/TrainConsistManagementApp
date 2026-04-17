/**
 * CLASS InvalidBogieException
 * Custom exception specifically for Railway operational errors.
 */
public class InvalidBogieException extends Exception {
    public InvalidBogieException(String message) {
        super(message);
    }
}