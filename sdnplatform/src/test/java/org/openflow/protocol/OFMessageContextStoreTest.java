/*
 * Copyright (c) 2013 Big Switch Networks, Inc.
 * Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University 
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the
 * "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.openflow.protocol;

import junit.framework.TestCase;

public class OFMessageContextStoreTest extends TestCase {
    public void testStoreAndGet() {
        OFMessage msg = new OFMessage();
        OFMessageContextStore<String> store = new OFMessageContextStore<String>(msg, this.getName());
        String key = "mykey";
        String value = "myvalue";
        store.put(key, value);
        TestCase.assertEquals(value, store.get(key));
    }
}
