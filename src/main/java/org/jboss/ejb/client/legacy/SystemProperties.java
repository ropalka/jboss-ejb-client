/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2021 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
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
package org.jboss.ejb.client.legacy;

/**
 * System properties being used in this package.
 *
 * @author <a href="mailto:ropalka@redhat.com">Richard Opálka</a>
 */
final class SystemProperties {

    static final String EXPAND_PASSWORDS = "jboss-ejb-client.expandPasswords";
    static final String PROPERTIES_FILE_PATH = "jboss.ejb.client.properties.file.path";
    static final String QUIET_AUTH = "jboss.sasl.local-user.quiet-auth";
    static final String USER_DIR = "user.dir";

    private SystemProperties() {
        // forbidden instantiation
    }

}
