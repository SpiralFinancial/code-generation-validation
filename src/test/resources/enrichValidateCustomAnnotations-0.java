/*Generated code by Binis' code generator.*/
package net.binis.codegen;

import net.binis.codegen.validation.validator.RegExValidator;
import net.binis.codegen.validation.validator.RangeValidator;
import net.binis.codegen.validation.validator.NullValidator;
import net.binis.codegen.validation.validator.LambdaValidator;
import net.binis.codegen.validation.sanitizer.TrimSanitizer;
import net.binis.codegen.validation.sanitizer.ReplaceSanitizer;
import net.binis.codegen.validation.sanitizer.LambdaSanitizer;
import net.binis.codegen.validation.flow.Validation;
import net.binis.codegen.validation.executor.LambdaExecutor;
import net.binis.codegen.modifier.Modifiable;
import net.binis.codegen.collection.CodeSetImpl;
import net.binis.codegen.collection.CodeSet;
import net.binis.codegen.collection.CodeListImpl;
import net.binis.codegen.collection.CodeList;
import lombok.Data;
import javax.annotation.processing.Generated;
import java.util.Set;
import java.util.List;

@Generated(value = "TestPrototype", comments = "Test")
@Data
public class TestImpl implements Test, Modifiable<Test.Modify> {

    protected int amount;

    protected String email;

    protected String field;

    protected String field1;

    protected List<Long> list;

    protected Set<Long> set;

    protected String title;

    public TestImpl() {
    }

    public int getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public String getField() {
        return field;
    }

    public String getField1() {
        return field1;
    }

    public List<Long> getList() {
        return list;
    }

    public Set<Long> getSet() {
        return set;
    }

    public String getTitle() {
        return title;
    }

    public void setAmount(int amount) {
        Validation.start("amount", amount).validate(RangeValidator.class, "(%s) Value %f is not in range [%f, %f]", 0, 10).perform(v -> this.amount = v);
    }

    public void setEmail(String email) {
        Validation.start("email", email).sanitize(ReplaceSanitizer.class, "\\s+", "_").validate(RegExValidator.class, "Invalid Email!", "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").perform(v -> this.email = v);
    }

    public void setField(String field) {
        Validation.start("field", field).validate(LambdaValidator.class, "Value can't be blank!", ((java.util.function.Predicate<String>) org.apache.commons.lang3.StringUtils::isNotBlank)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) String::toLowerCase)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) String::toUpperCase)).perform(v -> this.field = v);
    }

    public void setField1(String field1) {
        Validation.start("field1", field1).validate(LambdaValidator.class, "Invalid value!", ((java.util.function.Predicate<String>) v -> true)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) v -> v)).execute(LambdaExecutor.class, "Invalid value!", ((java.util.function.Consumer<String>) v -> {
        })).perform(v -> this.field1 = v);
    }

    public void setList(List<Long> list) {
        Validation.start("list", list).validate(NullValidator.class, "Value can't be null").perform(v -> this.list = v);
    }

    public void setSet(Set<Long> set) {
        Validation.start("set", set).validate(RegExValidator.class, "Test", "^$").perform(v -> this.set = v);
    }

    public void setTitle(String title) {
        Validation.start("title", title).sanitize(ReplaceSanitizer.class, "\\s+", "").sanitize(TrimSanitizer.class, null).perform(v -> this.title = v);
    }

    public Test.Modify with() {
        return new TestModifyImpl();
    }

    protected class TestModifyImpl implements Test.Modify {

        public Test.Modify amount(int amount) {
            Validation.start("amount", amount).validate(RangeValidator.class, "(%s) Value %f is not in range [%f, %f]", 0, 10).perform(v -> TestImpl.this.amount = v);
            return this;
        }

        public Test done() {
            return TestImpl.this;
        }

        public Test.Modify email(String email) {
            Validation.start("email", email).sanitize(ReplaceSanitizer.class, "\\s+", "_").validate(RegExValidator.class, "Invalid Email!", "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$").perform(v -> TestImpl.this.email = v);
            return this;
        }

        public Test.Modify field(String field) {
            Validation.start("field", field).validate(LambdaValidator.class, "Value can't be blank!", ((java.util.function.Predicate<String>) org.apache.commons.lang3.StringUtils::isNotBlank)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) String::toLowerCase)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) String::toUpperCase)).perform(v -> TestImpl.this.field = v);
            return this;
        }

        public Test.Modify field1(String field1) {
            Validation.start("field1", field1).validate(LambdaValidator.class, "Invalid value!", ((java.util.function.Predicate<String>) v -> true)).sanitize(LambdaSanitizer.class, null, ((java.util.function.Function<String, String>) v -> v)).execute(LambdaExecutor.class, "Invalid value!", ((java.util.function.Consumer<String>) v -> {
            })).perform(v -> TestImpl.this.field1 = v);
            return this;
        }

        public Test.Modify list(List<Long> list) {
            Validation.start("list", list).validate(NullValidator.class, "Value can't be null").perform(v -> TestImpl.this.list = v);
            return this;
        }

        public CodeList<Long, Test.Modify> list() {
            if (TestImpl.this.list == null) {
                TestImpl.this.list = new java.util.ArrayList<>();
            }
            return new CodeListImpl<>(this, TestImpl.this.list);
        }

        public Test.Modify set(Set<Long> set) {
            Validation.start("set", set).validate(RegExValidator.class, "Test", "^$").perform(v -> TestImpl.this.set = v);
            return this;
        }

        public CodeSet<Long, Test.Modify> set() {
            if (TestImpl.this.set == null) {
                TestImpl.this.set = new java.util.HashSet<>();
            }
            return new CodeSetImpl<>(this, TestImpl.this.set);
        }

        public Test.Modify title(String title) {
            Validation.start("title", title).sanitize(ReplaceSanitizer.class, "\\s+", "").sanitize(TrimSanitizer.class, null).perform(v -> TestImpl.this.title = v);
            return this;
        }
    }
}
