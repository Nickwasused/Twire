package com.perflyst.twire.misc;

import java.util.Random;

public class StringGenerator {
    /**
     * https://gist.github.com/Fast0n/1c34728a1dc7adce57ad0f6d8133d46d
     */

    public static final String DATA = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static Random RANDOM = new Random();

    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(DATA.charAt(RANDOM.nextInt(DATA.length())));
        }

        return sb.toString();
    }

    public static final String DATA_Numbers = "0123456789";
    public static Random RANDOM_Numbers = new Random();

    public static String randomNumbers(int len) {
        StringBuilder sb = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            sb.append(DATA_Numbers.charAt(RANDOM_Numbers.nextInt(DATA_Numbers.length())));
        }

        return sb.toString();
    }
}
