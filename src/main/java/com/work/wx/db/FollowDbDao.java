/*
 * work_wx
 * wuhen 2020/1/16.
 * Copyright (c) 2020  jianfengwuhen@126.com All Rights Reserved.
 */

package com.work.wx.db;

import com.work.wx.controller.modle.FollowModel;
import com.work.wx.controller.modle.TokenModel;
import org.springframework.stereotype.Repository;


@Repository
public class FollowDbDao extends MongoDbDao {

    @Override
    protected Class<FollowModel> getEntityClass() {
        return FollowModel.class;
    }






}
