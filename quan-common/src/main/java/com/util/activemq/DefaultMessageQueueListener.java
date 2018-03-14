package com.util.activemq;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class DefaultMessageQueueListener implements MessageListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultMessageQueueListener.class);

	@Autowired
	ThreadPoolTaskExecutor threadPoolTaskExecutor;

	@Override
	public void onMessage(Message message) {
		// 使用线程池多线程处理
		threadPoolTaskExecutor.execute(new Runnable() {
			@Override
			public void run() {
				if (message instanceof TextMessage) {
					TextMessage textMessage = (TextMessage) message;
					try {
						LOGGER.info("消费：{}", textMessage.getText());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

}
