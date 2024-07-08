package com.gmail.dmytronechkaliuk.homeworks.homework14;

public class MessageRunner {
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();

        MessagePrinter.Message firstMessage = new MessagePrinter.Message("Hello, World!", "Dmytro");
        printer.print(firstMessage);

        MessagePrinter.Message secondMessage = new MessagePrinter.Message("Hello, World!", null);
        printer.print(secondMessage);

        MessagePrinter.Message thirdMessage = new MessagePrinter.Message(null, null);
        printer.print(thirdMessage);
    }
}
