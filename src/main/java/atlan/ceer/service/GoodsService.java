package atlan.ceer.service;

import atlan.ceer.model.GoodsInfAll;
import atlan.ceer.model.QueryPage;
import atlan.ceer.model.SimpleGoods;
import atlan.ceer.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    boolean addGoods(Goods goods);
    GoodsInfAll goodsInfAll(String goodsId);
    boolean deleteGoods(String userId,String goodsId);
    QueryPage<SimpleGoods> goodsList(Map map);
}
