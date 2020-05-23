package 挑战程序设计竞赛;

import java.lang.annotation.Repeatable;

public class Annotation {
}

@Hint("hint1")
@Hint("hint2")
class Person2 {
}


@interface Hints {
    Hint[] value();
}

@Repeatable(Hints.class)
@interface Hint {
    String value();
}