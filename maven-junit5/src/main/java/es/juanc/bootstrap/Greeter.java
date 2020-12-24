package es.juanc.bootstrap;

public class Greeter {

    public String greet(String name) {
        var who = name == null ? "world" : name;
        return String.format("Hello %s!!", who);
    }
}
