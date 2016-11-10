/*  
 * 	Copyright(C) 2010-2013 Baidu Group
 *  
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License version 2 as
 *  published by the Free Software Foundation.
 *  
 */

package com.needle.greenitest.teardown;

import java.io.File;

import com.needle.greenitest.dto.Config;
import com.needle.greenitest.template.VariableGenerator;


/**
 * 处理测试后置的一些工作，典型的如数据清理
 * @author xuedawei
 * @date 2013-8-29
 * @classname TearDown
 * @version 1.0.0
 * @desc TODO
 */
public interface TearDown {
	
	/**
	 * 根据teardown目录下文件进行数据准备
	 * @param 
	 * @return
	 */
	public boolean cleanTestData(File[] tearDownFiles,Config config,VariableGenerator vargen);
}
