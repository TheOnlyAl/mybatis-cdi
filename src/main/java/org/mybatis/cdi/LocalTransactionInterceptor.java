/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mybatis.cdi;

import javax.interceptor.Interceptor;

/**
 * Best-effort interceptor for local transactions.
 * 
 * @author Frank David Martínez 
 */
@Transactional
@Interceptor
public class LocalTransactionInterceptor extends AbstractTransactionInterceptor {

  @Override
  protected void start() throws Exception {
  }

  @Override
  protected void commit() throws Exception {
  }

  @Override
  protected void rollback() throws Exception {
  }

}
