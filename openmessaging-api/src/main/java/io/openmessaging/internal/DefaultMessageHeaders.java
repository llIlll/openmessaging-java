/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging.internal;

import io.openmessaging.Message;

/**
 * The default implementation of the interface {@link Message.Headers}, used by OMS internally.
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public class DefaultMessageHeaders implements Message.Headers {

    private String destination;
    private String messageId;
    private long bornTimestamp;
    private String bornHost;
    private long storeTimestamp;
    private String storeHost;
    private long delayTime;
    private long expireTime;
    private short priority;
    private short durability;
    private String messageKey;
    private String traceId;
    private int deliveryCount;
    private String transactionId;
    private String correlationId;
    private short compression;

    @Override
    public Message.Headers setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public Message.Headers setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    @Override
    public Message.Headers setBornTimestamp(long bornTimestamp) {
        this.bornTimestamp = bornTimestamp;
        return this;
    }

    @Override
    public Message.Headers setBornHost(String bornHost) {
        this.bornHost = bornHost;
        return this;
    }

    @Override
    public Message.Headers setStoreTimestamp(long storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
        return this;
    }

    @Override
    public Message.Headers setStoreHost(String storeHost) {
        this.storeHost = storeHost;
        return this;
    }

    @Override
    public Message.Headers setDelayTime(long delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    @Override
    public Message.Headers setExpireTime(long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    @Override
    public Message.Headers setPriority(short priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public Message.Headers setDurability(short durability) {
        this.durability = durability;
        return this;
    }

    @Override
    public Message.Headers setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }

    @Override
    public Message.Headers setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    @Override
    public Message.Headers setDeliveryCount(int deliveryCount) {
        this.deliveryCount = deliveryCount;
        return this;
    }

    @Override
    public Message.Headers setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    @Override
    public Message.Headers setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    @Override
    public Message.Headers setCompression(short compression) {
        this.compression = compression;
        return this;
    }

    @Override
    public String getDestination() {
        return this.destination;
    }

    @Override
    public String getMessageId() {
        return this.messageId;
    }

    @Override
    public long getBornTimestamp() {
        return this.bornTimestamp;
    }

    @Override
    public String getBornHost() {
        return this.bornHost;
    }

    @Override
    public long getStoreTimestamp() {
        return this.storeTimestamp;
    }

    @Override
    public String getStoreHost() {
        return this.storeHost;
    }

    @Override
    public long getDelayTime() {
        return this.delayTime;
    }

    @Override
    public long getExpireTime() {
        return this.expireTime;
    }

    @Override
    public short getPriority() {
        return this.priority;
    }

    @Override
    public short getDurability() {
        return this.durability;
    }

    @Override
    public String getMessageKey() {
        return this.messageKey;
    }

    @Override
    public String getTraceId() {
        return this.traceId;
    }

    @Override
    public int getDeliveryCount() {
        return this.deliveryCount;
    }

    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    @Override
    public String getCorrelationId() {
        return this.correlationId;
    }

    @Override
    public short getCompression() {
        return this.compression;
    }
}