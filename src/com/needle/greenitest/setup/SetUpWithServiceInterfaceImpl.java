/*  
 * 	Copyright(C) 2010-2013 Baidu Group
 *  
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License version 2 as
 *  published by the Free Software Foundation.
 *  
 */

package com.needle.greenitest.setup;

import java.io.File;

import com.needle.greenitest.client.HttpReqImpl;
import com.needle.greenitest.client.SoapReqImpl;
import com.needle.greenitest.dto.Config;
import com.needle.greenitest.template.VariableGenerator;
/**
 * 
 * @author xuedawei
 * @date 2013-8-30
 * @classname 
 * @version 1.0.0
 * @desc 复用http，soap接口来做数据构造的工作
 */
public class SetUpWithServiceInterfaceImpl implements
		SetUpWithServiceInterface {

	public boolean setTestDataByHttpRequest(File file, Config config,VariableGenerator vargen) {

		try{
			HttpReqImpl req = new HttpReqImpl();
			req.requestHttpByHttpClient(file, config, vargen);
			return true;
		}catch(Exception e){
			return false;
		}
		
	}

	public boolean setTestDataBySoapRequest(File file, Config config,VariableGenerator vargen) {
		try{
			SoapReqImpl req = new SoapReqImpl();
			req.requestSoap(file, config, vargen);
			return true;
		}catch(Exception e){
			return false;
		}
	}


}
