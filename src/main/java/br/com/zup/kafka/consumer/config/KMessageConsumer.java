package br.com.zup.kafka.consumer.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface KMessageConsumer<K, V> {

    void consume(Integer threadId, ConsumerRecord<K, V> consumerRecord);
}