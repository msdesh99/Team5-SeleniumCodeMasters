package configs;

public class ConfigLoader {
	private String baseUrl;
	private String premiumUser;
	private String premiumPassword;
	private String freeUser;
	private String freePassword;
	
	public void setBaseUrl(String baseUrl) {
		this.baseUrl  = baseUrl;		
	}
	public String getBaseUrl() {
		return this.baseUrl;
	}
	public String getPremiumUser() {
		return premiumUser;
	}
	public void setPremiumUser(String premiumUser) {
		this.premiumUser = premiumUser;
	}
	public String getPremiumPassword() {
		return premiumPassword;
	}
	public void setPremiumPassword(String premiumPassword) {
		this.premiumPassword = premiumPassword;
	}
	public String getFreeUser() {
		return freeUser;
	}
	public void setFreeUser(String freeUser) {
		this.freeUser = freeUser;
	}
	public String getFreePassword() {
		return freePassword;
	}
	public void setFreePassword(String freePassword) {
		this.freePassword = freePassword;
	}
	

}
