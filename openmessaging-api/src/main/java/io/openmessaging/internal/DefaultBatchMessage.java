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

import io.openmessaging.BatchMessage;
import io.openmessaging.Message;

import java.util.List;

/**
 * The default implementation of the interface {@link BatchMessage}, used by OMS internally.
 *
 * @version OMS 1.0.0
 * @since OMS 1.0.0
 */
public class DefaultBatchMessage implements BatchMessage {

    private List<Message> messages;

    public DefaultBatchMessage() {

    }

    public DefaultBatchMessage(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public List<Message> messages() {
        return messages;
    }
}