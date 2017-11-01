package spittr;

/**
 * Created by haleema on 9/13/2017.
 */
public interface ISpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
