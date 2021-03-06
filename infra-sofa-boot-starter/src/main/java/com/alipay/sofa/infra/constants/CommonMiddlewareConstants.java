/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.infra.constants;

/**
 * CommonMiddlewareConstants
 *
 * @author yangguanchao
 * @since 2017/09/07
 */
public class CommonMiddlewareConstants {

    /***
     * 获取应用名: 备注 @Value("${spring.application.name:@null}")
     */
    public static final String APP_NAME_KEY                = "spring.application.name";

    /**
     * {@link org.springframework.boot.ResourceBanner#getVersionsMap}
     */
    public static final String SOFA_BOOT_VERSION           = "sofa-boot.version";
    public static final String SOFA_BOOT_FORMATTED_VERSION = "sofa-boot.formatted-version";
}
