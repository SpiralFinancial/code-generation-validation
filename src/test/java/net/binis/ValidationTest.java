package net.binis;

/*-
 * #%L
 * code-generator
 * %%
 * Copyright (C) 2021 Binis Belev
 * %%
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
 * #L%
 */

import net.binis.codegen.generation.core.Helpers;
import net.binis.codegen.test.BaseTest;
import org.apache.commons.lang3.tuple.Triple;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ValidationTest extends BaseTest {

    @Before
    public void cleanUp() {
        Helpers.cleanUp();
    }

    @Test
    public void enrichValidate() {
        testSingle("enrichValidate.java", "enrichValidate-0.java", "enrichValidate-1.java");
    }

    @Test
    public void enrichValidateModify() {
        testMulti(List.of(
                Triple.of("enrichModifySub.java", "enrichModifySub-0.java", "enrichModifySub-1.java"),
                Triple.of("enrichModify.java", "enrichModify-0.java", "enrichModify-1.java")
        ));
    }


    @Test
    public void enrichValidateCustomAnnotations() {
        testSingle("enrichValidateCustomAnnotations.java", "enrichValidateCustomAnnotations-0.java", "enrichValidateCustomAnnotations-1.java");
    }

    @Test
    public void enrichFluentWithValidate() {
        testSingle("enrichFluentWithValidate.java", "enrichFluentWithValidate-0.java", "enrichFluentWithValidate-1.java");
    }


}
