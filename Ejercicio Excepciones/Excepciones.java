package rcvdemo;

//Excepción 1
class InvalidInputException extends Exception {
 public InvalidInputException(String message) {
     super(message);
 }
}

//Excepción 2
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Excepción 3
class UserNotFoundException extends Exception {
 public UserNotFoundException(String message) {
     super(message);
 }
}

//Excepción 4
class UnauthorizedAccessException extends Exception {
 public UnauthorizedAccessException(String message) {
     super(message);
 }
}

//Excepción 5
class DataFormatException extends Exception {
 public DataFormatException(String message) {
     super(message);
 }
 
}
