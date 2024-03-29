/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
	id("kuat.java-application-conventions")
}

dependencies {
	implementation(project(":core"))
	implementation(libs.picocli)
	annotationProcessor(libs.picocli.codegen)

	// maybe separate out an application/distribution project?
	implementation(project(":plugin-java"))
}

application {
	// Define the main class for the application.
	mainModule = "kuat.cli"
	mainClass = "kuat.cli.Main"
}
