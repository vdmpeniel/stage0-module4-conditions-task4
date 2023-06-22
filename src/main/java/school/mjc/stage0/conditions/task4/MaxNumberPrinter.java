package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public int max(int a, int b){
        return a > b ? a : b;
    }

    public void printGreatest(int first, int second, int third) {
        System.out.println(max(max(first, second), third));
    }
}
