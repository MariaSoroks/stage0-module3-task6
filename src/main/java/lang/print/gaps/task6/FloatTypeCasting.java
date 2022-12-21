package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result;
        if (numberToBeRounded%1 >= 0.5) result = (int)numberToBeRounded + 1;
        else result = (int)numberToBeRounded;
        System.out.println(result);
    }
}
