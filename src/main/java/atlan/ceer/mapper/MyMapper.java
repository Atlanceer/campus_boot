package atlan.ceer.mapper;

import atlan.ceer.model.CountUserInf;
import atlan.ceer.model.UserUpdate;

public interface MyMapper {
    void countIncreaseUserInf(CountUserInf countUserInf);
    void countDecreaseUserInf(CountUserInf countUserInf);
    void updateUserInf(UserUpdate userUpdate);
    void updateUser(UserUpdate userUpdate);
}
