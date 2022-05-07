package ood.structure.fac.exercise;

public class Demo {
    public static void main(String[] args) {
        var api = new TwitterAPI("appKey", "secret");
        var tweets = api.getRecentTweets();
    }
}
