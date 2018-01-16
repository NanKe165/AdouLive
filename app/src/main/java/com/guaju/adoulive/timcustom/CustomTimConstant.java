package com.guaju.adoulive.timcustom;

import com.tencent.TIMFriendshipManager;
import com.tencent.livesdk.ILVLiveConstants;

import java.util.Arrays;
import java.util.List;

/**
 * Created by guaju on 2018/1/2.
 */

public interface CustomTimConstant {
    //定义了两个自定义消息的cmd int类型常量
    int CUSTOM_ILIVE_CMD_TEXT= ILVLiveConstants.ILVLIVE_CMD_CUSTOM_LOW_LIMIT+1;
    int CUSTOM_ILIVE_CMD_DANMU= ILVLiveConstants.ILVLIVE_CMD_CUSTOM_LOW_LIMIT+2;
    //前缀必须是这个
    String PREFIX="Tag_Profile_Custom_";
    String INFO_SEND = PREFIX+"Send";
    String INFO_RECEIVE = PREFIX+"Receive";
    String INFO_GRADE = PREFIX+"Grade";
    String INFO_XINGZUO = PREFIX+"Xingzuo";
    String INFO_FANS = PREFIX+"fans";
    String INFO_FORK = PREFIX+"fork";
    String[] name = {INFO_SEND, INFO_RECEIVE, INFO_GRADE, INFO_XINGZUO, INFO_FANS, INFO_FORK};
    List<String> names = Arrays.asList(name);
    //腾讯自带的信息
    long ALL_BASE_INFO =
            TIMFriendshipManager.TIM_PROFILE_FLAG_BIRTHDAY
            |TIMFriendshipManager.TIM_PROFILE_FLAG_FACE_URL
            |TIMFriendshipManager.TIM_PROFILE_FLAG_GENDER
            |TIMFriendshipManager.TIM_PROFILE_FLAG_LANGUAGE
            |TIMFriendshipManager.TIM_PROFILE_FLAG_LOCATION
            |TIMFriendshipManager.TIM_PROFILE_FLAG_NICK
            |TIMFriendshipManager.TIM_PROFILE_FLAG_SELF_SIGNATURE
            |TIMFriendshipManager.TIM_PROFILE_FLAG_REMARK
            |TIMFriendshipManager.TIM_PROFILE_FLAG_GROUP;


}