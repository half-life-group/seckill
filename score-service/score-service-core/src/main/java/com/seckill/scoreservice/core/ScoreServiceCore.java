package com.seckill.scoreservice.core;

import com.seckill.api.ScoreAPI;
import com.seckill.common.utils.PageUtils;
import com.seckill.common.utils.R;
import com.seckill.entity.Score;
import com.seckill.scoreservice.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ScoreServiceCore implements ScoreAPI {

    @Autowired
    private ScoreService scoreService;

    @Override
    public String getScore(@PathVariable String id) {
        System.out.println("进入score-service:"+id);
        return "积分:"+id;
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("wallet:walletinnerlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = scoreService.queryPage(params);

        return R.ok().put("page", page);
    }
    @RequestMapping("/getOne")
    public R getScore(@RequestBody Map<String,Object> params){
        Score score = scoreService.selectById(Integer.parseInt(params.get("id").toString()));
        return  R.ok().put("data",score);
    }
}
