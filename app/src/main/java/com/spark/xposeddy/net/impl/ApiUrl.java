package com.spark.xposeddy.net.impl;

public class ApiUrl {

    public static String uploadComment(String domain) {
        return domain + "/ttMicroapp/dyextra/dyuid/saveList.action";
    }

    public static String getDeviceTask(String domain) {
        return domain + "/ttMicroapp/dyextra/getDeviceInfoByNum.action";
    }

    public static String updateDeviceTaskState(String domain) {
        return domain + "/ttMicroapp/dyextra/updateDeviceInfoState.action";
    }

    public static String getNewPhoneInfo(String domain) {
        // return domain + "/ttMicroapp/dyextra/getAndroidInfo.action";
        return "http://121.5.26.145:8088/phone/getAndroidInfo";
    }

}
