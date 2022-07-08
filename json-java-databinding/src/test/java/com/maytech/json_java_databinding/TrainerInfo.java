package com.maytech.json_java_databinding;

public class TrainerInfo {
	private String batchName;
	private String trainer;
	private String time;
	
	@Override
	public String toString() {
		return "TrainerInfo [batchName=" + batchName + ", trainer=" + trainer + ", time=" + time + "]";
	}
	public String getbatchName() {
		return batchName;
	}
	public void setbatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
