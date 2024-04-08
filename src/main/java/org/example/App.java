package org.example;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        String joinedString = Joiner.on(", ").join("Hello", "World", "!");
        System.out.println("Concatenated string: " + joinedString);

        ImmutableList<String> immutableList = ImmutableList.of("Aa", "Bb", "Cc");
        System.out.println("Immutable list: " + immutableList);

        URL url = Resources.getResource("example.txt");
        String text = Resources.toString(url, StandardCharsets.UTF_8);
        System.out.println("File contents: \n" + text);
    }
}
