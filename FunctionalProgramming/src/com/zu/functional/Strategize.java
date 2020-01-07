package com.zu.functional;

interface Strategy {
    String approach(String mes);
}

class Soft implements Strategy {
    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static public String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    private Strategy strategy;
    private String msg;
    Strategize(String msg) {
        this.msg = msg;
        strategy = new Soft();
    }
    public void communicate() {
        System.out.println(strategy.approach(msg));
    }
    public void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy(){
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                msg->msg.substring(0, 5),
                Unrelated::twice
        };
        Strategize strategize = new Strategize("Hello there");
        strategize.communicate();
        for (Strategy newStrategy : strategies) {
            strategize.changeStrategy(newStrategy);
            strategize.communicate();
        }
    }
}
