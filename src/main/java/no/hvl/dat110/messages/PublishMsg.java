package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 

	
		
		String topic;
		String message;

		public PublishMsg(String user, String topic, String message) {
			super(MessageType.PUBLISH, user);
			this.message = message;
			this.topic = topic;

	}

	// TODO:
	// Implement object variables - a topic and a message is required

	// Complete the constructor, get/set-methods, and toString method
		
		
		public String getTopic() {
			return topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		@Override
		public String toString() {
			return "PublishMsg {" +
					"topic='" + topic + '\'' +
					", message='" + message + '\'' +
					'}';
		}
	// as described in the project text
	
	public String getMessage() {
		
		
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		
	
	
		
		//throw new UnsupportedOperationException(TODO.method());
	}
}
