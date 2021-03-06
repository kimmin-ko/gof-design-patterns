package com.study.designpatterns.yunjin_choi._5_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * com.study.designpatterns.yunjin_choi._5_prototype_pattern
 *      App
 * </pre>
 *
 * @author YunJin Choi(zzdd1558@gmail.com)
 * @since 2022-04-12 오후 11:43
 */

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository("YunNote", "최윤진");
        GithubIssue githubIssue = new GithubIssue(1, "feature: Prototype Pattern", repository);

        System.out.println(githubIssue.getUrl());

        GithubIssue newIssue = (GithubIssue)githubIssue.clone();
        System.out.println(newIssue.getUrl());
    }
}
