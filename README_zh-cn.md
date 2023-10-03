# ThatArgs
[**English**](README.md) | [简体中文](README_zh-cn.md)

[ThatArgs](https://github.com/HoshikawaYoru/ThatArgs) 是用于处理CLI参数的项目，本项目提供了简易的API。

## 使用
```java
import net.hoshikawayoru.thatargs.ArgumentsParser;

public class Main {
    public static void main(String[] args) {
        // 创建解析器并绑定参数
        ArgumentsParser parser = new ArgumentsParser(args);
        
        // 添加参数
        parser.addArgument("argID", "argAbbr", "argComplete");
        
        // 解析
        parser.parse();
        
        // 调用解析后的参数
        System.out.println(parser.getArgument("argID"));
    }
}
```

## 构建和编译
```shell
mvn compile
mvn package
```

## 示例
请查看[Test.java](src/test/java/Test.java)

## 许可
此项目使用[MIT License](LICENSE)发布




