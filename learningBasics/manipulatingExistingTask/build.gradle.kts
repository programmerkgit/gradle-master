repeat(4) {
    tasks.register("tasks$it") {
        doLast {
            println("tasks$it")
        }
    }
}

tasks.named("tasks1") {
    dependsOn("tasks2", "tasks3")
}