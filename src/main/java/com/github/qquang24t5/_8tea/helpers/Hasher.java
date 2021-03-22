package com.github.qquang24t5._8tea.helpers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Hasher {

    public static class PasswordHasher {

        public static String hash(String input) throws NoSuchAlgorithmException {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            return Arrays.toString(md.digest(input.getBytes(StandardCharsets.UTF_8)));
        }

    }

}
