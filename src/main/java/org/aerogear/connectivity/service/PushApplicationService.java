/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aerogear.connectivity.service;

import java.util.List;

import org.aerogear.connectivity.model.AndroidApplication;
import org.aerogear.connectivity.model.PushApplication;
import org.aerogear.connectivity.model.SimplePushApplication;
import org.aerogear.connectivity.model.iOSApplication;

public interface PushApplicationService {
    
    PushApplication addPushApplication(PushApplication pushApp);
    List<PushApplication> findAllPushApplications();
    PushApplication findPushApplicationById(String id);
    
    void addiOSApplication(PushApplication pushApp, iOSApplication iOSapp);
    void addAndroidApplication(PushApplication pushApp, AndroidApplication androidApp);
    void addSimplePushApplication(PushApplication pushApp, SimplePushApplication simplePushApp);
    
    List<iOSApplication> alliOSApplicationsForPushApplication(PushApplication pushApp);
    List<AndroidApplication> allAndroidApplicationsForPushApplication(PushApplication pushApp);
    List<SimplePushApplication> allSimplePushApplicationsForPushApplication(PushApplication pushApp);
}