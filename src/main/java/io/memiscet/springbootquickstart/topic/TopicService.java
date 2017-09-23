package io.memiscet.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List <Topic> topics =  new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework1","Spring Framework Description"),
			new Topic("java","Spring Framework2","Spring Framework Description"),
			new Topic("Spring2","Spring Framework3","Spring Framework Description"),
			new Topic("Spring3","Spring Framework4","Spring Framework Description")
			));
	
	public List<Topic> getAllTopics() {
		
		return topics;
		
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(Topic topic) {
topics.add(topic);		
	}
	
}
