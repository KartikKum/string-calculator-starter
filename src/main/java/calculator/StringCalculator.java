package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	if(input.isEmpty()) {
        	return 0;   // you have to return 0 if string is empty
        }
        else {
        	return Integer.parseInt(input);  //  now here changing String to integer value and returning integer value
        }
    }
}