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

import io.openmessaging.KeyValue;
import io.openmessaging.Message;

/**
 * build a default and internal {@code Message} implementation instance.
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public class MessageBuilder {

    private KeyValue properties;
    private byte[] data;

    public static MessageBuilder newInstance() {
        return new MessageBuilder();
    }

    public MessageBuilder properties(KeyValue properties) {
        this.properties = properties;
        return this;
    }

    public MessageBuilder data(byte[] data) {
        this.data = data;
        return this;
    }

    public Message build() {
        DefaultMessage message = new DefaultMessage();
        message.properties(properties);
        message.setData(data);
        return message;
    }
}