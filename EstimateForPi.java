package classworkitujava;


public class EstimateForPi {

    public static void main(String[] args) {

        System.out.printf("The value of PI constant in Java's Math library is : "+ Math.PI);
        System.out.println();
        System.out.println(estimatePI(21));

    }

    public static double estimatePI(int loopCount){
        double sqrtTwelve = Math.sqrt(12);
        double countedPI = 0.0;
        double intConst = 3;
        for( int i = 0 ; i < loopCount ; i++ ){
            if( i == 0 ){
                intConst = 1;
            }
            int sign = getSign(i);
            double denominator = getDenominator(i);
            countedPI += sign * ((double) 1/ (intConst * denominator));
            intConst += 2;
        }
        return sqrtTwelve * countedPI;
    }

    private static double getDenominator(int i) {
        return Math.pow(3, i);
    }

    private static int getSign(int i) {
        if(i % 2 == 0)
            return 1;
        else
            return -1;
    }


}
