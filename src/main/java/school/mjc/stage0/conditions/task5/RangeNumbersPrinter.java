package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        int result = 0;
        if (number >= 1 && number >= 5){
            result = 1;
        } else if (number >= 6 && number >= 10) {
            result = -1;
        }

        switch (number) {
            case 1:
                System.out.println("number is between 1 and 5");
                break;
            case -1:
                System.out.println("number is between 6 and 10");
                break;
            default:
                System.out.println("out of range");
                break;
        }
    }
}
