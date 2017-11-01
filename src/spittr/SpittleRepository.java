package spittr;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by haleema on 9/8/2017.
 */
@Component
public class SpittleRepository implements ISpittleRepository {

    List<Spittle> spittles = new ArrayList<>();


    SpittleRepository() {
        createSpittleList(1000);
    }

    @Override
    public List<Spittle> findSpittles(int start, int max) {
        return spittles.subList(Math.max(0, start), Math.min(start + max, spittles.size() - 1));
    }

    @Override
    public Spittle findOne(int spittleID) {
        return spittles.get(Math.min(Math.max(0, spittleID), spittles.size() - 1));
    }


    private List<Spittle> createSpittleList(int count) {
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }
}
