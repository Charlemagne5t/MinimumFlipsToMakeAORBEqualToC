package org.example;

public class Solution {
    public int minFlips(int a, int b, int c) {

        String aBinary = Integer.toBinaryString(a);
        String bBinary = Integer.toBinaryString(b);
        String cBinary = Integer.toBinaryString(c);
        int aLength = aBinary.length();
        int bLength = bBinary.length();
        int cLength = cBinary.length();
        int maxLength = Math.max(aLength, Math.max(bLength, cLength));

        aBinary = fillZeroes(aBinary, maxLength);
        bBinary = fillZeroes(bBinary, maxLength);
        cBinary = fillZeroes(cBinary, maxLength);

        int count = 0;
        for (int i = 0; i < maxLength; i++) {
            if (cBinary.charAt(i) == '0' && aBinary.charAt(i) == '1' && bBinary.charAt(i) == '1') {
                count = count + 2;
            } else if (cBinary.charAt(i) == '1' && aBinary.charAt(i) == '0' && bBinary.charAt(i) == '0') {
                count++;
            } else if (cBinary.charAt(i) == '0' && (aBinary.charAt(i) == '1' || bBinary.charAt(i) == '1')) {
                count++;
            }
            ;

        }

        return count;
    }

    private String fillZeroes(String number, int length) {
        StringBuilder sb = new StringBuilder(number);
        while (sb.length() != length) {
            sb.insert(0, "0");
        }
        return sb.toString();
    }
}