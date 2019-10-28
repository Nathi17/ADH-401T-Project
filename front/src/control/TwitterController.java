package control;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Twitter;
import service.TwitterEJB;

@ManagedBean(name="twittercontroller")
@SessionScoped
public class TwitterController {
	
	@EJB
	TwitterEJB twitterservice;
	
	@ManagedProperty(value="#{twitter}")
	public Twitter twitter;

	public Twitter getTwitter() {
		return twitter;
	}

	public void setTwitter(Twitter twitter) {
		this.twitter = twitter;
	}
	
	public void sendMessage()
	{
		System.out.println("HELLO FRONT END TWITTER"+"  "+twitter.getTimestamp()+" "+twitter.gettID()+" "+twitter.gettBody());
		twitterservice.addNew(twitter.getEntity());
		
		
	}
}
