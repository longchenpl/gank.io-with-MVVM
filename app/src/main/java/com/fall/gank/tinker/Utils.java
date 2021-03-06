/*
 * Tencent is pleased to support the open source community by making Tinker available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fall.gank.tinker;

/**
 * Created by zhangshaowen on 16/4/7.
 */
public class Utils {

    /**
     * the error code define by myself
     * should after {@code ShareConstants.ERROR_PATCH_INSERVICE
     */

    public static AppStatusListenner sAppStatusListenner;

    public static boolean isGooglePlay() {
        return false;
    }

    public static  void setAppStatusChangedListenner(final AppStatusListenner appStatusChangedListenner){
        sAppStatusListenner = appStatusChangedListenner;
    }
    public static AppStatusListenner getAppStatusListenner() {
        return sAppStatusListenner;
    }
}
