package com.in28minutes.video;

import org.springframework.stereotype.Service;
import com.in28minutes.model.Video;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class VideoService {
	
	private static List<Video> videos = new ArrayList<Video>();
	private static int videoCount = 3;

	static {
		videos.add(new Video(1, "teja", "Learn Spring MVC", new Date(),
				false));
		videos.add(new Video(2, "teja", "Learn Spring Boot", new Date(), false));
		videos.add(new Video(3, "teja", "Learn AngularJs", new Date(),
				false));
	}

	public List<Video> retrieveVideos(String user) {
		List<Video> filteredVideos = new ArrayList<Video>();
		for (Video video : videos) {
			if (video.getUser().equals(user))
				filteredVideos.add(video);
		}
		return filteredVideos;
	}

	public void addVideo(String name, String desc, Date targetDate, boolean isDone) {
		videos.add(new Video(++videoCount, name, desc, targetDate, isDone));
	}

	public void deleteVideo(int id) {
		Iterator<Video> iterator = videos.iterator();
		while (iterator.hasNext()) {
			Video video = iterator.next();
			if (video.getId() == id) {
				iterator.remove();
			}
		}
	}

}
