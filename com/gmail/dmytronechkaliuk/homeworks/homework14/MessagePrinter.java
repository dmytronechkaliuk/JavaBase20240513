package com.gmail.dmytronechkaliuk.homeworks.homework14;

public class MessagePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if ((message.getText() == null || message.getText().isEmpty()) &&
                (message.getSender() == null || message.getSender().isEmpty())) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("An empty message from an anonymous user is being processed...");
                }
            };
            anonymousPrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("An anonymous user has sent a message: " + message.getText());
        } else {
            System.out.println("User " + message.getSender() + " sent a message: " + message.getText());
        }
    }

}
