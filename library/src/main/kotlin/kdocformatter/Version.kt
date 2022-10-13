/*
 * Copyright (C) 2022 Tor Norbye
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

package kdocformatter

import java.io.BufferedInputStream
import java.util.Properties

object Version {
    var versionString: String
    init {
        val properties = Properties()
        val stream = Version::class.java.getResourceAsStream("/version.properties")
        BufferedInputStream(stream).use { buffered -> properties.load(buffered) }
        versionString = properties.getProperty("buildVersion")
    }
}
