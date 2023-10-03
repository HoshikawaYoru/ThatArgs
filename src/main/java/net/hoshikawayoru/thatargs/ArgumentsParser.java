package net.hoshikawayoru.thatargs;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ArgumentsParser class is used to parse command line arguments and store them in a HashMap.
 */
public class ArgumentsParser {
    private final String[] args;

    private final HashMap<String, ArrayList<String>> argMap;
    private final HashMap<String, String> abbrMap;
    private final HashMap<String, String> completeMap;


    /**
     * Constructor for ArgumentsParser class.
     *
     * @param args Array of command line arguments
     */
    public ArgumentsParser(String[] args) {
        this.args = args;

        this.argMap = new HashMap<>();
        this.abbrMap = new HashMap<>();
        this.completeMap = new HashMap<>();
    }

    /**
     * Adds an argument with its abbreviation and complete form to the parser.
     *
     * @param argID       The ID of the argument
     * @param argAbbr     The abbreviation of the argument
     * @param argComplete The complete form of the argument
     */
    public void addArgument(String argID, String argAbbr, String argComplete) {
        abbrMap.put(argAbbr, argID);
        completeMap.put(argComplete, argID);
        argMap.putIfAbsent(argID, new ArrayList<>());
    }

    /**
     * Parses the command line arguments and stores them in the argMap.
     * Raises an exception if an argument is not found.
     */
    public void parse() {
        String index = null;

        for (String arg : args) {
            if (arg.startsWith("--")) {
                index = completeMap.get(arg.substring(2));
                continue;
            }

            if (arg.startsWith("-")) {
                index = abbrMap.get(arg.substring(1));
                continue;
            }

            try {
                argMap.get(index).add(arg);
            } catch (NullPointerException exception) {
                throw new RuntimeException("Argument Not Found: " + index);
            }
        }
    }

    /**
     * Retrieves the list of values associated with the given argument ID.
     *
     * @param argID The ID of the argument
     * @return An ArrayList of values associated with the argument ID
     */
    public ArrayList<String> getArgument(String argID) {
        return argMap.get(argID);
    }
}
