public class Fraction{
    int numerator;
    int denominator;

    void setNumerator(int num){
        numerator = num;
    }

    void setDenominator(int den){
        denominator = den;
    }

    void print(){
        System.out.println(numerator + "/" + denominator);
    }
}