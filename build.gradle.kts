plugins {
    java
}
repositories {
    mavenCentral()
}
dependencies {
    implementation("com.squareup:javapoet:1.13.0")
    implementation("org.apache.commons:commons-text:1.9")

    testImplementation("junit:junit:4.13.1")
    testImplementation("com.google.truth:truth:1.1")
    testImplementation("com.google.truth.extensions:truth-java8-extension:1.1")
}
tasks.register("generate-html-dsl", JavaExec::class) {
    group = "Application"
    mainClass.set("com.meetinclass.html.HtmlDslGenerator")
    args = listOf(project.sourceSets["main"].java.srcDirs.joinToString(":"))
    classpath = sourceSets.main.get().runtimeClasspath
}
