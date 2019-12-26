package com.zy.basic;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    public Object process(Object input) {
        return input;
    }
}

class UpCaseProcessor extends Processor {
    @Override
    public String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class DownCaseProcessor extends Processor {
    @Override
    public String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Applicator {
    static void apply(Processor processor, Object input) {
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(input));
    }

    public static void main(String[] args) {
        String s = "We are such stuff as dream as made on";
        apply(new UpCaseProcessor(), s);
        apply(new DownCaseProcessor(), s);
        apply(new Splitter(), s);
    }
}
