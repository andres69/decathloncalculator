package andres.decathlon.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResultSheet {

	private String hundredMeterRun;
	private String longJump;
	private String shotPut;
	private String highJump;
	private String fourHundredMeterRun;
	private String hurdles;
	private String discusThrow;
	private String poleVault;
	private String javelinThrow;
	private String oneThousandFiveHundredMeterRun;
	private String score;
	
	public ResultSheet (String hundredMeterRun, String longJump, String shotPut, String highJump, String fourHundredMeterRun, String hurdles, 
			String discusThrow, String poleVault, String javelinThrow, String oneThousandFiveHundredMeterRun) {
		this.hundredMeterRun = hundredMeterRun;
		this.longJump = longJump;
		this.shotPut = shotPut;
		this.highJump = highJump;
		this.fourHundredMeterRun = fourHundredMeterRun;
		this.hurdles = hurdles;
		this.discusThrow = discusThrow;
		this.poleVault = poleVault;
		this.javelinThrow = javelinThrow;
		this.oneThousandFiveHundredMeterRun = oneThousandFiveHundredMeterRun;
	}
	
	public String getHundredMeterRun() {
		return hundredMeterRun;
	}
	
	public void setHundredMeterRun(String hundredMeterRun) {
		this.hundredMeterRun = hundredMeterRun;
	}
	
	public String getLongJump() {
		return longJump;
	}
	
	public void setLongJump(String longJump) {
		this.longJump = longJump;
	}
	
	public String getShotPut() {
		return shotPut;
	}
	
	public void setShotPut(String shotPut) {
		this.shotPut = shotPut;
	}
	
	public String getHighJump() {
		return highJump;
	}
	
	public void setHighJump(String highJump) {
		this.highJump = highJump;
	}
	
	public String getFourHundredMeterRun() {
		return fourHundredMeterRun;
	}
	
	public void setFourHundredMeterRun(String fourHundredMeterRun) {
		this.fourHundredMeterRun = fourHundredMeterRun;
	}
	
	public String getHurdles() {
		return hurdles;
	}
	
	public void setHurdles(String hurdles) {
		this.hurdles = hurdles;
	}
	
	public String getDiscusThrow() {
		return discusThrow;
	}
	
	public void setDiscusThrow(String discusThrow) {
		this.discusThrow = discusThrow;
	}
	
	public String getPoleVault() {
		return poleVault;
	}
	
	public void setPoleVault(String poleVault) {
		this.poleVault = poleVault;
	}
	
	public String getJavelinThrow() {
		return javelinThrow;
	}
	
	public void setJavelinThrow(String javelinThrow) {
		this.javelinThrow = javelinThrow;
	}
	
	public String getOneThousandFiveHundredMeterRun() {
		return oneThousandFiveHundredMeterRun;
	}
	
	public void setOneThousandFiveHundredMeterRun(String oneThousandFiveHundredMeterRun) {
		this.oneThousandFiveHundredMeterRun = oneThousandFiveHundredMeterRun;
	}
	
	public String getScore() {
		return score;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
}
