package spittr;

import java.util.List;

/**
 * Created by haleema on 9/8/2017.
 */

public interface ISpittleRepository {

     List<Spittle> findSpittles(int start, int max);

     Spittle findOne(int spittleID);

}
