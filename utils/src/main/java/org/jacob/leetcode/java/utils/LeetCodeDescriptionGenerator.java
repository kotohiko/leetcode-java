package org.jacob.leetcode.java.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Leetcode problem description JavaDoc generator.
 *
 * @author Kotohiko
 * @since 09:53:14 Jan 23, 2025
 * @version 1.0
 */
public class LeetCodeDescriptionGenerator {

    /**
     * Main method to read and process user input for problem descriptions.
     * This method reads problem URLs, titles, difficulties, number of examples, and constraints.
     * It then formats these inputs into a description string using the descriptionInitializer method.
     * The description string is then printed to the console.
     *
     * @param args command line arguments (not used in this method)
     */
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        var descriptionInit = descriptionInitializer();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                var problemUrl = readInput("Please enter the url of the problem: ", in);
                var problemTitle = readInput("Please enter the title of the problem: ", in);
                var problemDifficultyShort = readInput("Please enter the difficulty of the problem (e, m, or h): ", in);
                var numberOfExamplesStr = readInput("Please enter the number of examples: ", in);
                var numberOfConstraints = readInput("Please enter the number of constraints: ", in);

                var examplesListStr = printExamples(Integer.parseInt(numberOfExamplesStr));
                var problemDifficulty = difficultyMapping(problemDifficultyShort);
                var constraintsListStr = printConstraints(Integer.parseInt(numberOfConstraints));

                var description = String.format(descriptionInit, problemUrl, problemTitle, problemDifficulty,
                        examplesListStr, constraintsListStr);
                System.out.println(description);
                System.out.println("=======================================================" + "END LINE"
                        + "========================================================");
            } catch (IOException ignored) {

            }
        }
    }

    /**
     * Reads a line of input from the user.
     *
     * @param prompt the prompt to display to the user
     * @param in the input stream to read from
     * @return the line of input read from the user
     * @throws IOException if there is an error reading from the input stream
     */
    private static String readInput(String prompt, BufferedReader in) throws IOException {
        System.out.print(prompt);
        return in.readLine();
    }

    /**
     * Initializes the description format string.
     *
     * @return the description format string
     */
    private static String descriptionInitializer() {
        return """
                /**
                 * <a href="%s">
                 * <h1>%s</h1>
                 * </a>
                 * [%s]
                 * <p>
                 * <!-- Description's here... -->
                 * <p>
                %s%s
                """;
    }

    /**
     * Maps a difficulty level to a string.
     *
     * @param problemDifficulty the difficulty level as a string
     * @return the difficulty level as a string ("Easy", "Medium", or "Hard")
     */
    private static String difficultyMapping(String problemDifficulty) {
        switch (problemDifficulty.toLowerCase()) {
            case "e":
                return "Easy";
            case "m":
                return "Medium";
            case "h":
                return "Hard";
            default:
                System.out.println("Invalid input!");
        }
        return "";
    }

    /**
     * Prints a specified number of example descriptions.
     *
     * @param numberOfExamples the number of examples to print
     * @return the example descriptions as a string
     */
    private static String printExamples(int numberOfExamples) {
        if (numberOfExamples == 0) {
            return "";
        } else {
            StringBuilder examples = new StringBuilder();
            for (var i = 0; i < numberOfExamples; ++i) {
                examples.append(" * <b>Example ").append(i + 1).append(": </b>\n");
                examples.append(" * <blockquote>\n");
                examples.append(" * <b>Input:</b> {@code }\n");
                examples.append(" * <p>\n");
                examples.append(" * <b>Output:</b> {@code }\n");
                examples.append(" * <p>\n");
                examples.append(" * <b>Explanation: </b>\n");
                examples.append(" * <!-- Optional -->\n");
                examples.append(" * </blockquote>\n");
                examples.append(" *\n");
            }
            return examples.toString();
        }
    }

    /**
     * Prints a specified number of constraints.
     *
     * @param numberOfConstraints the number of constraints to print
     * @return the constraints as a string
     */
    private static String printConstraints(int numberOfConstraints) {
        if (numberOfConstraints == 0) {
            return "";
        } else {
            return " * <b>Constraints:</b>\n" + " * <p>\n" + " * <ul>\n" + " *     <li>{@code }</li>\n".repeat(
                    Math.max(0, numberOfConstraints)) + " * </ul>" + "\n *";
        }
    }
}