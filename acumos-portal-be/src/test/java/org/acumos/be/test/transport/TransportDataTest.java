/*-
 * ===============LICENSE_START=======================================================
 * Acumos
 * ===================================================================================
 * Copyright (C) 2017 AT&T Intellectual Property & Tech Mahindra. All rights reserved.
 * ===================================================================================
 * This Acumos software file is distributed by AT&T and Tech Mahindra
 * under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===============LICENSE_END=========================================================
 */

package org.acumos.be.test.transport;

import org.acumos.portal.be.transport.TransportData;
import org.junit.Assert;
import org.junit.Test;

public class TransportDataTest {

	@Test	
	public void transportDataParameter(){
	int status=1;
	Object data=new Object();
	
	TransportData transportData = new TransportData();
	transportData.setStatus(status);
	transportData.setData(data);
	
	Assert.assertNotNull(transportData);
	Assert.assertNotNull(transportData.getStatus());
	Assert.assertNotNull(transportData.getData());
	Assert.assertNotNull(new TransportData(status,data));
	}
	
}
