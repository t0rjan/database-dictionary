package com.trh.dictionary.config;

import lombok.Data;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Copyright (C),2020
 * Author: jingxiaohu
 * Date: 2020/8/5 15:37
 * Description:
 */
@Data
@Component
@ComponentScan(value = "com.trh.dictionary.conterller")
public class DataBaseDictionaryConfig {

}
