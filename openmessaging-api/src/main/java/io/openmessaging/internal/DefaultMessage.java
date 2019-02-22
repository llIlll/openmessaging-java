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
import io.openmessaging.OMS;

/**
 * The default implementation of the interface {@link Message}, used by OMS internally.
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public class DefaultMessage implements Message {

    private KeyValue properties;
    private Headers headers;
    private byte[] data;

    public DefaultMessage() {
        this(OMS.newKeyValue());
    }

    public DefaultMessage(KeyValue properties) {
        this(properties, new DefaultMessageHeaders(), null);
    }

    public DefaultMessage(KeyValue properties, Headers headers, byte[] data) {
        this.properties = properties;
        this.headers = headers;
        this.data = data;
    }

    @Override
    public Headers headers() {
        return headers;
    }

    public void properties(KeyValue properties) {
        this.properties = properties;
    }

    @Override
    public KeyValue properties() {
        return properties;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public void setData(byte[] data) {
        this.data = data;
    }
}