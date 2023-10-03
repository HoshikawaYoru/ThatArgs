import net.hoshikawayoru.thatargs.ArgumentsParser;

public class Test {
    public static void main(String[] args) {
        args = new String[]{"-i", "input.txt", "-o", "output.txt"};

        ArgumentsParser parser = new ArgumentsParser(args);
        parser.addArgument("input", "i", "input");
        parser.addArgument("output", "o", "output");
        parser.parse();

        System.out.println("Input: " + parser.getArgument("input"));
        System.out.println("Output: " + parser.getArgument("output"));
    }
}
