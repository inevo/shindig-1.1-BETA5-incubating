/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.shindig.common.util;

import org.apache.commons.lang.ArrayUtils;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Utilities for dealing with character set encoding.
 */
public class CharsetUtil {

  /**
   * UTF-8 Charset.
   */
  public static final Charset UTF8 = Charset.forName("UTF-8");

  /**
   * @return UTF-8 byte array for the input string.
   */
  public static byte[] getUtf8Bytes(String s) {
    if (s == null) {
      return ArrayUtils.EMPTY_BYTE_ARRAY;
    }
    ByteBuffer bb = UTF8.encode(s);
    return ArrayUtils.subarray(bb.array(), 0, bb.limit());
    
  }
}
