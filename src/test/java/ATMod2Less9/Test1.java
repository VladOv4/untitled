package ATMod2Less9;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test1 {
        public static void main(String[] args) {
        BigInteger x = new BigInteger("5223372036854775807587");
        BigInteger y = new BigInteger("2223372036854775807567");

        BigDecimal c = new BigDecimal("52233720368.54775807587");
        BigDecimal v = new BigDecimal("22233720368.54775807567");

        //Целочисленные

        BigInteger sum = x.add(y); //Сложение
        BigInteger sub = x.subtract(y); //Вычитание
        BigInteger mul = x.multiply(y); //Умножение
        BigInteger div = x.divide(y); //Деление без остатка
        BigInteger mod = x.mod(y); //Деление с Остатком

        //С плавающей точкой

        BigDecimal sumD = c.add(v); //Сложение
        BigDecimal subD = c.subtract(v); //Вычитание
        BigDecimal mulD = c.multiply(v); //Умножение
        BigDecimal divD = c.divide(v,5, RoundingMode.HALF_UP); //Деление без остатка
        BigDecimal remD = c.remainder(v); //Деление с Остатком

        System.out.println("\nЦелочисленные\n___________________________");
        System.out.println("Сложение - " + sum + "\nВычитание - " + sub + "\nУмножение - " + mul +
                "\nДеление без остатка - " + div + "\nДеление c остатком - " + mod +
                "\n___________________________");
        System.out.println("\nС плавающей точкой\n___________________________");
        System.out.println("Сложение - " + sumD + "\nВычитание - " + subD + "\nУмножение - " + mulD +
                "\nДеление без остатка - " + divD + "\nДеление c остатком - " + remD +
                "\n___________________________");
    }
}
