package com.needle.greenitest.client;

import com.needle.greenitest.dto.CaseData;
import com.needle.greenitest.dto.Config;


public interface ServiceInterfaceClient {

	public Object invokeServiceMethod(CaseData casedata,Config config);
}
