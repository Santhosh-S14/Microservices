
package com.eazybytes.loans.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Configuration
@ConfigurationProperties(prefix = "loans")
@Getter @Setter @ToString
public class LoansServiceConfig {

	 private String msg;
	 private String buildVersion;
	 private Map<String, String> mailDetails;
	 private List<String> activeBranches;
	public Map<String, String> getMailDetails() {
		// TODO Auto-generated method stub
		return mailDetails;
	}
	public String getMsg() {
		// TODO Auto-generated method stub
		return msg;
	}
	public String getBuildVersion() {
		// TODO Auto-generated method stub
		return buildVersion;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
	public void setMailDetails(Map<String, String> mailDetails) {
		this.mailDetails = mailDetails;
	}
	public void setActiveBranches(List<String> activeBranches) {
		this.activeBranches = activeBranches;
	}
	public List<String> getActiveBranches() {
		// TODO Auto-generated method stub
		return activeBranches;
	}

}