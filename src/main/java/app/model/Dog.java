package app.model;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animals{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
