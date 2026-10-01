import number.Roman;
public class RomanTest {
 public static void main(String[] args) {
 Roman r = new Roman();
 String[] inputs = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
 for(String s : inputs) System.out.println(s + " = " +
r.romanToInteger(s));
 }
}