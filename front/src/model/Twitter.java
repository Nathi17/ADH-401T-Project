package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="twitter")
@SessionScoped
public class Twitter {
	
	private String TweetBody;
	private String timestamp;
	private String TweetID;
	private String tID;
	private String tBody;
	
	
	
	public String gettID() {
		return tID;
	}
	public void settID(String tID) {
		this.tID = tID;
	}
	public String gettBody() {
		return tBody;
	}
	public void settBody(String tBody) {
		this.tBody = tBody;
	}
	public String getTweetBody() {
		return TweetBody;
	}
	public void setTweetBody(String tweetBody) {
		TweetBody = tweetBody;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTweetID() {
		return TweetID;
	}
	public void setTweetID(String tweetID) {
		TweetID = tweetID;
	}
	
	public TwitterEntity getEntity()
	{
		TwitterEntity twitterentity = new TwitterEntity();
		twitterentity.settBody(tBody);
		twitterentity.settID(tID);
		twitterentity.setTimestamp(timestamp);
		return twitterentity;
	}
}
