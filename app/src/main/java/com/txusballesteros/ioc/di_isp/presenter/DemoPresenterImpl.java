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
package com.txusballesteros.ioc.di_isp.presenter;

import com.txusballesteros.ioc.di_isp.domain.DemoInteractor;
import com.txusballesteros.ioc.di_isp.domain.Employee;
import com.txusballesteros.ioc.di_isp.view.DemoView;

import java.util.List;

public class DemoPresenterImpl implements DemoPresenter {
    private final View view;
    private final DemoInteractor interactor;

    public DemoPresenterImpl(View view, DemoInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }

    public void getEmployees() {
        List<Employee> employees = interactor.getEmployees();
        view.renderEmployees(employees);
    }
}
