package com.lixiang.bs.controller;
import com.lixiang.bs.common.result.Result;
import com.lixiang.bs.common.result.ResultGenerator;
import com.lixiang.bs.entity.UserEntity;
import com.lixiang.bs.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author chentao
 * @date 2020/4/15 15:12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(UserEntity userEntity) {
        userService.save(userEntity);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserEntity userEntity) {
        userService.update(userEntity);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/get/by_id")
    public Result detail(@RequestParam Integer id) {
        UserEntity userEntity = userService.findById(id);
        return ResultGenerator.genSuccessResult(userEntity);
    }

    @PostMapping("/query/by_example")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserEntity> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
