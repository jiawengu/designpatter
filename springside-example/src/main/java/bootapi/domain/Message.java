package bootapi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@ManyToOne
	@JoinColumn(name="receiver_id")
	public Account receiver;
	
	public String message;
	public Date receiverDate;
	
	public Message(){}

	public Message(Account receiver, String message, Date receiverDate) {
		super();
		this.receiver = receiver;
		this.message = message;
		this.receiverDate = receiverDate;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
