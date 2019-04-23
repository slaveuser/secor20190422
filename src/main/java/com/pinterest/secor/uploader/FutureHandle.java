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
package com.pinterest.secor.uploader;

import java.util.concurrent.Future;

/**
 * Wraps a Future. `get` blocks until the underlying Future completes.
 *
 * @author Liam Stewart (liam.stewart@gmail.com)
 */
public class FutureHandle<T> implements Handle<T> {
    private Future<T> mFuture;

    public FutureHandle(Future<T> f) {
        mFuture = f;
    }

    public T get() throws Exception {
        return mFuture.get();
    }
}
