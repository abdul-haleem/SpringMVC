package spittr;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haleema on 9/13/2017.
 */
@Component
public class SpitterRepository implements ISpitterRepository {

    private List<Spitter> spitters = new ArrayList<>();

    @Override
    public Spitter save(Spitter spitter) {
        spitters.add(spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        for (Spitter spitter : spitters) {
            if (spitter.getUsername().equalsIgnoreCase(username))
                return spitter;
        }
        return null;
    }
}
