package br.unisinos.dev2.atividadegb.utils;

import java.util.Random;

public class RandomUtils {

    public static int nextInt(final int start, final int end, final int... exclude) {
        final Random rnd = new Random();
        int random = start + rnd.nextInt(end - start + 1 - exclude.length);
        for (final int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }

}
