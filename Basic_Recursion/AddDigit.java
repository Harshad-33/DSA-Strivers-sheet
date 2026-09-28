package Basic_Recursion;

public class AddDigit {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }

        int digit = num % 10;
        num = num / 10;
        int sum = digit + addDigits(num);
        if(sum >= 10) {
            sum = addDigits(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigit ad = new AddDigit();
        System.out.println(ad.addDigits(529));
    }
}

