package in.ashokit.binding;

public class Ticket {

	private Integer tickNum;
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private Integer trainNum;
	private String status;
	
	public Integer getTickNum() {
		return tickNum;
	}
	public void setTickNum(Integer tickNum) {
		this.tickNum = tickNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [tickNum=" + tickNum + ", name=" + name + ", email=" + email + ", doj=" + doj + ", from=" + from
				+ ", to=" + to + ", trainNum=" + trainNum + ", status=" + status + "]";
	}
	
}


