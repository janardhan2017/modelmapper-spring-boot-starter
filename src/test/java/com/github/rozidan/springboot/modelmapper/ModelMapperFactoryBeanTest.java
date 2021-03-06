/**
 * Copyright (C) 2019 Idan Roz the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rozidan.springboot.modelmapper;

import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests the registration of {@link org.modelmapper.ModelMapper}.
 *
 * @author Idan Rozenfeld
 */
public class ModelMapperFactoryBeanTest {

    @Test
    public void shouldInstantiateModelMapper() throws Exception {
        final ModelMapperFactoryBean factoryBean = new ModelMapperFactoryBean();
        final ModelMapper modelMapper = factoryBean.getObject();
        assertThat(modelMapper, is(notNullValue()));
    }
}