/**
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.openapi.annotations.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Container annotation for repeated {@link SecurityRequirement} annotations.
 * <p>
 * Note that <em>each</em> {@code SecurityRequirement} annotation is equivalent to a {@link SecurityRequirementsSet}
 * annotation containing only that annotation.
 *
 * <pre>
 * <b>Example:</b>
 * security:
 *   - oauth_implicit: []
 *   - api_secret: []
 * </pre>
 *
 * @see <a href= "https://spec.openapis.org/oas/v3.1.0.html#security-requirement-object">OpenAPI Specification Security
 *      Requirement Object</a>
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface SecurityRequirements {
    /**
     * An array of SecurityRequirement annotations
     *
     * @return the array of the SecurityRequirement annotations
     **/
    SecurityRequirement[] value() default {};

}