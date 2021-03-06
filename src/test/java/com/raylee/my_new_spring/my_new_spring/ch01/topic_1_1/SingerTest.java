package com.raylee.my_new_spring.my_new_spring.ch01.topic_1_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"/com/raylee/my_new_spring/my_new_spring/ch01/topic_1_1/ApplicationContext-test.xml" })
public class SingerTest {
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void testJackSinger() {
		Singer singer = (Singer) applicationContext.getBean("jack");
		singer.singTheSong();
	}

	@Test
	public void testRoseSinger() {
		Singer singer = (Singer) applicationContext.getBean("rose");
		singer.singTheSong();
	}

}
