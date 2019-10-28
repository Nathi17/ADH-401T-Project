package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ADH401TDS")
public class TwitterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String tID;
	private String timestamp;
	private String tBody;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String gettBody() {
		return tBody;
	}
	public void settBody(String tBody) {
		this.tBody = tBody;
	}
	
	
}
