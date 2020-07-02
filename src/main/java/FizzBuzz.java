public class FizzBuzz {

    public final int FIZZ_VALUE = 3;
    public final int BUZZ_VALUE = 5;
    public final int FIZZBUZZ_VALUE = 15;
    public final int MAX = 20;

    public final String FIZZ = "fizz";
    public final String BUZZ = "buzz";
    public final String FIZZBUZZ = "fizzbuzz";
    public final String LUCKY = "lucky";

    public static void main (String [] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.runFizzBuzz(20));
    }

    public  String runFizzBuzz(int number) {
        int [] counts = {0, 0, 0, 0 ,0};
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=this.MAX; i++) {
            sb.append(this.fizzBuzz(i,counts));
            if (i + 1 <= this.MAX)
                sb.append(" ");
        }
        sb.append(System.lineSeparator());
        sb.append("fizz: " + counts[0]);
        sb.append(System.lineSeparator());
        sb.append("buzz: " + counts[1]);
        sb.append(System.lineSeparator());
        sb.append("fizzbuzz: " + counts[2]);
        sb.append(System.lineSeparator());
        sb.append("lucky: " + counts[3]);
        sb.append(System.lineSeparator());
        sb.append("integer: " + counts[4]);
        return sb.toString();
    }

    public String fizzBuzz(int number, int [] counts) {
        if (String.valueOf(number).contains("3")) {
            counts[3] = counts[3] + 1;
            return "lucky";
        }
        if (number % FIZZBUZZ_VALUE == 0) {
            counts[2] = counts[2] + 1;
            return this.FIZZBUZZ;
        }
        else if (number % BUZZ_VALUE == 0) {
            counts[1] = counts[1] + 1;
            return this.BUZZ;
        }
        else if (number % FIZZ_VALUE == 0) {
            counts[0] = counts[0] + 1;
            return this.FIZZ;
        }
        counts[4] = counts[4] + 1;
        return String.valueOf(number);
    }


}
