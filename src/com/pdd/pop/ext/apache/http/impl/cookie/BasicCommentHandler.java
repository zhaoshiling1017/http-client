/*
 * ====================================================================
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
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package com.pdd.pop.ext.apache.http.impl.cookie;

import com.pdd.pop.ext.apache.http.annotation.Contract;
import com.pdd.pop.ext.apache.http.annotation.ThreadingBehavior;
import com.pdd.pop.ext.apache.http.cookie.ClientCookie;
import com.pdd.pop.ext.apache.http.cookie.CommonCookieAttributeHandler;
import com.pdd.pop.ext.apache.http.cookie.MalformedCookieException;
import com.pdd.pop.ext.apache.http.cookie.SetCookie;
import com.pdd.pop.ext.apache.http.util.Args;

/**
 *
 * @since 4.0
 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class BasicCommentHandler extends AbstractCookieAttributeHandler implements CommonCookieAttributeHandler {

    public BasicCommentHandler() {
        super();
    }

    @Override
    public void parse(final SetCookie cookie, final String value)
            throws MalformedCookieException {
        Args.notNull(cookie, "Cookie");
        cookie.setComment(value);
    }

    @Override
    public String getAttributeName() {
        return ClientCookie.COMMENT_ATTR;
    }

}