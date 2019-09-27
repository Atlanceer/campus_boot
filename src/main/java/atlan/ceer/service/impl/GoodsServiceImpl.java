package atlan.ceer.service.impl;

import atlan.ceer.config.MyLogger;
import atlan.ceer.mapper.GoodsMapper;
import atlan.ceer.mapper.MyMapper;
import atlan.ceer.mapper.QueryMapper;
import atlan.ceer.model.CountUserInf;
import atlan.ceer.model.GoodsInfAll;
import atlan.ceer.model.QueryPage;
import atlan.ceer.model.SimpleGoods;
import atlan.ceer.pojo.Goods;
import atlan.ceer.pojo.GoodsExample;
import atlan.ceer.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;
import java.util.Map;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private MyMapper myMapper;
    @Autowired
    private QueryMapper queryMapper;

    @Transactional
    @Override
    public boolean addGoods(Goods goods) {
        try {
            goodsMapper.insertSelective(goods);
            CountUserInf countUserInf=new CountUserInf();
            countUserInf.setCountGoods(1);
            countUserInf.setIdUser(goods.getIdUser());
            myMapper.countIncreaseUserInf(countUserInf);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            //事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
    }

    @Override
    public GoodsInfAll goodsInfAll(String goodsId) {
        try {
            GoodsInfAll goodsInfAll = queryMapper.queryGoodsInfAll(goodsId);
            return goodsInfAll;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional
    @Override
    public boolean deleteGoods(String userId, String goodsId) {
        try {
            //删除货物
            GoodsExample goodsExample=new GoodsExample();
            GoodsExample.Criteria criteria=goodsExample.createCriteria();
            criteria.andIdGoodsEqualTo(goodsId);
            criteria.andIdUserEqualTo(userId);
            int count=goodsMapper.deleteByExample(goodsExample);
            //如果不存在商品就返回false
            if (count==0){
                return false;
            }
            //用户信息发数量减少一
            CountUserInf countUserInf=new CountUserInf();
            countUserInf.setCountGoods(1);
            countUserInf.setIdUser(userId);
            myMapper.countDecreaseUserInf(countUserInf);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            //事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
    }

    @Override
    public QueryPage<SimpleGoods> goodsList(Map map) {
        try {
            //int page= (int) map.get("page");
            QueryPage<SimpleGoods> queryPage=new QueryPage<>();
            //总个数
            int totalCount= (int) goodsMapper.countByExample(null);
            queryPage.setTotalCount(totalCount);
            //当前页
            queryPage.setCurrentPage((int) map.get("page"));
            int totalPage=0;
            if (totalCount%20==0&&totalCount!=0){
                totalPage=totalCount/20;
            }else {
                totalPage=totalCount/20+1;
            }
            queryPage.setTotalPage(totalPage);
            //查询发布的列表
            List<SimpleGoods> list = queryMapper.queryGoodsList(map);
            //当前查询的数量
            int listSize=list.size();
            queryPage.setThisPageCount(listSize);
            //判断以后是否还有页面
            if (listSize<20){
                queryPage.setHaveMore(false);
            }else {
                queryPage.setHaveMore(true);
            }
            queryPage.setPageList(list);
            MyLogger.logger.info(queryPage.toString());
            return queryPage;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
