package atlan.ceer.mapper;

import atlan.ceer.model.GoodsInfAll;
import atlan.ceer.model.NeedsInfAll;
import atlan.ceer.model.SimpleGoods;
import atlan.ceer.model.UserInfAll;

import java.util.List;
import java.util.Map;

public interface QueryMapper {
    List<SimpleGoods> queryGoodsList(Map map);
    GoodsInfAll queryGoodsInfAll(String goodsId);
    UserInfAll queryUserInfAll(String userid);
    List<NeedsInfAll> queryNeedsInfList(Map map);
    NeedsInfAll queryNeedsInf(String needsid);
}
