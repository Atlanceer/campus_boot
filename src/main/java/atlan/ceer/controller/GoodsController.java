package atlan.ceer.controller;

import atlan.ceer.enumeration.MyStatus;
import atlan.ceer.model.GoodsInfAll;
import atlan.ceer.model.MyResult;
import atlan.ceer.model.QueryPage;
import atlan.ceer.model.SimpleGoods;
import atlan.ceer.pojo.Goods;
import atlan.ceer.service.GoodsService;
import atlan.ceer.util.CodeUtil;
import atlan.ceer.util.TimeUtil;
import atlan.ceer.util.TokenUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Value("${headPath}")
    private String headPath;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private CodeUtil codeUtil;
    @Autowired
    private TimeUtil timeUtil;

    @RequestMapping("/add")
    public MyResult addGoods(@RequestBody String body, HttpServletRequest request){
        try {
            JSONObject jsonObject=new JSONObject(body);
            //获取用户名和id
            String token=request.getHeader("token");
            Map map=tokenUtil.parseTokenForLogin(token);
            Goods goods=new Goods();
            goods.setIdUser((String) map.get("id"));
            String goodsId=codeUtil.getUUID();
            goods.setIdGoods(goodsId);
            Date nowTime=timeUtil.getTime();
            goods.setGmtCreate(nowTime);
            goods.setGmtModified(nowTime);

            //转化json
            goods.setGoodsName(jsonObject.getString("goodsName"));
            goods.setMainImage(jsonObject.getString("mainImage"));
            goods.setGoodsInf(jsonObject.getString("goodsInf"));
            goods.setGoodsLocation(jsonObject.getString("goodsLocation"));
            goods.setGoodsPrice(BigDecimal.valueOf(Double.valueOf(jsonObject.getString("goodsPrice"))));
            goods.setGoodsCategory(jsonObject.getString("goodsCategory"));
            goods.setIsNew(jsonObject.getInt("isNew"));
            goods.setTag(jsonObject.getString("tag"));
            goods.setGoodsImages(jsonObject.getJSONArray("goodsImages").toString());

            if (goodsService.addGoods(goods)){
                return new MyResult(goodsId,true, MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
            }else {
                return new MyResult(false,MyStatus.DATABASE_ERROR.getMessage(),MyStatus.DATABASE_ERROR.getCode());
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }

    @RequestMapping("/list")
    public MyResult goodsList(@RequestBody String body){
        try {
            //获取前端传来的json数据
            JSONObject jsonObject=new JSONObject(body);
            //SimpleGoods simpleGoods=new SimpleGoods();
            int page=jsonObject.getInt("page");
            String location=null;
            //判断是否有location字段
            if (jsonObject.has("location")){
                location=jsonObject.getString("location");
                if (location.equals("all")||location.equals("")||location.equals("ALL")){
                    location=null;
                }else if (location.equals("A")||location.equals("C")||location.equals("B")){
                    //如果前端传来字母就转化为中文
                    if (location.equals("A")){
                        location="宜宾校区";
                    }else if (location.equals("B")){
                        location="汇南校区";
                    }
                    if (location.equals("C")){
                        location="营盘校区";
                    }
                }else {
                    //System.out.println("cuow 1111");
                    return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
                }
            }
            String tag=null;
            if (jsonObject.has("tag")){
                tag=jsonObject.getString("tag");
                if (tag.equals("all")||tag.equals("")||tag.equals("ALL")) {
                    tag = null;
                }
            }
            //添加进map
            Map<String,Object> map=new HashMap<>();
            map.put("location",location);
            map.put("tag",tag);
            if (page!=0){
                page=page*20;
            }
            map.put("page",page);
            //查询最新商品
            QueryPage queryPage=goodsService.goodsList(map);
            return new MyResult(queryPage,true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }

    @RequestMapping("/inf")
    public MyResult queryGoodsInfAll(@RequestBody String body){
        JSONObject jsonObject=new JSONObject(body);
        String goodsId=null;
        //可以传id或者goodsid
        if (jsonObject.has("id")){
            goodsId=jsonObject.getString("id");
        }else if (jsonObject.has("idGoods")){
            goodsId=jsonObject.getString("idGoods");
        }else {
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
        GoodsInfAll goodsInfAll=goodsService.goodsInfAll(goodsId);
        if (goodsInfAll!=null){
            //图片数组
            JSONArray imagesArray=new JSONArray(goodsInfAll.getGoodsImages());
            //遍历数组添加访问路径头
            for (int i=0;i<imagesArray.length();i++){
                imagesArray.put(i,headPath+imagesArray.getString(i));
            }
            List list=imagesArray.toList();
            goodsInfAll.setImages(list);
            goodsInfAll.setGoodsImages("");
            return new MyResult(goodsInfAll,true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
        }else {
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }

    @RequestMapping("/delete")
    public MyResult deleteGoods(@RequestBody String body,HttpServletRequest request){
        try {
            JSONObject jsonObject=new JSONObject(body);
            String goodsId=null;
            //得到token获取用户id
            String token=request.getHeader("token");
            Map map=tokenUtil.parseTokenForLogin(token);
            String userId= (String) map.get("id");
            if (jsonObject.has("idGoods")){
                goodsId=jsonObject.getString("idGoods");
            }else if (jsonObject.has("id")){
                goodsId=jsonObject.getString("id");
            }else {
                return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
            }
            if (goodsService.deleteGoods(userId,goodsId)){
                return new MyResult(true,MyStatus.SUCCESS.getMessage(),MyStatus.SUCCESS.getCode());
            }else {
                return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new MyResult(false,MyStatus.NOT_ALLOWED_REQUEST.getMessage(),MyStatus.NOT_ALLOWED_REQUEST.getCode());
        }
    }
}
