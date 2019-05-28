public class Task3 {
    public static void main(String[] args) {

        double inputSum = 56.54;
        inputSum *= 100;//remove the float
        double[] money = new double[]{100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        int[] repeat = new int[13];

        for (int i = 0; i < money.length; i++) {

            if (inputSum >= money[i] * 100) { //remove the float and from the money

                repeat[i] = (int) ((inputSum / 100) / money[i]);//Get how many times it is repeated
                inputSum = inputSum - 100 * repeat[i] * money[i];//Get the new value for the input sum

            }
        }

        for (int i = 0; i < money.length; i++) {//For every value in repeat array that is not zero print the money and the count

            if (repeat[i] != 0) {

                System.out.println(money[i] + "->"
                        + repeat[i]);

            }
        }
    }
}
