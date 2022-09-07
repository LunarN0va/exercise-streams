package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        List<String> output = input.stream()

                .filter(word -> (word.length() < 3))
                .toList();
//                .forEach(word -> {
//                    System.out.println(word);
//                });

        return output;
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {

        List<String> output = input.stream()
                .filter(word -> word.chars())

        return input;

    }
}
