package com.example;

import java.util.Random;

public final class JavaJoke {

    private static final String[] JOKES = {"A lot of people cry when they cut an onion. The trick is not to form an emotional bond.",
            "Blonde 1: \"What does WTF mean?\" \n" +
                    "\" Blonde 2: \"What the fuck?\" \n" +
                    "\"Blonde 1: \"Geeze, I'm just asking.\" ",
            "Wife: \"I look fat. Can you give me a compliment?\" \n" +
                    "Husband: \"You have perfect eyesight.\""};

    public static String makeMeLaugh() {
        Random rand = new Random();
        return JOKES[rand.nextInt(JOKES.length)];
    }
}
