/* ###
 * IP: GHIDRA
 * REVIEWED: YES
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
package ghidra.util;

import ghidra.util.exception.UsrException;

/**
 * Exception thrown if user is not the owner of a file or
 * data object being accessed.
 */
public class NotOwnerException extends UsrException {

    /**
     * Default constructor.
     */
    public NotOwnerException() {
        super("User is not the owner");
    }

    /**
     * Constructor
     * @param msg detailed message explaining exception.
     */
    public NotOwnerException(String msg) {
        super(msg);
    }
}
