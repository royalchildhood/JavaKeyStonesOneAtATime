package leetcode.tag.type;

import leetcode.tag.Tag;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target({TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("ForwardBackward")
public @interface ForwardBackward {
}
