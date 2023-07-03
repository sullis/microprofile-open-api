/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
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

package org.eclipse.microprofile.openapi.annotations.links;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a parameter to pass to an operation as specified with operationId or identified via operationRef.
 **/
@Target({})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface LinkParameter {
    /**
     * The name of this link parameter.
     *
     * @return the parameter's name
     **/
    String name() default "";

    /**
     * A constant or an expression to be evaluated and passed to the linked operation.
     *
     * @return the parameter's literal value or expression
     **/
    String expression() default "";

}
