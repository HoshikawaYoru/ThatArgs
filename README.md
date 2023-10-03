# ThatArgs
[**English**](README.md) | [简体中文](README_zh-cn.md)

[ThatArgs](https://github.com/HoshikawaYoru/ThatArgs) is a project for handling CLI arguments. This project provides a simple API.

## Usage
```java
import net.hoshikawayoru.thatargs.ArgumentsParser;

public class Main {
    public static void main(String[] args) {
        // Create a parser and bind the arguments
        ArgumentsParser parser = new ArgumentsParser(args);

        // Add arguments
        parser.addArgument("argID", "argAbbr", "argComplete");

        // Parse
        parser.parse();

        // Access the parsed arguments
        System.out.println(parser.getArgument("argID"));
    }
}
```

## Build and Compile
```shell
mvn compile
mvn package
```

## Example
Please refer to [Test.java](src/test/java/Test.java)

## License
This project is released under the [MIT License](LICENSE).




