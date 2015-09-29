/*
 * Copyright Txus Ballesteros 2015 (@txusballesteros)
 *
 * This file is part of some open source application.
 *
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
 *
 * Contact: Txus Ballesteros <txus.ballesteros@gmail.com>
 */
package com.txusballesteros.ioc.di_isp_dagger;

import com.txusballesteros.ioc.UnitTest;
import com.txusballesteros.ioc.di_isp_dagger.domain.Employee;
import com.txusballesteros.ioc.di_isp_dagger.model.DemoRepository;
import com.txusballesteros.ioc.di_isp_dagger.model.DemoRepositoryImpl;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class DemoRepositoryTest extends UnitTest {
    private DemoRepository repository;

    @Override
    public void onBefore() {
        repository = new DemoRepositoryImpl();
    }

    @Test
    public void shouldGetEmployees() {
        List<Employee> employees = repository.getEmployees();

        assertEquals(employees, Collections.EMPTY_LIST);
    }
}