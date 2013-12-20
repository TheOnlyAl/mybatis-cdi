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

import java.util.Iterator;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;

/**
 *
 * @author Frank D. Martinez [mnesarco]
 */
public class CDIUtils {

  public static SqlSessionManagerRegistry getRegistry(BeanManager beanManager, CreationalContext creationalContext) {
    Iterator<Bean<?>> beans = beanManager.getBeans(SqlSessionManagerRegistry.class).iterator();
    if (beans.hasNext()) {
      return (SqlSessionManagerRegistry) beanManager.getReference(beans.next(), SqlSessionManagerRegistry.class, creationalContext);
    }
    else {
      throw new MybatisCdiConfigurationException("There are no SqlSessionFactory producers properly configured.");
    }
  }
  
}
