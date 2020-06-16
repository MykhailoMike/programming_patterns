package main.java.com.mkaloshyn.structural.proxy_12;

public class ProjectRunner {

    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/rocking/realproject");
        project.run();
    }
}
