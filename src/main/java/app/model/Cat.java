package app.model;

import org.springframework.stereotype.Component;

@Component ("cat")
public class Cat extends Animals {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}
