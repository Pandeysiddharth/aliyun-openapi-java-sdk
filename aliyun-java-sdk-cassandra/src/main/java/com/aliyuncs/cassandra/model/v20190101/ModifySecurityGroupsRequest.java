/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cassandra.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityGroupsRequest extends RpcAcsRequest<ModifySecurityGroupsResponse> {
	   

	private String clusterId;

	private String securityGroupIds;
	public ModifySecurityGroupsRequest() {
		super("Cassandra", "2019-01-01", "ModifySecurityGroups", "Cassandra");
		setMethod(MethodType.POST);
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(String securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
		if(securityGroupIds != null){
			putQueryParameter("SecurityGroupIds", securityGroupIds);
		}
	}

	@Override
	public Class<ModifySecurityGroupsResponse> getResponseClass() {
		return ModifySecurityGroupsResponse.class;
	}

}
