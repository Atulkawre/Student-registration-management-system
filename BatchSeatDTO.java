package bean;

public class BatchSeatDTO {

	private int bId;
	private int cId;
	private int totalSeats;
	private int seatsFilled;
	
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getSeatsFilled() {
		return seatsFilled;
	}
	public void setSeatsFilled(int seatsFilled) {
		this.seatsFilled = seatsFilled;
	}
	public BatchSeatDTO(int bId, int cId, int totalSeats, int seatsFilled) {
		super();
		this.bId = bId;
		this.cId = cId;
		this.totalSeats = totalSeats;
		this.seatsFilled = seatsFilled;
	}
	public BatchSeatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "BatchSeatDTO [bId=" + bId + ", cId=" + cId + ", totalSeats=" + totalSeats + ", seatsFilled="
				+ seatsFilled + "]";
	}
	
	
}
