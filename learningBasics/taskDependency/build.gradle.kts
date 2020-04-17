tasks.register("task1") {
    doLast {
        println("task1")
    }
}
tasks.register("task2") {
    doFirst {
        println("task2 doFirst")
    }
    dependsOn("task1")
    doLast {
        println("task2 doLast")
    }
}