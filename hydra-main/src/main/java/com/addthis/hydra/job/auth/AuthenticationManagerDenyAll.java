/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.addthis.hydra.job.auth;

import com.google.common.collect.ImmutableList;

public class AuthenticationManagerDenyAll extends AuthenticationManager {

    @Override String login(String username, String password) {
        return null;
    }

    @Override User authenticate(String username, String secret) {
        return null;
    }

    @Override protected User getUser(String username) {
        return null;
    }

    @Override void logout(User user) {
    }

    @Override ImmutableList<String> adminGroups() {
        return ImmutableList.of();
    }

    @Override ImmutableList<String> adminUsers() {
        return ImmutableList.of();
    }
}