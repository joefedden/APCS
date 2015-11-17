public class Romannum {
    private int input, digit1, digit2, digit3, digit4;
    private String letter = "";
    
    public Romannum(int input) {
        this.input = input;
    }
    
    public int setFirstDigit() {
        digit1 = (int)(Math.floor(input / 1000)) * 1000;
        return digit1;
    }
    
    public int setSecondDigit() {
        digit2 = (int)(Math.floor((input % 1000) / 100)) * 100;
        return digit2;
    }
    
    public int setThirdDigit() {
        digit3 = (int)(Math.floor((input % 100) / 10)) * 10;
        return digit3;
    }
    
    public int setFourthDigit() {
        digit4 = (int)Math.floor(input % 10);
        return digit4;
    }
    
    public void romanNumConverter(int digit) {
        if (digit >= 1000) {
            letter = "M";
        } else if (digit >= 500 && digit < 1000) {
            letter = "D";
        } else if (digit >= 100 && digit < 500) {
            letter = "C";
        } else if (digit >= 50 && digit < 100) {
            letter = "L";
        } else if (digit >= 10 && digit < 50) {
            letter = "X";
        } else if (digit >= 5 && digit < 10) {
            letter = "V";
        } else {
            letter = "I";
        }
    }
    
    public double returnInput() {
        return input;
    }
}